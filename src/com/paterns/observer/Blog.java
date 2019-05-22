package com.paterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public Blog() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
            obj.setSubject(this);
        }
    }

    @Override
    public void unregister(Observer obj) {
        obj.setSubject(null);
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("В блог была добавлена запись: " + msg);
        this.message = msg;
        notifyObservers();
    }
}
