package com.ashvidky.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
//		@PreAuthorize("this.isTest() OR hasAnyAuthority('TEST')")
	public String sayWelcome() {
		return "Welcome to Spring Applicaton with Security";
	}
}
