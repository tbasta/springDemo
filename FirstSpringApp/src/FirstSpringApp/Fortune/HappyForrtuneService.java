package FirstSpringApp.Fortune;

public class HappyForrtuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Thats your lucky day";
    }
}
