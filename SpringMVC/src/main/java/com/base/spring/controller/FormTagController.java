package com.base.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.spring.model.Student;

@Controller
@RequestMapping("/tag")
public class FormTagController {
	
	@RequestMapping("/showForm")
	public String showForm(Model studentModel) {
		Student student = new Student();
		studentModel.addAttribute("student", student);
		return "process-name-v3";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	/**
	 * When performing Spring MVC validation, the location of the BindingResult parameter is very important. 
	 * In the method signature, the BindingResult parameter must appear immediately after the model attribute. 
	 * If you place it in any other location, Spring MVC validation will not work as desired. 
	 * In fact, your validation rules will be ignored.
	 * 
	 * In this case, a caveat is that white spaces can be a valid field and it will be processed.
	 * So, we need a initBinder annotation.
	 * @param student
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "process-name-v3";
		}
		student.setFirstName(student.getFirstName().toUpperCase());
		student.setLastName(student.getLastName().toUpperCase());
		student.setCountry(student.getCountry().toUpperCase());
		student.setFavouriteLanguage(student.getFavouriteLanguage().toUpperCase());
		return "process-name-v4";
	}
	
}
