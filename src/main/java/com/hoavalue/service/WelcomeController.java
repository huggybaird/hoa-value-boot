package com.hoavalue.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.hoavalue.service.*;

@RestController
public class WelcomeController {
//	
//	@RequestMapping("/")
//	public String index() {
//		return "redirect:/swagger-ui.html";
////		return "Welcome to the hoavalue.com API. please visit "
////				+ "<a href=\"/swagger-ui.html\">/swagger-ui.html</a> for the documentation";
//		//return service.retrieveWelcomeMessage();
//	}
	
//	 @RequestMapping("/")
//	    public RedirectView redirectWithUsingRedirectView(
//	      RedirectAttributes attributes) {
//	        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
//	        attributes.addAttribute("attribute", "redirectWithRedirectView");
//	        return new RedirectView("/swagger-ui.html");
//	    }
	 
	 @RequestMapping("/")
	    public RedirectView index() { 
	        return new RedirectView("/swagger-ui.html");
	    }
//	 
	//Auto wiring = spring creats bean and injects where needed
	//@Autowired
	//public WelcomeService service; // = new WelcomeService();
	
	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}

}

