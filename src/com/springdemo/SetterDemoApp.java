package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterDemoApp {
    public static void main(String[] args) {

        //load spring file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean
        TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);

        //call methods
//        System.out.println(theCoach.getEmailAddress());
//
//        System.out.println(theCoach.getTeam());
//
//        System.out.println(theCoach.getDailyFortune());
        //close context

        context.close();
    }
}
