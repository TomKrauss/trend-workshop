//
// ConfirmOrderController.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

import de.gebit.trend.bo.ObjectCreationException;
import de.gebit.trend.gui.application.components.AbstractMessageBoxGUI;
import de.gebit.trend.gui.application.components.DataEntryContext;
import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.workshop.activities.GoShoppingWorkflowContext;


/**
 * This is the implementation class hook derived from a (probably abstract) super class
 * of a pluggable component.
 * <P>
 * It is used to implement a pluggable component of type <tt>BOEditor</tt>.
 * <P>
 * This Controller implementation for the pluggable component BOEditor implements
 * the appropriate behavior using <em>Service Beans</em>.
 *
 */
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_CONTROLLER)
public class ConfirmOrderController extends de.gebit.trend.gui.application.components.ServiceBOEditorController<OrderVM> {

	private String message = "An error has occurred.";
	
	/*
	 * @see de.gebit.trend.gui.application.components.ServiceBOEditorController#destroy()
	 */
	@Override
	public void destroy() {
		super.destroy();
		getLogger().debug("I am being destroyed: " + this);
	}
	
	/*
	 * @see de.gebit.trend.gui.application.components.AbstractPluggableComponentController#initFromDataEntryContext(de.gebit.trend.gui.application.components.DataEntryContext)
	 */
	@Override
	protected void initFromDataEntryContext(DataEntryContext<Object> aContext) {
		super.initFromDataEntryContext(aContext);
		String tMessage = (String)aContext.getProperty(AbstractMessageBoxGUI.DEC_MESSAGEBOX_MESSAGE);
		if (tMessage != null) {
			message = tMessage;
		}
	}

	/*
	 * @see de.gebit.trend.gui.application.components.AbstractPluggableComponentController#createMainObject()
	 */
	@Override
	public OrderVM createMainObject() throws ObjectCreationException {
		OrderVM tOrder = super.createMainObject();
		tOrder.setPayment(getContext().getPayment());
		tOrder.setProducts(getContext().getProducts());
		tOrder.setShippingInfo(getContext().getShippingInfo());
		return tOrder;
	}

	/**
	 * Returns the current data entry context casted to a more concrete type
	 * as a workflow context class was specified for the surrounding workflow.
	 * @trend.publicAPI useByCalling
	 */
	@Override
	public GoShoppingWorkflowContext getContext() {
		return (GoShoppingWorkflowContext)super.getContext();
	}


}
