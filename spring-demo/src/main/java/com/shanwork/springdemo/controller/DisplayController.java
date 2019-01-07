package com.shanwork.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {
	
	@RequestMapping ("/overview")
	public String displayOverview () {
		
		return "Welcome to Spicy Pizza";
	}

}
