package ObserverPattern;

public class Main {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        Device device = new Device(new PhoneDisplay(), station);
        station.broadcast();
    }
}
