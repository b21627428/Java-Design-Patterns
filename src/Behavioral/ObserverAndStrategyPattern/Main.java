package Behavioral.ObserverAndStrategyPattern;

import Behavioral.ObserverAndStrategyPattern.Display.PhoneDisplay;
import Behavioral.ObserverAndStrategyPattern.Display.TabletDisplay;
import Behavioral.ObserverAndStrategyPattern.Observable.WeatherStation;
import Behavioral.ObserverAndStrategyPattern.Observer.Device;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Device device1 = new Device(weatherStation, new PhoneDisplay());
        Device device2 = new Device(weatherStation, new TabletDisplay());

        weatherStation.broadcast();
        weatherStation.setTemperature(20);
        weatherStation.broadcast();

        device2.setDisplayBehavior(new PhoneDisplay());
        device2.update();
    }
}
