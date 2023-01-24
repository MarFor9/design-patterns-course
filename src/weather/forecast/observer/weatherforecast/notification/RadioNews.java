package weather.forecast.observer.weatherforecast.notification;

import weather.forecast.observer.weatherforecast.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: "+ weatherForecast.getTemperature() + " stopni, ciśnienie: " +  weatherForecast.getPressure() + "hPa\n");
    }
}
