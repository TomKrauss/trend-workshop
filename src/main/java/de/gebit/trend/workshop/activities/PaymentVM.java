//
// PaymentVM.java
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
public  class PaymentVM extends de.gebit.trend.bo.ObservableValueObject implements java.io.Serializable {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "paymentType")
	public static final String PAYMENT_TYPE_FIELD = "paymentType";
	private String paymentType;
	/**
	 * Returns the  {@link #paymentType}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'paymentType' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "paymentType")
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * Sets the  {@link #paymentType}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aPaymentType  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "paymentType")
	public void setPaymentType(String aPaymentType) {
		paymentType = aPaymentType;
	}
}
