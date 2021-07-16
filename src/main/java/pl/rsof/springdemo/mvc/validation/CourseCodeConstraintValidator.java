/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 16 lip 2021  14:15:09
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>Implementacja adnotacji do walidacji</p><p>16 lip 2021</p>
 * @author RS
 *
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		
		
		return false;
	}

	

}
