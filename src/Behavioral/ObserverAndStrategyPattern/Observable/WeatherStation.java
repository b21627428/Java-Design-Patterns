package Behavioral.ObserverAndStrategyPattern.Observable;

import Behavioral.ObserverAndStrategyPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WeatherStation implements Observable {

    private List<Observer> observerList;
    private double temperature;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public boolean isSubscribe(Observer observer) {
        return observerList.contains(observer);
    }

    @Override
    public void subscribe(Observer observer) {
        if (!isSubscribe(observer)) observerList.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        if (isSubscribe(observer)) observerList.remove(observer);
    }

    @Override
    public void broadcast() {
        Consumer<Observer> updateDisplay = Observer::update;
        observerList.forEach(updateDisplay);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
