package FirstSpringApp.Coach;

import FirstSpringApp.Fortune.FortuneService;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String name;
    private String team;

    public CricketCoach() {
        System.out.println("We are in constructor now");
    }

    @Override
    public String getDailyWorkout() {
        return "Workout for Cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
