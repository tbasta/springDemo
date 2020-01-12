package FirstSpringApp.Coach;

import FirstSpringApp.Fortune.FortuneService;

public class TrackCoach implements Coach {
    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track workout Bitchessss";
    }

    @Override
    public String getDailyFortune() {
        return "Track fortune: " + fortuneService.getFortune();
    }
}
