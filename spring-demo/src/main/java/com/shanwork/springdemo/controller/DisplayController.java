package com.shanwork.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shanwork.springdemo.model.PizzaMenu;

@RestController
public class DisplayController {
	
	@RequestMapping (value="/overview", method=RequestMethod.GET)
	public String displayOverview () {
		
		return "Welcome to Spicy Pizza";
	}

	@RequestMapping (value="/menu", method=RequestMethod.GET)
	public PizzaMenu displayMenu () {
		PizzaMenu pizzaMenu = new PizzaMenu();
		pizzaMenu.setId("1");
		pizzaMenu.setName("Indian Item 1");
		
		return pizzaMenu;
	}

}
