package com.ashvidky.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class StatusController {

//	@GetMapping("/status")
	public String sayWelcome() {
		return "Welcome to Spring Applicaton with out Security";
	}
}
