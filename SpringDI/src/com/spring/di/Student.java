package com.spring.di;

public class Student {

	public String name;
	public int id;

	public Student(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("my name is:" + name);
		System.out.println("my id is: " + id);
	}
}
