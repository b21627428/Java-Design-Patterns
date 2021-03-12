package ObserverPattern;

public class Device implements IObserver{

    private IDisplayBehavior iDisplayBehavior;
    private WeatherStation weatherStation;

    public Device(IDisplayBehavior iDisplayBehavior, WeatherStation weatherStation) {
        this.iDisplayBehavior = iDisplayBehavior;
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);
    }

    @Override
    public void update() {
        this.iDisplayBehavior.run(this.weatherStation.getTemperature());
    }

    public IDisplayBehavior getiDisplayBehavior() {
        return iDisplayBehavior;
    }

    public void setiDisplayBehavior(IDisplayBehavior iDisplayBehavior) {
        this.iDisplayBehavior = iDisplayBehavior;
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}
