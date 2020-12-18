package com.sumit.studmanagment.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sumit.studmanagment.model.Student;

@Controller
@RequestMapping(value = {"/student"})
public class StudentController {

	@PostMapping(value = {"/addstudent"})
	public String saveStudent(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "Home";
		}
		return "Final";
	}
}
