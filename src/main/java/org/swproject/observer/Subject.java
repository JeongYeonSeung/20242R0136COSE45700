package org.swproject.observer;

public interface Subject {
    
    void attachObserver(Observer o);

    void detachObserver(Observer o);

    void notifyObserver();
}
