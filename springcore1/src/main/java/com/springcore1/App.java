package com.springcore1;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("setterdemo.xml");
        company ob1=(company) context.getBean("s1");
        company ob2=(company) context.getBean("s2");
       
        System.out.println(ob1);
        System.out.println(ob2);
    }
}