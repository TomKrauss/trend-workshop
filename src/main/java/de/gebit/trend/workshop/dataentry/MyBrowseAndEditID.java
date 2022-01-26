//
// MyBrowseAndEditID.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.dataentry;

import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 * This interface defines the ID and transition identifiers of the 'MyBrowseAndEdit' activity.
 */
@Generated(type=GeneratedType.CONSTANT, generatedFor="MyBrowseAndEdit")
@SuppressWarnings("all")
public interface MyBrowseAndEditID {

	/**
	 * Identifier of the MyBrowseAndEdit activity
	 */
	public static final String ID = "MyBrowseAndEdit";

	/**
	 * Constant for transition named 'hello'
	 * CallTransition from 'MyBrowseAndEdit' to 'Message Box Hello'
	 */
	public static final String HELLO = "hello";

}
