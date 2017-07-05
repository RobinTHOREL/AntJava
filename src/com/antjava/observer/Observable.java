package com.antjava.observer;

/**
 * Created by younesdiouri on 16/06/2017.
 */
public interface Observable {
//    public void setChanged();
    public void addObserver(Observer obs);
    public void notifyObserver();
}
