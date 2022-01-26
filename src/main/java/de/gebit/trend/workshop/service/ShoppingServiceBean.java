//
// ShoppingServiceBean.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.service;

import de.gebit.trend.model.annotations.*;
import de.gebit.trend.exception.TrendFailureException;
import de.gebit.trend.service.BusinessServiceBean;
import de.gebit.trend.workshop.activities.ProductVM;

import java.util.List;

/**
 * The interface ShoppingServiceBean was generated from
 * implementation class BasicShoppingServiceBean.
 * <P>
 * <EM>Do not edit or change, because this class will be re-generated.</EM>
 *
 * @see BasicShoppingServiceBean
 * @author Tom
 */
@Generated
@SuppressWarnings("all")
public interface ShoppingServiceBean extends BusinessServiceBean, de.gebit.trend.service.CallByValue {

	@Stereotype("BusinessTransaction")
	public void createCustomer(String aFirstname, String anAddress);

	@Stereotype("BusinessRequest")
	public List<ProductVM> getProducts() throws IllegalStateException, TrendFailureException;



}
