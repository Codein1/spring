package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve from spring
		Coach theCoach = context.getBean("myFortune", Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());


		System.out.println(theCoach.getDailyFortune());
		// close context
		context.close();
	}

}