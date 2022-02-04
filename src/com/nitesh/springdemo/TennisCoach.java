package com.nitesh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    //define init method
    @PostConstruct
    public void doMyStartup(){
        System.out.println("start my stuff in tenniscoach");
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanup() {
        System.out.println("start cleaning my stuff in tenniscoach");
    }


    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
     */

    /*
    @Autowired
    public TennisCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "practice backhand volley";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
