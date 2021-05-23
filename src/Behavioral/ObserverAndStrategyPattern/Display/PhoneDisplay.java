package Behavioral.ObserverAndStrategyPattern.Display;

public class PhoneDisplay implements DisplayBehavior {

    @Override
    public void run(double temperature) {
        System.out.println("Displaying on phone and temperature is " + temperature);
    }
}
