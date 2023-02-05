package observer_pattern.subject;

import observer_pattern.observers.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notify(String weatherData);
}
