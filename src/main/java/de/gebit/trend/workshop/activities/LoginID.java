//
// LoginID.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;

import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 * This interface defines the ID and transition identifiers of the 'Login' activity.
 */
@Generated(type=GeneratedType.CONSTANT, generatedFor="Login")
@SuppressWarnings("all")
public interface LoginID {

	/**
	 * Identifier of the Login activity
	 */
	public static final String ID = "Login";

	/**
	 * Constant for transition named 'hello'
	 * CallTransition from 'Login' to 'Hello'
	 */
	public static final String HELLO = "hello";

	/**
	 * Constant for transition named 'loginFailed'
	 * CallTransition from 'Login' to 'Login Failed'
	 */
	public static final String LOGIN_FAILED = "loginFailed";

	/**
	 * Constant for transition named 'setUser'
	 * void from 'Login' to 'Login'
	 */
	public static final String SET_USER = "setUser";

}
