package observer_pattern;

import observer_pattern.observers.WeatherObserver;
import observer_pattern.station.WeatherStation;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver observer1 = new WeatherObserver("kate@gmail.com");
        WeatherObserver observer2 = new WeatherObserver("tom@gmail.com");
        WeatherObserver observer3 = new WeatherObserver("dan@gmail.com");

        weatherStation.weatherSubject.subscribe(observer1);
        weatherStation.weatherSubject.subscribe(observer2);
        weatherStation.weatherSubject.subscribe(observer3);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");

        weatherStation.weatherSubject.unsubscribe(observer3);

    }
}
