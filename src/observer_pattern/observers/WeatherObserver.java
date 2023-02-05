package observer_pattern.observers;

public class WeatherObserver implements Observer {
    private String email;
    private String weatherData;

    public WeatherObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String weatherData) {
        this.weatherData = weatherData;
        System.out.println(email + " received weather update: " + this.weatherData);
    }
}

