//
// Product_DetailsID.java
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
 * This interface defines the ID and transition identifiers of the 'Product Details' activity.
 */
@Generated(type=GeneratedType.CONSTANT, generatedFor="Product Details")
@SuppressWarnings("all")
public interface Product_DetailsID {

	/**
	 * Identifier of the Product Details activity
	 */
	public static final String ID = "Product Details";

	/**
	 * Constant for transition named 'end'
	 * CallTransition from 'Product Details' to 'Select Products'
	 */
	public static final String END = "end";

}
