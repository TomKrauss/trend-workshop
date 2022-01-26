//
// ProductVM.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;


import java.math.BigDecimal;

import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 *
 * @author Tom
 * @version 25 Jan 2022
 */
@Interface(false)
@Stereotype("ValueObject")
@de.gebit.trend.model.annotations.MappedEntity(de.gebit.trend.workshop.bo.Product.class)
public  class ProductVM extends de.gebit.trend.bo.ObservableValueObject implements java.io.Serializable {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "name")
	public static final String NAME_FIELD = "name";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "description")
	public static final String DESCRIPTION_FIELD = "description";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "price")
	public static final String PRICE_FIELD = "price";
	private String name;
	private String description;
	private BigDecimal price;
	/**
	 * Returns the  {@link #name}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'name' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "name")
	public String getName() {
		return name;
	}
	/**
	 * Sets the  {@link #name}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aName  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "name")
	public void setName(String aName) {
		name = aName;
	}
	/**
	 * Returns the  {@link #description}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'description' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "description")
	public String getDescription() {
		return description;
	}
	/**
	 * Sets the  {@link #description}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aDescription  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "description")
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	/**
	 * Returns the  {@link #price}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'price' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "price")
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * Sets the  {@link #price}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aPrice  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "price")
	public void setPrice(BigDecimal aPrice) {
		price = aPrice;
	}
}
