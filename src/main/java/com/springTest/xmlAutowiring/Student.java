package com.springTest.xmlAutowiring;

public class Student {

	private int id;
	private String name;
	private Marks marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id, String name, Marks marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
