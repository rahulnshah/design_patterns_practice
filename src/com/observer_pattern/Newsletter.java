package com.observer_pattern;

import java.util.ArrayList;
import java.util.Observable;

public class Newsletter implements Subject {
    private ArrayList<Observer> observers;

    public Newsletter()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0)
        {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(String title) {
        for(Observer o : observers)
        {
            o.update(title);
        }
    }

    public void publish(String title)
    {
        notifyObservers(title);
    }
}
