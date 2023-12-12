package com.example.bootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.bootlib.service.MyService;

@RestController("/api")
public class WelcomeController {

	private static final String WELCOME_TEMPLATE = "Welcome, %s, from '%s'!";
    public static record WelcomeMessage(String user, String message) { }

    private final MyService myService;

	public WelcomeController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/welcome")
	public WelcomeMessage welcome(@RequestParam(value = "user", defaultValue = "Sfeir School Nx Attendee") String user) {
		return new WelcomeMessage(user, String.format(WELCOME_TEMPLATE, user, this.myService.message()));
	}
}