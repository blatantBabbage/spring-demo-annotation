package com.nitesh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] arg) {

        //load spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
