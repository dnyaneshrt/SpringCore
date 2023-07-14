package com.springTest.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springTest/autowired/autowired.xml");
	
	Student st1=(Student) applicationContext.getBean("Student");
	System.out.println(st1);
}
}
