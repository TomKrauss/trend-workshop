//
// GoShoppingWorkflowContext.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.model.UMLClass;
import de.gebit.trend.gui.application.components.DataEntryContext;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 * This workflow context class models as well the state passed between activities in an activity
 * diagram as also the request scope parameters passed between the individual states. It is attached
 * to a PC defined activity workflow.
 * @param <T>
 *            transaction class (or Object in case of Service Based controllers) - depends on the
 *            type of access layer used underneath the pluggable components controller framework.
 *
 * @author Tom
 * @version 25 Jan 2022
 */
@Stereotype(UMLClass.STEREOTYPE_WORKFLOW_CONTEXT)
public class GoShoppingWorkflowContext<T> extends DataEntryContext<T> {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "shippingInfo")
	public static final String SHIPPING_INFO_FIELD = "shippingInfo";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "payment")
	public static final String PAYMENT_FIELD = "payment";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "products")
	public static final String PRODUCTS_FIELD = "products";
	@de.gebit.trend.model.annotations.Associates(source = @de.gebit.trend.model.annotations.Side(cardinality = "0..*"),
			target = @de.gebit.trend.model.annotations.Side(cardinality = "1"))
	@de.gebit.trend.model.annotations.WorkflowContextScope("workflow")
	private ShippingInfoVM shippingInfo;
	@de.gebit.trend.model.annotations.Associates(source = @de.gebit.trend.model.annotations.Side(cardinality = "0..*"),
			target = @de.gebit.trend.model.annotations.Side(cardinality = "1"))
	@de.gebit.trend.model.annotations.WorkflowContextScope("workflow")
	private PaymentVM payment;
	@de.gebit.trend.model.annotations.Associates(source = @de.gebit.trend.model.annotations.Side(cardinality = "0..*"),
			target = @de.gebit.trend.model.annotations.Side(cardinality = "0..*"))
	@de.gebit.trend.model.annotations.WorkflowContextScope("workflow")
	private java.util.List<ProductVM> products = new java.util.ArrayList<ProductVM>();
	/**
	 * Returns the  {@link #shippingInfo}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'shippingInfo' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "shippingInfo")
	public ShippingInfoVM getShippingInfo() {
		return shippingInfo;
	}
	/**
	 * Sets the  {@link #shippingInfo}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aShippingInfo  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "shippingInfo")
	public void setShippingInfo(ShippingInfoVM aShippingInfo) {
		shippingInfo = aShippingInfo;
	}
	/**
	 * Returns the  {@link #payment}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'payment' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "payment")
	public PaymentVM getPayment() {
		return payment;
	}
	/**
	 * Sets the  {@link #payment}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aPayment  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "payment")
	public void setPayment(PaymentVM aPayment) {
		payment = aPayment;
	}
	/**
	 * Returns the  {@link #products}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'products' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "products")
	public java.util.List<ProductVM> getProducts() {
		return products;
	}
	/**
	 * Sets the  {@link #products}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aProducts  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "products")
	public void setProducts(java.util.List<ProductVM> aProducts) {
		products = aProducts;
	}


}
