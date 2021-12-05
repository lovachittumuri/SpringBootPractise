package com.lova.sampledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// Logger logger = Logger.getLogger(HomeController.class);

	/*
	 * @GetMapping({ "/", "/hello" }) public String hello(@RequestParam(value =
	 * "message", defaultValue = "World", required = true) String name, Model model)
	 * { model.addAttribute("message", name); return "home"; }
	 */
	@GetMapping({ "/"})
	public String hello(Model model) {
		model.addAttribute("message", "Lova Chittumuri");
		return "home";
	}

}
