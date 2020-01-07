package com.kodilla.patterns2.observer.forum.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
