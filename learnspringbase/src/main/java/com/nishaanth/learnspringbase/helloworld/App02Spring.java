package com.nishaanth.learnspringbase.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Spring {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));

		System.out.println(context.getBean("person2MethodCall"));

		System.out.println(context.getBean("person3Para"));
		
		System.out.println(context.getBean("address"));
				}
	}
}