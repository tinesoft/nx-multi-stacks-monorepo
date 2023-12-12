package com.example.bootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class WelcomeController {

	private static final String WELCOME_TEMPLATE = "Welcome, %s, from '%s'!";
    public static record WelcomeMessage(String user, String message) { }

	@GetMapping("/welcome")
	public WelcomeMessage welcome(@RequestParam(value = "user", defaultValue = "Sfeir School Nx Attendee") String user) {
		return new WelcomeMessage(user, String.format(WELCOME_TEMPLATE, user, "bootapp"));
	}
}