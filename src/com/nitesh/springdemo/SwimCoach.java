package com.nitesh.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout(){
        return "Swim 1000m as warm-up";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
