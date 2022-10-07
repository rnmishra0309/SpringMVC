package com.base.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getHome() {
		return "index";
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
	
}
