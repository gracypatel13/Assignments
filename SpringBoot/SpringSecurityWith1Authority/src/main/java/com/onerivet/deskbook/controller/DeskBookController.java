package com.onerivet.deskbook.controller;

import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeskBookController {
	
	@GetMapping("/deskbook")
	public String testApp(Authentication a) {
		return "Hello Gracy";
	}

}
