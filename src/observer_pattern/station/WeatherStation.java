package observer_pattern.station;

import observer_pattern.subject.WeatherSubject;

public class WeatherStation {
    public WeatherSubject weatherSubject;

    public WeatherStation() {
        this.weatherSubject = new WeatherSubject();
    }

    public void setWeather(String weatherData) {
        this.weatherSubject.notify(weatherData);
    }
}
