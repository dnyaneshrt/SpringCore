package com.springTest.SpringITP;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
       
      Student s1= (Student) applicationContext.getBean("student1");

      Student s2= (Student) applicationContext.getBean("student2");
    
      System.out.println(s1);
      System.out.println(s2);
    
    }
}
