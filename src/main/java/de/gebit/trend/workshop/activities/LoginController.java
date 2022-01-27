//
// LoginController.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

import de.gebit.trend.gui.application.components.AbstractMessageBoxGUI;
import de.gebit.trend.model.annotations.Stereotype;

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
public class LoginController extends de.gebit.trend.gui.application.components.ServiceBOEditorController<LoginVM> {

	private boolean passwordVisible = true;
	
	/**
	 * @return the passwordVisible
	 */
	public boolean isPasswordVisible() {
		return passwordVisible;
	}
	
	public void togglePasswordVisibility() {
		passwordVisible = !passwordVisible;
	}
	
	
	public void setUser() {
		getModel().setUsername("Tom");
	}

	public void performNext(String aTransitionId) {
		String tUserName = getModel().getUsername();
		if (!"Tom".equals(tUserName)) {
			getContext().setProperty(AbstractMessageBoxGUI.DEC_MESSAGEBOX_MESSAGE, "Wrong credentials provided.");
			requestTransition(LoginID.LOGIN_FAILED, getContext(), 
					(ctx) -> displayInfo("I am back")
			);
		} else {
			requestTransition(aTransitionId, getContext());
		}
	}


}
