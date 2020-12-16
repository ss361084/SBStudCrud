package com.sumit.studmanagment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = {"/"})
	public String getHomePage() {
		return "Home";
	}
}
