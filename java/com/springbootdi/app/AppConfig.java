package com.springbootdi.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springbootdi.app.models.domain.BillItem;
import com.springbootdi.app.models.domain.Product;
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
	
	/**/
	@Bean("billItems")
	public List<BillItem> intemRegister(){
		Product pr1 = new Product("Movie1",12);
		Product pr2 = new Product("Doc!",15);
		
		BillItem it1 = new BillItem(pr1, 20);
		BillItem it2 = new BillItem(pr2, 20);
		
		return Arrays.asList(it1,it2);
	}
}
