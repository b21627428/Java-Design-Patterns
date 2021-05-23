package Behavioral.ObserverAndStrategyPattern.Observable;

import Behavioral.ObserverAndStrategyPattern.Observer.Observer;

public interface Observable {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    boolean isSubscribe(Observer observer);

    void broadcast();
}
