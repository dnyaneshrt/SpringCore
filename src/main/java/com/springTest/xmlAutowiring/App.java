package com.springTest.xmlAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springTest/xmlAutowiring/autoconfig.xml");
	
		Student st1=(Student) applicationContext.getBean("Student");
		System.out.println(st1);
	}

}
