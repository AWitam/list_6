package observer_pattern.subject;

import observer_pattern.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    public List<Observer> observers = new ArrayList<>();

    public WeatherSubject() {}

    @Override
    public void subscribe(Observer observer) {
        if (observers.contains(observer) ) {
            System.out.println("Observer already subscribed");
        }
        observers.add(observer);
        System.out.println("Observer subscribed");
    }

    public void unsubscribe( Observer observer) {
        if (!observers.contains(observer) ) {
            System.out.println("Non existing observer");
        }
        observers.remove(observer);
        System.out.println("Observer unsubscribed");
    }


    public void notify(String weatherData) {
        for (Observer observer : this.observers) {
            observer.update(weatherData);
        }
    }
}


