package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBoot {
	public static void main(String[] args) {
		//it returns ApplicationContext
		SpringApplication.run(MySpringBoot.class,args);
	}

}
