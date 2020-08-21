package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class College {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("StudentConfig.class");
		System.out.println("hiii.. i am loaded");
		Student stu = context.getBean("student", Student.class);
		stu.display();

	}

}
