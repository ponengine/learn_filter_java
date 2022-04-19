package com.example.customfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome to my filter";
	}
	
	@GetMapping("/wish")
	public String message() {
		return "Hello Guys....";
	}
}
