package weather.forecast.observer.weatherforecast;

import weather.forecast.observer.weatherforecast.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
