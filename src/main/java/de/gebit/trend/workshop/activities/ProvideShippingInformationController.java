//
// ProvideShippingInformationController.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

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
public class ProvideShippingInformationController extends de.gebit.trend.gui.application.components.ServiceBOEditorController<ShippingInfoVM> {



	public void performNext(String aTransitionId) {
		getContext().setShippingInfo(getModel());
		requestTransition(aTransitionId, getContext());
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
