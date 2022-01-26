//
// BasketPosition.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import de.gebit.trend.model.annotations.Associates;
import de.gebit.trend.model.annotations.Constraints;
import de.gebit.trend.model.annotations.Field;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Side;
import de.gebit.trend.model.annotations.Stereotype;

/**
 *
 * @author Tom
 * @version 19 Jan 2022
 */
@Interface(false)
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_BUSINESS_OBJECT)
public class BasketPosition extends ShoppingBO  {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "product")
	public static final String PRODUCT_FIELD = "product";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "quantity")
	public static final String QUANTITY_FIELD = "quantity";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "_product_id")
	public static final String _PRODUCT_ID_COLUMN = "_product_id";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "_basket_id")
	public static final String _BASKET_ID_COLUMN = "_basket_id";
	@Associates(source = @Side(cardinality = "0..*", mapping = @Field("External foreign key")),
			target = @Side(cardinality = "1", mapping = @Field("Persistent key")))
	private Product product;
	@Constraints(minvalue = "1")
	private int quantity = 1;
	/**
	 * Returns the  {@link #product}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'product' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "product")
	public Product getProduct() {
		resolveGetReference("product");
		return product;
	}
	/**
	 * Sets the  {@link #product}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aProduct  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "product")
	public void setProduct(Product aProduct) {
		resolveSetReference("product");
		product = aProduct;
	}
	/**
	 * Returns the  {@link #quantity}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'quantity' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "quantity")
	public int getQuantity() {
		resolveGet("quantity");
		return quantity;
	}
	/**
	 * Sets the  {@link #quantity}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aQuantity  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "quantity")
	public void setQuantity(int aQuantity) {
		resolveSet("quantity");
		quantity = aQuantity;
	}
}
