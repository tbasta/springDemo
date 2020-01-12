package FirstSpringApp;

import FirstSpringApp.Coach.Coach;
import FirstSpringApp.Coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach = context.getBean("myTrackCoach", Coach.class);
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println();

        Coach trackCoach = context.getBean("myBaseballCoach", Coach.class);
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());
        System.out.println();

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getName());
        System.out.println(cricketCoach.getTeam());

        //dodany nowy komentarz
    }
}
