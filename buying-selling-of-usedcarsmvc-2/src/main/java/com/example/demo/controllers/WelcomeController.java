package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping(value ="/")
	public String init(Model model) {
		
		model.addAttribute("heading", "Cars Selling and Buying");
		
		return "index";
	}
}
