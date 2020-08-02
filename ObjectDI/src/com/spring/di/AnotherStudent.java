package com.spring.di;

public class AnotherStudent {
	MathStudent mathstudent;

	
	public void setMathstudent(MathStudent mathstudent) {
		this.mathstudent = mathstudent;
	}


	public void disp()
	{
		System.out.println("i am a science Student");
		mathstudent.math();
	}
}
