package com.antjava.observer;

/**
 * Created by younesdiouri on 16/06/2017.
 */
public interface Observable {
    public void addObserver(Observer obs);
    public void removeObserver();
    public void notifyObserver();
}
