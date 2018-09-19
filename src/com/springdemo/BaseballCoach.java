package com.springdemo;

public class BaseballCoach implements Coach {


    private FortuneService fortuneService;

    public BaseballCoach(FortuneService service) {
        fortuneService = service;
    }


    @Override
    public String getDailyWorkout() {
        return "BaseBall Workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
