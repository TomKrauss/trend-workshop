//
// DataCreationApplication.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.security.auth.login.LoginException;

import org.slf4j.Logger;

import de.gebit.trend.bo.BOFactory;
import de.gebit.trend.bo.persistence.PersistenceFactory;
import de.gebit.trend.bo.persistence.Query;
import de.gebit.trend.bo.persistence.Transaction;
import de.gebit.trend.bo.persistence.cursor.JdbcSessionCursor;
import de.gebit.trend.bo.persistence.cursor.JdbcSessionQuery;
import de.gebit.trend.config.TrendConfiguration;
import de.gebit.trend.exception.TrendFailureException;
import de.gebit.trend.model.ModelManager;
import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.security.login.LogonData;
import de.gebit.trend.security.login.SessionLoginHelper;
import de.gebit.trend.service.ServiceFactory;
import de.gebit.trend.tools.util.RepositoryManager;
import de.gebit.trend.workshop.service.ShoppingServiceBean;


/**
 * This console application creates some test data using the TREND access
 * layer. It logs into a TREND session named "H2" and loads the
 * TREND model as configured in the TREND configuration.
 * <p>
 * It can be used to implement a test data creation facility or to simply
 * play around and test some TREND features not related to UI.
 *
 * @author Tom
 * @version 20 Jan 2022
 */
@Stereotype("MainClass")
public class DataCreationApplication {
    // The logical TREND session name of the session on which
    // the sample data is created
    protected String session = "H2";
    private String userName = "sa";
    // !! Change this and do not leave the password hard-coded as a string in the code !!
    private String pwx = "sa";
    protected Logger moduleLogger = de.gebit.trend.logger.Factory.theFactory().getLogger("DataCreationApplication");

    /**
     * Initializes the application, loading the corresponding model
     * and logging into the right TREND session.
     */
    protected void initialize() throws LoginException, TrendFailureException {
        // The first method to be called in TREND applications to ensure
        // proper initialization of factories, weavers, ...
        TrendConfiguration.init();

        // initialize the TREND model
        ModelManager.theManager().initializeModel();

        // Logon to a TREND session. If you have configured a login in your
        // session configuration this step is not necessary and can be
        // skipped!
        // For flat file sessions the user information given below is ignored.
        LogonData tempUserLogon = new LogonData(userName, pwx);
        SessionLoginHelper.loginToSession(tempUserLogon, session, true);
        // If you see a syntax error here, add the dependency to trend-tools
        // To use the standard BO session configuration, you may remove this line.
        RepositoryManager.theManager().useSessionForAllClasses(session);

        moduleLogger.info("Successfully logged on to session '" + session + "'.");
    }

    /**
     * This method creates the actual test data. The source contained
     * can be used as a sample.
     */
    protected void createObjects() throws TrendFailureException {
        try (Transaction tempTransaction = PersistenceFactory.createTransaction()) {
        	
        	Query<Product> tQuery = PersistenceFactory.createQuery(Product.class, Product.NAME_FIELD + " == ?");
        	tQuery.setParameter(1, "IPhone");
        	Product tempProduct = tempTransaction.select(tQuery).first();
        	if (tempProduct == null) {
            	tempProduct = BOFactory.createBusinessObjectInitialized(Product.class);
            	tempProduct.setName("IPhone");
            	tempProduct.setPrice(new BigDecimal("1222.99"));
            	tempProduct.setDescription("Newest one");
            	tempProduct.setProductCategory(ProductCategoryEnum.ELECTRONICS);

            	tempTransaction.save(tempProduct);
          	} else {
          		moduleLogger.info("IPonoe already present");
          	}

        	if (false) {
        	Customer tCustomer;
        	tCustomer = BOFactory.createBusinessObjectInitialized(Customer.class);
        	tCustomer.setFirstname("Tom");
        	tCustomer.setLastname("Kr.");
        	tCustomer.setCity("Berlin");
        	tCustomer.setStreet("Street");
        	tCustomer.setZipCode("11111");
        	tempTransaction.save(tCustomer);
        	
        	Basket tBasket = BOFactory.createBusinessObjectInitialized(Basket.class);
        	tCustomer.getBasket().add(tBasket);
        	
        	BasketPosition tPosition = BOFactory.createBusinessObjectInitialized(BasketPosition.class);
        	tPosition.setProduct(tempProduct);
        	tBasket.getBasketPositions().add(tPosition);
        	}
        	
            tempTransaction.commit();
        }
        
        moduleLogger.info("Successfully created the test data");
    }

    public void testSessionCursor() throws IllegalStateException, NoSuchElementException, TrendFailureException {
		JdbcSessionQuery tempQuery = de.gebit.trend.bo.persistence.cursor.Factory.theFactory().createQuery();
		tempQuery.addCorrelationFor("p", Product.class);
		tempQuery.setPseudoSQL("select avg($p.price) from $p");
		try (JdbcSessionCursor<HashMap> tempCursor = de.gebit.trend.bo.persistence.cursor.Factory.theFactory()
				.createSessionCursor(tempQuery, HashMap.class, "averagePrice")) {
			tempCursor.start();
			while (tempCursor.hasMoreObjects()) {
				Map tempMap = tempCursor.nextObject();
				System.out.println(tempMap);
			}
			tempCursor.endTransaction();
		}
	}

    protected void invokeService() {
    	try (ShoppingServiceBean tBean = ServiceFactory.createBusinessServiceBean(ShoppingServiceBean.class)) {
    		tBean.createCustomer("Hans", "Munich,Stachus,87645");
    	}
    }
    
    /**
     * Main entry point into our console application, which will create
     * the sample data.
     */
    public static void main(java.lang.String[] someArgs) throws LoginException, TrendFailureException {
        DataCreationApplication tempApplication = new DataCreationApplication();

        if (someArgs.length >= 2 && "-session".equals(someArgs[0])) {
            tempApplication.session = someArgs[1];
        }
        tempApplication.initialize();
//        tempApplication.createObjects();
//        tempApplication.testSessionCursor();
        tempApplication.invokeService();
    }
}
