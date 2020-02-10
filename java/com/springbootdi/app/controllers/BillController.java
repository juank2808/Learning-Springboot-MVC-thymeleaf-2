package com.springbootdi.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootdi.app.models.domain.Bill;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private Bill bill;
	
	
	@GetMapping("/show")
	public String show(Model model) {
		model.addAttribute("bill",bill);
		model.addAttribute("title","Example with dependency injection");
		return "bill/show";
	}
}
