package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("student",Student.class);
		stu.display();
	}

}
