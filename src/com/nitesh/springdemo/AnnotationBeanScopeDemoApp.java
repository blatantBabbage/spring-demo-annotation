package com.nitesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //call method on bean
        boolean result = (theCoach == alphaCoach);

        System.out.println("both the beans are equal: " + result);
        System.out.println("location of: " + theCoach);
        System.out.println("location of: " + alphaCoach);
    }
}
