package design.patterns.observer.weatherforecast.notification;

import design.patterns.observer.weatherforecast.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: "+ weatherForecast.getTemperature() + " stopni, ciśnienie: " +  weatherForecast.getPressure() + "hPa\n");
    }
}
