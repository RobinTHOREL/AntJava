package Model;
import View.PheromoneVue;
import com.antjava.observer.Observer;

import java.awt.*;

import static Model.Settings.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Pheromone extends Case{
    public int nb;

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public Pheromone (Point position) {
        super(position);
        this.vue = new PheromoneVue(this);
        this.nb = nb;
    }

    @Override
    public void reset(Graphics g) {

    }

    @Override
    public void nextStep(Graphics g) {

    }

    @Override
    public void move() {

    }

    public void notifyObserver() {
        System.out.println("observer notified.");
    }

}
