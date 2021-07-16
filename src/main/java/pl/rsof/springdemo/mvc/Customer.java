/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 14 lip 2021  10:21:06
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import pl.rsof.springdemo.mvc.validation.CourseCode;
import pl.rsof.springdemo.mvc.validation.Currency;

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
	
	@NotNull(message = "Wartość jest wymagana")
	@Min(value = 0, message = "Liczba musi być większa lub równa zero")
	@Max(value = 10, message = "Liczba musi być mniejsza lub równa 10")
	private Integer freePasses;     // int bedzie wyrzucal blad konwersji

	@Pattern(regexp = "^[0-9]{2}-[0-9]{3}", message = "Błędny kod pocztowy, wzór: 00-000")
	private String postalCode;
	
	@CourseCode(value = "CC", message = "Błędny początek kodu kursu. Powinien zaczynać się od 'CC'")
	private String courseCode;
	
	
	@Currency(value = {"EUR", "USD", "CHF", "GBP"}, message = "Dopuszczalne waluty to: EUR, USD, CHF i GBP")
	private String currency;
	
	
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
