package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("student",Student.class);
		stu.display();
		AnotherStudent as=context.getBean("abc", AnotherStudent.class);
		as.disp();
		
		/*Student stu=new Student();
		MathStudent ma=new MathStudent();
		stu.setMath(ma);
		stu.display();*/
	}

}
