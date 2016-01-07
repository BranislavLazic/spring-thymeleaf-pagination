package org.paginationdemo.controller;

import org.paginationdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

	private PersonService personService;

	@Autowired
	public PersonController(PersonService studentService) {
		this.personService = studentService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showStudentsPage() {
		ModelAndView modelAndView = new ModelAndView("persons");
		modelAndView.addObject("persons", personService.findAllPageable(new PageRequest(0, 5)));
		return modelAndView;
	}

}
