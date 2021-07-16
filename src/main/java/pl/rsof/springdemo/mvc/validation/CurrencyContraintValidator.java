/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 16 lip 2021  23:20:44
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>Walidowanie waluty</p><p>16 lip 2021</p>
 * @author RS
 *
 */
public class CurrencyContraintValidator implements ConstraintValidator<Currency, String>{

	private String[] currency;
	
	
	@Override
	public void initialize(Currency constraintAnnotation) {
		currency = constraintAnnotation.value();
	}


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;
		
		if (value != null) {
			for (String cur : currency) {
				if (cur.equalsIgnoreCase(value)) {
					result = true;
					break;
				}
			}
			return result;
		}
		else {
			return true;
		}
	}
	
	
	
	

}
