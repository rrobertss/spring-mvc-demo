/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 9 lip 2021  07:44:02
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p><p>9 lip 2021</p>
 * @author RS
 *
 */
@Controller
public class SillyController {

	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
	
	
	
	
}
