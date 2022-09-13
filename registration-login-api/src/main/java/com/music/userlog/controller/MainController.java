package com.music.userlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
}
