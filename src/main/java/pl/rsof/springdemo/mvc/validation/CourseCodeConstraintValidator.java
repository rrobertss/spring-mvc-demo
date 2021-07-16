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

	
	private String coursePrefix;
	
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value != null) {
			return value.startsWith(coursePrefix);
		}
		else {
			// jeśli nic nie podano -> niech przejdzie dalej, pole nie jest wymagane
			return true;
		}
	}

	

}
