package Behavioral.ObserverAndStrategyPattern.Display;

public class TabletDisplay implements DisplayBehavior {


    @Override
    public void run(double temperature) {
        System.out.println("Displaying on table and temperature is " + temperature);
    }
}
