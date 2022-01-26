//
// SelectProductsController.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.service.ServiceFactory;
import de.gebit.trend.workshop.service.ShoppingServiceBean;

/**
 * This is the implementation class hook derived from a (probably abstract) super class
 * of a pluggable component.
 * <P>
 * It is used to implement a pluggable component of type <tt>BOBrowser</tt>.
 * <P>
 * This Controller implementation for the pluggable component BOBrowser implements
 * the appropriate behavior using <em>ServiceBeans</em>.
 *
 */
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_CONTROLLER)
public class SelectProductsController extends de.gebit.trend.gui.application.components.ServiceBOBrowserController<ProductVM> {

	public boolean canPerformNext() {
		int tSize = getBOBrowserView().getBrowser().getSelection().size();
		return tSize > 1;
	}

	/**
	 * {@inheritDoc}
	 *
	 * This is the workhorse method provided by BOBrowser controllers. It returns a collection of structured objects to be displayed in the browser table, so the user can select one of these objects (or many) and proceed. Call the appropriate business request service here.
	 */
	@Override
	public java.util.List<ProductVM> getObjects(de.gebit.trend.gui.GContainer aGContainer) throws de.gebit.trend.exception.TrendFailureException {
		try (ShoppingServiceBean tBean = ServiceFactory.createBusinessServiceBean(ShoppingServiceBean.class)) {
			return tBean.getProducts();
		}
	}




}
