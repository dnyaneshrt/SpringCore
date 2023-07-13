package com.springTest.SpringITP;

public class Student {
	
	private int rollNo;
	private String studentName;
	private Address studentAddress;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		System.out.println("setting roll no..");
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
}
