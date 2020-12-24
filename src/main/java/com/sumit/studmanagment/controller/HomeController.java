package com.sumit.studmanagment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sumit.studmanagment.model.Student;
import com.sumit.studmanagment.service.StudentService;

@Controller
@RequestMapping(value = {"/student"})
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping(value = {"/addstudent"})
	public String saveStudent(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult, Model model,RedirectAttributes attributes) {
		if(bindingResult.hasErrors()) {
			return "Home";
		}
		studentService.saveStudent(student);
		attributes.addFlashAttribute("successMsg", "Successfully Added...");
		return "redirect:/student/studentdata";
	}
	
	@GetMapping(value = {"/studentdata"})
	public ModelAndView studentdata() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listStudent", studentService.getAllStudent());
		modelAndView.setViewName("Final");
		return modelAndView;
	}
}
