package org.paginationdemo.controller;

import org.paginationdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showStudentsPage() {
		return new ModelAndView("students");
	}

}
