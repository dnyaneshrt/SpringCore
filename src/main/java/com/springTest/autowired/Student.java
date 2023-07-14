package com.springTest.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int id;
	
	@Autowired
	@Qualifier("marks1")
	private Marks marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter injection");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, Marks marks) {
		super();
		this.id = id;
		this.marks = marks;
		System.out.println("from const");
	}
}
