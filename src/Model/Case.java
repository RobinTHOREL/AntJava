package Model;

import com.antjava.observer.Observable;

import com.antjava.observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * Created by younesdiouri on 16/06/2017.
 */
public abstract class Case implements Observable {
    protected Point position;

    public Case(Point position){
        this.position = position;
    }
    public Point getPosition(){
        return new Point(this.position);
    }

    public void setPosition(Point position){
        this.position = position;
    }

    private ArrayList<Observer> listObserver = new ArrayList<Observer>();
    //Efface
    public abstract void reset();

    //Step method
    public abstract void nextStep(Graphics g);

    //Affichage forcé du résultat
    public abstract void move();

    //Implémentation du pattern observer
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    public void notifyObserver() {
        System.out.println("observer notified.");
        for(Observer obs : listObserver)
            obs.update();
    }

    public void removeObserver() {
        listObserver = new ArrayList<Observer>();
    }
}

