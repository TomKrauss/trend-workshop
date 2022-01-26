//
// NameDomainType.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.bo;

import de.gebit.trend.model.annotations.Constraints;
import de.gebit.trend.model.annotations.SqlColumn;
import de.gebit.trend.model.annotations.SqlColumnType;
import de.gebit.trend.model.annotations.Stereotype;

/**
 * The NameDomainType Domain Type describes all String type attributes used as ...
 *
 * @author Tom
 * @version 19 Jan 2022
 */
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_DOMAIN_TYPE_OBJECT)
public class NameDomainType {

	@SuppressWarnings("unused")
	@Constraints(maxsize = 100)
	@SqlColumn(type = SqlColumnType.VARCHAR)
	private String theAttribute;

}
