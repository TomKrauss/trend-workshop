//
// BasicShoppingServiceBean.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.service;

import java.util.List;

import de.gebit.trend.bo.BOFactory;
import de.gebit.trend.bo.BusinessObjectToValueObjectMapper;
import de.gebit.trend.bo.persistence.PersistenceException;
import de.gebit.trend.exception.TrendFailureException;
import de.gebit.trend.model.annotations.*;
import de.gebit.trend.service.ServiceException;
import de.gebit.trend.workshop.activities.ProductVM;
import de.gebit.trend.workshop.bo.Customer;
import de.gebit.trend.workshop.bo.Product;

/**
 *
 * @author Tom
 * @version 20 Jan 2022
 */
@Stereotype("ServiceBean")
public class BasicShoppingServiceBean extends de.gebit.trend.service.AbstractBusinessServiceBean implements ShoppingServiceBean {

	@Override
	@Stereotype("BusinessTransaction")
	public void createCustomer(String aFirstname, String anAddress) {
		Customer tCustomer = BOFactory.createBusinessObjectInitialized(Customer.class);
		getWorkspace().save(tCustomer);
		
		tCustomer.setFirstname(aFirstname);
		tCustomer.setLastname("Miller");
		String[] tParts = anAddress.split(",");
		if (tParts.length >= 3) {
			tCustomer.setCity(tParts[0]);
			tCustomer.setStreet(tParts[1]);
			tCustomer.setZipCode(tParts[2]);
		} else {
			throw new ServiceException(BasicShoppingServiceBean.class, this, 4711, "Illegal customer address format. 3 parts delimited by , needed");
		}
	}
	
	@Stereotype("BusinessRequest")
	public List<ProductVM> getProducts() throws TrendFailureException, IllegalStateException {
		List<Product> tProducts = getWorkspace().selectAll(Product.class);
		return new BusinessObjectToValueObjectMapper().mapToResultCollection(tProducts, ProductVM.class);
	}
}
