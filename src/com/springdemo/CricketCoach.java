package com.springdemo;

public class CricketCoach implements Coach {


    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside Setter Methode");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    private String emailAddress;

    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Team gesetzt");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Team gesetzt");
        this.team = team;
    }
}
