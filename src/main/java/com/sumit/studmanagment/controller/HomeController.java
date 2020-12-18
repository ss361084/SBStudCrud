package com.sumit.studmanagment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sumit.studmanagment.model.Student;

@Controller
public class HomeController {

	@GetMapping(value = {"/"})
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", new Student());
		modelAndView.setViewName("Home");
		return modelAndView;
	}
}
