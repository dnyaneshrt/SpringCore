package com.springTest.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Inside Constructor injection..");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springTest/ConsInjection/config.xml");

		Car car1=(Car) applicationContext.getBean("audi_car");
		System.out.println(car1);
		Car car2=(Car) applicationContext.getBean("BMW_car");
		System.out.println(car2);
	}

}
