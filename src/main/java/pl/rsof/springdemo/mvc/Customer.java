/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 14 lip 2021  10:21:06
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * <p></p><p>14 lip 2021</p>
 * @author RS
 *
 */
public class Customer {
	
	
	private String firstName;
	@NotNull(message = "Pole jest wymagane")
	@Size(min = 1, message = "Wprowadz minimum 1 znak")
	private String lastName;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
