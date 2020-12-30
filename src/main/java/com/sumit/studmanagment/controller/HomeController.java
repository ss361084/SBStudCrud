package com.sumit.studmanagment.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sumit.studmanagment.model.Student;
import com.sumit.studmanagment.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private MessageSource messageSource;

	@PostMapping(value = {"/addstudent"})
	public String saveStudent(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult, Model model,RedirectAttributes attributes, HttpServletRequest req) {
		String opType = StringUtils.hasLength(req.getParameter("opType")) ? req.getParameter("opType"):"";
		if(bindingResult.hasErrors()) {
			return "AddStudent";
		}
		if(studentService.getStudentByEmail(student.getEmail()) > 0 && student.getStudId() == 0) {
			model.addAttribute("errMsg", messageSource.getMessage("student_already_register", null, Locale.ENGLISH));
			return "AddStudent";
		} else {
			studentService.saveStudent(student);
			attributes.addFlashAttribute("successMsg", opType.equals("edit") ? messageSource.getMessage("student_update_successfully", null, Locale.ENGLISH)
														: messageSource.getMessage("student_add_successfully", null, Locale.ENGLISH));
		}
		return "redirect:/";
	}
	
	@GetMapping(value = {"/"})
	public ModelAndView studentdata(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listStudent", studentService.getAllStudent());
		modelAndView.setViewName("StudentDetail");
		return modelAndView;
	}
	
	@GetMapping(value = {"/showstudnetpage"})
	public String showStudentPage(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("opType", "save");
		return "AddStudent";
	}
	
	@GetMapping(value = {"/deletestudent/{studentId}"})
	public String deleteStudent(@PathVariable(value = "studentId") long studentId, RedirectAttributes redirectAttributes) {
		if(studentId != 0) {
			studentService.deleteStudentById(studentId);
			redirectAttributes.addFlashAttribute("successMsg", messageSource.getMessage("student_deleted_successfully", null, Locale.ENGLISH));
		}
		return "redirect:/";
	}
	
	@GetMapping(value = {"/updatestudent/{studentId}"})
	public String showStudentUpdateData(@PathVariable(value = "studentId") long studentId, Model model) {
		if(studentId != 0) {
			model.addAttribute("student", studentService.getStudentById(studentId));
			model.addAttribute("opType", "edit");
		}
		return "AddStudent";
	}
}
