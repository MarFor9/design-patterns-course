package design.patterns.observer.weatherforecast.notification;

import design.patterns.observer.weatherforecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
