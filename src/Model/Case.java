package Model;

import com.antjava.observer.Observable;

import com.antjava.observer.Observer;
import java.util.ArrayList;
/**
 * Created by younesdiouri on 16/06/2017.
 */
public abstract class Case implements Observable {
    public int x;
    public int y;

    public Case(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    private ArrayList<Observer> listObserver = new ArrayList<Observer>();
    //Efface
    public abstract void reset();

    //Step method
    public abstract void step();

    //Affichage forcé du résultat
    public abstract void move();

    //Implémentation du pattern observer
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    public void notifyObserver() {

        for(Observer obs : listObserver)
            obs.update();
    }

    public void removeObserver() {
        listObserver = new ArrayList<Observer>();
    }
}

