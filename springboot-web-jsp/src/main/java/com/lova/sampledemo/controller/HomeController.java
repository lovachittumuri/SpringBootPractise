package com.lova.sampledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping({ "/" })
	public String hello(Model model) {
		model.addAttribute("message", "Lova Chittumuri");
		return "home";
	}

}
