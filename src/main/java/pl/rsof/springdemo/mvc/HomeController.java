/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 2 lip 2021  09:29:39
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
public class HomeController {

	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	
	
	
}
