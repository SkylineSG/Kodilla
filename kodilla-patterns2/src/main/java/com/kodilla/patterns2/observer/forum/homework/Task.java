package com.kodilla.patterns2.observer.forum.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable{

    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;


    public Task(String name) {
        this.messages = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        messages.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
