package Behavioral.ObserverAndStrategyPattern.Observer;

import Behavioral.ObserverAndStrategyPattern.Display.DisplayBehavior;
import Behavioral.ObserverAndStrategyPattern.Observable.WeatherStation;

public class Device implements Observer {

    private WeatherStation weatherStation;
    private DisplayBehavior displayBehavior;

    public Device(WeatherStation weatherStation, DisplayBehavior displayBehavior) {
        this.weatherStation = weatherStation;
        this.weatherStation.subscribe(this);
        this.displayBehavior = displayBehavior;
    }

    @Override
    public void update() {
        this.displayBehavior.run(this.weatherStation.getTemperature());
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public DisplayBehavior getDisplayBehavior() {
        return displayBehavior;
    }

    public void setDisplayBehavior(DisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }
}
