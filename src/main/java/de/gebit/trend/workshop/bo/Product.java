//
// Product.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import java.math.BigDecimal;

import de.gebit.trend.model.annotations.Constraints;
import de.gebit.trend.model.annotations.DomainType;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.SqlColumn;
import de.gebit.trend.model.annotations.SqlColumnType;
import de.gebit.trend.model.annotations.Stereotype;

/**
 *
 * @author Tom
 * @version 19 Jan 2022
 */
@Interface(false)
@Stereotype("BusinessObject")
public class Product extends ShoppingBO  {

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
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "productCategory")
	public static final String PRODUCT_CATEGORY_FIELD = "productCategory";
	@Constraints(mandatory = true)
	@DomainType(NameDomainType.class)
	private String name;
	@Constraints(maxsize = 2000)
	@SqlColumn(type = SqlColumnType.VARCHAR)
	private String description;
	@Constraints(mandatory = true, precision = 10, scale = 2)
	private BigDecimal price;
	
	@Constraints(mandatory = true)
	private ProductCategoryEnum productCategory = ShoppingConfigurationObject.theInstance().getDefaultProductCategory();
	
	/**
	 * Returns the  {@link #name}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'name' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "name")
	public String getName() {
		resolveGet("name");
		return name;
	}
	/**
	 * Sets the  {@link #name}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aName  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "name")
	public void setName(String aName) {
		resolveSet("name");
		name = aName;
	}
	/**
	 * Returns the  {@link #description}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'description' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "description")
	public String getDescription() {
		resolveGet("description");
		return description;
	}
	/**
	 * Sets the  {@link #description}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aDescription  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "description")
	public void setDescription(String aDescription) {
		resolveSet("description");
		description = aDescription;
	}
	/**
	 * Returns the  {@link #price}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'price' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "price")
	public BigDecimal getPrice() {
		resolveGet("price");
		return price;
	}
	/**
	 * Sets the  {@link #price}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aPrice  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "price")
	public void setPrice(BigDecimal aPrice) {
		resolveSet("price");
		price = aPrice;
	}
	/**
	 * Returns the  {@link #productCategory}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'productCategory' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "productCategory")
	public ProductCategoryEnum getProductCategory() {
		resolveGet("productCategory");
		return productCategory;
	}
	/**
	 * Sets the  {@link #productCategory}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aProductCategory  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "productCategory")
	public void setProductCategory(ProductCategoryEnum aProductCategory) {
		resolveSet("productCategory");
		productCategory = aProductCategory;
	}
}
