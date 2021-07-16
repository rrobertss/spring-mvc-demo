/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 14 lip 2021  11:48:08
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p><p>14 lip 2021</p>
 * @author RS
 *
 */
 @Controller
 @RequestMapping("/customer")
public class CustomerController {

	 
	 // trim strings, empty String is set to null
	 @InitBinder
	 public void initBinder(WebDataBinder dataBinder) {
		 StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		 dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	 }
	 
	 
	 @RequestMapping("/showForm")
	 public String showForm(Model model) {
		 
		 model.addAttribute("customer", new Customer());
		 
		 return "customer-form";
	 }
	 
	 
	 @RequestMapping("/processCustomerForm")
	 public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		 
		 // do pliku messages.properties - nazwy bledow do nadpisania
		 System.out.println("Binding result (for messages.properties): "+bindingResult);
		 
		 if (bindingResult.hasErrors()) {
			 return "customer-form";
		 }
		 else {
			 return "customer-confirmation"; 
		 }
	 }
}
