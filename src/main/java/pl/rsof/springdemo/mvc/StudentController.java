/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 9 lip 2021  10:26:51
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p><p>9 lip 2021</p>
 * @author RS
 *
 */
@Controller()
@RequestMapping("/student")
public class StudentController {

	
	@Value("#{countryOptions}")
	private Map<String, String>countryOptions;
	 
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("student", new Student());
		model.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//only println
		System.out.println("Student: "+student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
	
	
}
