package com.spring.core;

import org.springframework.config.java.annotation.Bean;
import org.springframework.config.java.annotation.Configuration;

@Configuration
public class StudentConfig {
	
     @Bean
	public Student student()
	{
		return new Student();
	}

}
