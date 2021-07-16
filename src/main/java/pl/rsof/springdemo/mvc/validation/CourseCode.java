/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 16 lip 2021  14:09:50
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

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({FIELD, METHOD})
/**
 * <p>Kod kursow - adnotacja</p><p>16 lip 2021</p>
 * @author RS
 *
 */
public @interface CourseCode {

	
	// define default course code
	public String value() default "PL";
	
	// define default error message
	public String message() default "Course must start with PL";
	
	// define default group
	public Class<?>[]groups() default {}; 
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
	
	
}
