package ObserverPattern;

public interface IObservable {

    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void broadcast();
}
