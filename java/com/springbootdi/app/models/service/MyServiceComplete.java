package com.springbootdi.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary /* i use primary to assign the default injection */
//@Component("MyServiceComplete")//component name

public class MyServiceComplete implements IService{
	
	
	public String exOperation() {
		// TODO Auto-generated method stub
		return "Bucando Service Complete...";
	}
}
