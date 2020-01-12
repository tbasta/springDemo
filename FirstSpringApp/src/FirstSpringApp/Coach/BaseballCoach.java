package FirstSpringApp.Coach;

import FirstSpringApp.Fortune.FortuneService;

public class BaseballCoach implements Coach {
    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball workout bichesss";
    }

    @Override
    public String getDailyFortune() {
        return "Baseball fortune : " + fortuneService.getFortune();
    }
}
