package design.patterns.observer.weatherforecast;

import design.patterns.observer.weatherforecast.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer oberver) {
        registeredObservers.remove(oberver);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(observer -> observer.updateForecast(this));
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }
}
