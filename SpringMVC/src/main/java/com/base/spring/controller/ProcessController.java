package com.base.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/control")
public class ProcessController {
	
	@RequestMapping("/showForm")
	public String displayHomePage() {
		return "process-form";
	}
	
	@RequestMapping("/processV4")
	public String processNameVersionFour(@RequestParam("sname") String studentName, Model model) {
		studentName = studentName.toUpperCase();
		model.addAttribute("StudentName", studentName);
		return "process-name-v2";
	}
	
}
