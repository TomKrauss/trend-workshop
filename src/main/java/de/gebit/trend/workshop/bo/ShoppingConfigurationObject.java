//
// ShoppingConfigurationObject.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import de.gebit.trend.config.ConfigurationInjector;
import de.gebit.trend.config.DynamicConfigurationBean;
import de.gebit.trend.management.ManagementAgent;
import de.gebit.trend.management.Singleton;
import de.gebit.trend.model.annotations.ConfigurationObject;
import de.gebit.trend.model.annotations.ConfigurationProperty;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 * TODO Documentation of Shopping Configuration object here.
 *
 * @author Tom
 * @version 20 Jan 2022
 */
@Interface(false)
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_VALUE_OBJECT)
@ConfigurationObject(value="Shopping Configuration", sourceID="workshop.shopping")
public class ShoppingConfigurationObject implements java.io.Serializable {

	//
	// --- Configuration properties ---
	//
	// Getter and Setter are automatically generated if part of ModelLoader !
	//

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "defaultProductCategory")
	public static final String DEFAULT_PRODUCT_CATEGORY_FIELD = "defaultProductCategory";


	/**
	 * (T) Documentation of the property here.
	 */
	@ConfigurationProperty(propertyName = "d-p-c")
	private ProductCategoryEnum defaultProductCategory = ProductCategoryEnum.HOUSEHOLD;


	/**
	 * The singleton configuration instance.
	 */
	private static ShoppingConfigurationObject singleton;

	/**
	 * On creation perform the injection of all configuration properties in this
	 * configuration object.
	 */
	protected ShoppingConfigurationObject() {
		ConfigurationInjector tempInjector = de.gebit.trend.config.Factory.theFactory()
				.createConfigurationInjector();
		tempInjector.injectConfigurationInto(this);

		// uncomment this if you want the configuration available as an JMX MBean
		//
		 Singleton.theManagementAgent().registerBean(
		 		new DynamicConfigurationBean(this, this),
		 		"Shopping Configuration", ManagementAgent.MANAGEMENT_DOMAIN_CONFIGURATION);
	}

	/**
	 * Access the singleton instance of this configuration.
	 */
	public static synchronized ShoppingConfigurationObject theInstance() {
		if (singleton == null) {
			singleton = new ShoppingConfigurationObject();
		}
		return singleton;
	}

	/**
	 * Returns the  {@link #defaultProductCategory}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'defaultProductCategory' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "defaultProductCategory")
	public ProductCategoryEnum getDefaultProductCategory() {
		return defaultProductCategory;
	}

	/**
	 * Sets the  {@link #defaultProductCategory}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aDefaultProductCategory  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "defaultProductCategory")
	public void setDefaultProductCategory(ProductCategoryEnum aDefaultProductCategory) {
		defaultProductCategory = aDefaultProductCategory;
	}

}
