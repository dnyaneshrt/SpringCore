package com.springTest.autowired;

public class Marks {
  private int math_marks;
  private int eng_marks;
public Marks(int math_marks, int eng_marks) {
	super();
	this.math_marks = math_marks;
	this.eng_marks = eng_marks;
	System.out.println("constructor auto injection");
}
public int getMath_marks() {
	return math_marks;
}
public Marks() {
	super();
}
public void setMath_marks(int math_marks) {
	this.math_marks = math_marks;
}
public int getEng_marks() {
	return eng_marks;
}
public void setEng_marks(int eng_marks) {
	this.eng_marks = eng_marks;
}
@Override
public String toString() {
	return "Marks [math_marks=" + math_marks + ", eng_marks=" + eng_marks + "]";
}

  
}
