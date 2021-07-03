/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 2 lip 2021  10:52:38
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p><p>2 lip 2021</p>
 * @author RS
 *
 */
@Controller
public class HelloWorldController {

	
	// nazwy metod nieistotne - ważne mapowanie
	
	
	// controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() { 
		return "helloworld-form";
	}
	
	// process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	
}
