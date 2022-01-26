//
// Confirm_OrderID.java
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
 * This interface defines the ID and transition identifiers of the 'Confirm Order' activity.
 */
@Generated(type=GeneratedType.CONSTANT, generatedFor="Confirm Order")
@SuppressWarnings("all")
public interface Confirm_OrderID {

	/**
	 * Identifier of the Confirm Order activity
	 */
	public static final String ID = "Confirm Order";

	/**
	 * Constant for transition named 'confirm'
	 * CallTransition from 'Confirm Order' to 'MainEnd'
	 */
	public static final String CONFIRM = "confirm";

}
