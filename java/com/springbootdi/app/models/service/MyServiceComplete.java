package com.springbootdi.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("MyServiceComplete")//component name
@Primary /* i use primary to assign the default injection */
public class MyServiceComplete implements IService{
	
	
	public String exOperation() {
		// TODO Auto-generated method stub
		return "Bucando Service Complete...";
	}
}
