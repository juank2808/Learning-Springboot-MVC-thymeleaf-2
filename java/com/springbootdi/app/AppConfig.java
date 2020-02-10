package com.springbootdi.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springbootdi.app.models.service.IService;
import com.springbootdi.app.models.service.MyService;
import com.springbootdi.app.models.service.MyServiceComplete;

@Configuration
public class AppConfig {

	@Bean("MyServiceSimple")
	public IService serviceRegister() {
		return new MyService();
	}
	@Bean("MyServiceComplete")
	@Primary
	public IService serviceRegisterComplete() {
		return new MyServiceComplete();
	}
}
