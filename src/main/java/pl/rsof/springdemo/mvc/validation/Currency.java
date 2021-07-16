/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 16 lip 2021  23:17:19
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CurrencyContraintValidator.class)
@Retention(RUNTIME)
@Target({FIELD, METHOD})
/**
 * <p>Akceptowalne waluty</p><p>16 lip 2021</p>
 * @author RS
 *
 */
public @interface Currency {

	// domyslne waluty
	public String [] value() default {"PLN", "EUR"};
	
	
	public String message() default "Domyślne waluta to PLN lub EUR";
	
	
	// define default group
	public Class<?>[]groups() default {}; 
		
		// define default payloads
	public Class<? extends Payload>[] payload() default {};
	
	
}
