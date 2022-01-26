//
// Customer.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import de.gebit.trend.bo.BOCollection;
import de.gebit.trend.model.annotations.Associates;
import de.gebit.trend.model.annotations.Constraints;
import de.gebit.trend.model.annotations.DomainType;
import de.gebit.trend.model.annotations.Field;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.LinkType;
import de.gebit.trend.model.annotations.Pattern;
import de.gebit.trend.model.annotations.Side;
import de.gebit.trend.model.annotations.SqlColumn;
import de.gebit.trend.model.annotations.SqlTable;
import de.gebit.trend.model.annotations.Stereotype;

/**
 *
 * @author Tom
 * @version 19 Jan 2022
 */
@Interface(false)
@Stereotype("BusinessObject")
@SqlTable("T_CUSTOMER")
public class Customer extends de.gebit.trend.workshop.bo.ShoppingBO  {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "firstname")
	public static final String FIRSTNAME_FIELD = "firstname";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "lastname")
	public static final String LASTNAME_FIELD = "lastname";
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
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "zipCode")
	public static final String ZIP_CODE_FIELD = "zipCode";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "basket")
	public static final String BASKET_FIELD = "basket";
	@DomainType(NameDomainType.class)
	@Constraints(mandatory = true)
	@SqlColumn("c_firstname")
	private String firstname;
	@DomainType(NameDomainType.class)
	@Constraints(mandatory = true)
	private String lastname;
	@Constraints(mandatory = true, maxsize = 64)
	@SqlColumn(createIndex = true)
	private String street;
	@DomainType(NameDomainType.class)
	@Constraints(mandatory = true)
	private String city;
	@Constraints(mandatory = true, pattern = @Pattern("[0-9]{5}"))
	private String zipCode;
	@Associates(foreignKeyDescriptorName = "customer_basket",
			source = @Side(cardinality = "1", mapping = @Field("Persistent key")),
			target = @Side(cardinality = "0..*", mapping = @Field(value = "_customer_id", type = "Long")),
			type = LinkType.AGGREGATION, bidirectional = "de.gebit.trend.workshop.bo.Basket#customer")
	private de.gebit.trend.bo.BOCollection<Basket> basket;
	/**
	 * Returns the  {@link #firstname}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'firstname' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "firstname")
	public String getFirstname() {
		resolveGet("firstname");
		return firstname;
	}
	/**
	 * Sets the  {@link #firstname}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aFirstname  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "firstname")
	public void setFirstname(String aFirstname) {
		resolveSet("firstname");
		firstname = aFirstname;
	}
	/**
	 * Returns the  {@link #lastname}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'lastname' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "lastname")
	public String getLastname() {
		resolveGet("lastname");
		return lastname;
	}
	/**
	 * Sets the  {@link #lastname}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aLastname  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "lastname")
	public void setLastname(String aLastname) {
		resolveSet("lastname");
		lastname = aLastname;
	}
	/**
	 * Returns the  {@link #street}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'street' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "street")
	public String getStreet() {
		resolveGet("street");
		return street;
	}
	/**
	 * Sets the  {@link #street}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aStreet  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "street")
	public void setStreet(String aStreet) {
		resolveSet("street");
		street = aStreet;
	}
	/**
	 * Returns the  {@link #city}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'city' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "city")
	public String getCity() {
		resolveGet("city");
		return city;
	}
	/**
	 * Sets the  {@link #city}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aCity  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "city")
	public void setCity(String aCity) {
		resolveSet("city");
		city = aCity;
	}
	/**
	 * Returns the  {@link #zipCode}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'zipCode' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "zipCode")
	public String getZipCode() {
		resolveGet("zipCode");
		return zipCode;
	}
	/**
	 * Sets the  {@link #zipCode}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aZipCode  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "zipCode")
	public void setZipCode(String aZipCode) {
		resolveSet("zipCode");
		zipCode = aZipCode;
	}
	/**
	 * Returns the  {@link #basket}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'basket' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "basket")
	public BOCollection<Basket> getBasket() {
		resolveGet("basket");
		return basket;
	}
	/**
	 * Sets the  {@link #basket}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aBasket  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "basket")
	public void setBasket(BOCollection<Basket> aBasket) {
		resolveSet("basket");
		basket = aBasket;
	}
}
