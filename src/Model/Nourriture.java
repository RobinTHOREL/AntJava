package Model;
import View.NourritureVue;
import com.antjava.observer.Observer;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

import static Model.Settings.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Nourriture extends Case{
    public int nb;

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public Nourriture(Point position) {
        super(position);
        this.vue = new NourritureVue(this);
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
