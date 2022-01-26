//
// ShippingInfoVM.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;


import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 *
 * @author Tom
 * @version 25 Jan 2022
 */
@Interface(false)
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_VALUE_OBJECT)
public  class ShippingInfoVM extends de.gebit.trend.bo.ObservableValueObject implements java.io.Serializable {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "street")
	public static final String STREET_FIELD = "street";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "city")
	public static final String CITY_FIELD = "city";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "country")
	public static final String COUNTRY_FIELD = "country";
	private String street;
	private String city;
	private String country;
	/**
	 * Returns the  {@link #street}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'street' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "street")
	public String getStreet() {
		return street;
	}
	/**
	 * Sets the  {@link #street}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aStreet  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "street")
	public void setStreet(String aStreet) {
		street = aStreet;
	}
	/**
	 * Returns the  {@link #city}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'city' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "city")
	public String getCity() {
		return city;
	}
	/**
	 * Sets the  {@link #city}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aCity  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "city")
	public void setCity(String aCity) {
		city = aCity;
	}
	/**
	 * Returns the  {@link #country}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'country' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "country")
	public String getCountry() {
		return country;
	}
	/**
	 * Sets the  {@link #country}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aCountry  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "country")
	public void setCountry(String aCountry) {
		country = aCountry;
	}
}
