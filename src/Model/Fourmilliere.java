package Model;

import java.util.ArrayList;

/**
 * Created by OG Kush on 26/05/2017.
 */
public class Fourmilliere extends Case{

    private int stock;

    public Fourmilliere(int x, int y) {
        super(x,y);
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
    public void step() {

    }

    @Override
    public void move() {

    }

}
