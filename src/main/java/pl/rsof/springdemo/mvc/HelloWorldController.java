/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 2 lip 2021  10:52:38
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String showFormUser() { 
		return "helloworld-form";
	}
	
	// process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionTwo")
	public String textToUpperCase(HttpServletRequest request, Model model) {
		
		String student = request.getParameter("studentName");
		
		student = student.toUpperCase();
		
		String message = "Hello hello " + student;
		
		model.addAttribute("message", message);
		
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String methodRequestParam(HttpServletRequest request, Model model) {
		
		String student = request.getParameter("studentName");
		
		student = student.toUpperCase();
		
		String message = "Hello hello " + student;
		
		model.addAttribute("message", message);
		
		
		return "helloworld";
	}
	
	
	
}
