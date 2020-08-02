package com.spring.di;

public class Student {
	
	MathStudent math;
	
	public void setMath(MathStudent math) {
		this.math = math;
	}

	public void display()
	{
		
		System.out.println("i am Student");
		math.math();
	}
	
	
	

}
