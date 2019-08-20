package com.yxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication /* (exclude = {DataSourceAutoConfiguration.class}) */
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
	}
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello word！";
	}

}
