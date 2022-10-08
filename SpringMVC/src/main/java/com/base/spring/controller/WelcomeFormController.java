package com.base.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class WelcomeFormController {
	
	@RequestMapping("/showForm")
	public String displayHome() {
		return "welcome-form";
	}
	
	@RequestMapping("/process")
	public String processName() {
		return "process-name";
	}
	
	@RequestMapping("/processV2")
	public String processNameVersionTwo(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("fname");
		studentName = studentName.toUpperCase();
		model.addAttribute("StudentName", studentName);
		return "process-name-v2";
	}
	
	// binding request parameter using the @RequestParam annotation
	// Functionality wise this will be same as that of V2.
	@RequestMapping("/processV3")
	public String processNameVersionThree(@RequestParam("fname") String studentName, Model model) {
		studentName = studentName.toUpperCase();
		model.addAttribute("StudentName", studentName);
		return "process-name-v2";
	}

}
