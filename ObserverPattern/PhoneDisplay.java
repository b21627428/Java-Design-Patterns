package ObserverPattern;

public class PhoneDisplay implements IDisplayBehavior{

    @Override
    public void run(double temperature) {
        System.out.println(temperature);
    }
}
