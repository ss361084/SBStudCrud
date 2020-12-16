package com.sumit.studmanagment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/student"})
public class StudentController {

	@GetMapping(value = {"/addstudent"})
	public String saveStudent() {
		return "redirect:Home";
	}
}
