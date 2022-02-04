package com.nitesh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] arg) {

        //load spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the beans
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call method on bean
        System.out.println(theCoach.getDailyWorkout());

        //call method on bean
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());


        //close context
        context.close();
    }
}
