package com.nitesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] arg) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the beans
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call method on bean
        System.out.println(theCoach.getDailyWorkout());

        //call method on bean
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
