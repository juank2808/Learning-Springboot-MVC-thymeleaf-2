package com.springbootdi.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootdi.app.models.service.IService;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("MyServiceComplete")
	private IService service;
	/*I use Interface cause is better than use Java class*/
	
	
	public IndexController(IService service) {
		this.service = service;
	}
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("obj",service.exOperation());
		return "index";
	}
	
	
	
	/*public void setService(IService service) {
		this.service = service;
	}*/
	
}
