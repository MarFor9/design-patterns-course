package design.patterns.observer.weatherforecast;

import design.patterns.observer.weatherforecast.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
