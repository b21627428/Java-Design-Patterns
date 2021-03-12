package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    private List<IObserver> observerList;
    private double temperature;

    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(IObserver iObserver) {
        this.observerList.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        this.observerList.remove(iObserver);
    }

    @Override
    public void broadcast() {
        this.observerList.forEach(IObserver::update);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public List<IObserver> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<IObserver> observerList) {
        this.observerList = observerList;
    }
}
