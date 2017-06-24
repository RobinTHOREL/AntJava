package Model;
import com.antjava.observer.Observable;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by OG Kush on 26/05/2017.
 */
public class Fourmilliere extends Case{

    private int stock;

    public Fourmilliere(Point position) {
        super(position);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void reset() {
        this.stock = 0;
    }

    @Override
    public void nextStep(Graphics g) {
        notifyObserver();
    }

    @Override
    public void move() {

    }



}
