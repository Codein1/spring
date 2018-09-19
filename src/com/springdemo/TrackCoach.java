package com.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService service) {
        this.fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Track Workout";
    }

    @Override
    public String getDailyFortune() {
        return "Do sth" + fortuneService.getFortune();
    }

    //init
    public void gibIhm(){
        System.out.println("startup");
    }

    //destroy
    public void ende(){
        System.out.println("destroedy");
    }
}
