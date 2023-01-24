package weather.forecast.observer.weatherforecast.notification;

import weather.forecast.observer.weatherforecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
