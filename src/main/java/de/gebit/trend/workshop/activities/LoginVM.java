//
// LoginVM.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//

package de.gebit.trend.workshop.activities;


import de.gebit.trend.model.annotations.Stereotype;
import de.gebit.trend.model.annotations.Interface;
import de.gebit.trend.model.annotations.Generated;
import de.gebit.trend.model.annotations.GeneratedType;

/**
 *
 * @author Tom
 * @version 25 Jan 2022
 */
@Interface(false)
@Stereotype(de.gebit.trend.model.UMLClass.STEREOTYPE_VALUE_OBJECT)
public  class LoginVM extends de.gebit.trend.bo.ObservableValueObject implements java.io.Serializable {

	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "username")
	public static final String USERNAME_FIELD = "username";
	/**
	 * Constant to be used instead of referring to an attribute (external field) instead of using a String. 
	 */
	@Generated(type = GeneratedType.CONSTANT, generatedFor = "password")
	public static final String PASSWORD_FIELD = "password";
	private String username;
	@de.gebit.trend.model.annotations.UIFieldDescriptor(editorType = "password")
	private String password;
	/**
	 * Returns the  {@link #username}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'username' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "username")
	public String getUsername() {
		return username;
	}
	/**
	 * Sets the  {@link #username}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aUsername  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "username")
	public void setUsername(String aUsername) {
		username = aUsername;
	}
	/**
	 * Returns the  {@link #password}  instance variable. <span style="display: none;">Generated getter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @return  the 'password' instance variable.
	 */
	@Generated(type = GeneratedType.GETTER, generatedFor = "password")
	public String getPassword() {
		return password;
	}
	/**
	 * Sets the  {@link #password}  instance variable. <span style="display: none;">Generated setter method. To avoid re-generation, remove the &#64;Generated annotation.</span>
	 * @param aPassword  the value assigned to the instance variable.
	 */
	@Generated(type = GeneratedType.SETTER, generatedFor = "password")
	public void setPassword(String aPassword) {
		password = aPassword;
	}
}
