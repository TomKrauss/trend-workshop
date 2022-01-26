//
// Basket.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import java.sql.Date;

import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Stereotype;

/**
 *
 * @author Tom
 * @version 19 Jan 2022
 */
@Interface(false)
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_BUSINESS_OBJECT)
public class Basket extends ShoppingBO  {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "created")
	public static final String CREATED_FIELD = "created";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "basketPositions")
	public static final String BASKET_POSITIONS_FIELD = "basketPositions";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "customer")
	public static final String CUSTOMER_FIELD = "customer";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "_customer_id")
	public static final String _CUSTOMER_ID_COLUMN = "_customer_id";
	private Date created = new Date(System.currentTimeMillis());
	@de.gebit.trend.model.annotations.Associates(
			source = @de.gebit.trend.model.annotations.Side(cardinality = "1",
					mapping = @de.gebit.trend.model.annotations.Field("Persistent key")),
			target = @de.gebit.trend.model.annotations.Side(cardinality = "0..*",
					mapping = @de.gebit.trend.model.annotations.Field(value = "_basket_id", type = "Long")),
			type = de.gebit.trend.model.annotations.LinkType.AGGREGATION,
			foreignKeyDescriptorName = "basket_basket_position")
	private de.gebit.trend.bo.BOCollection<BasketPosition> basketPositions;
	@de.gebit.trend.model.annotations.AssociatesReverse
	private Customer customer;

	/**
	 * Returns the  {@link #created}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'created' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "created")
	public Date getCreated() {
		resolveGet("created");
		return created;
	}
	/**
	 * Sets the  {@link #created}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aCreated  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "created")
	public void setCreated(Date aCreated) {
		resolveSet("created");
		created = aCreated;
	}
	/**
	 * Returns the  {@link #basketPositions}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'basketPositions' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "basketPositions")
	public de.gebit.trend.bo.BOCollection<BasketPosition> getBasketPositions() {
		resolveGet("basketPositions");
		return basketPositions;
	}
	/**
	 * Sets the  {@link #basketPositions}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aBasketPositions  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "basketPositions")
	public void setBasketPositions(de.gebit.trend.bo.BOCollection<BasketPosition> aBasketPositions) {
		resolveSet("basketPositions");
		basketPositions = aBasketPositions;
	}
	/**
	 * Returns the  {@link #customer}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'customer' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "customer")
	public Customer getCustomer() {
		resolveGetReference("customer");
		return customer;
	}
	/**
	 * Sets the  {@link #customer}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aCustomer  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "customer")
	public void setCustomer(Customer aCustomer) {
		resolveSetReference("customer");
		customer = aCustomer;
	}
}
