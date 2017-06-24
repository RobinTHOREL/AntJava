package Model;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmis extends Case{

   private boolean gotFood;


    public Fourmis(Point position, boolean gotFood) {

        super(position);
        this.gotFood = false;
    }

    public boolean getGotFood() {
        return gotFood;
    }

    public void setGotFood(boolean gotFood) {
        this.gotFood = gotFood;
    }

    @Override
    public void reset() {

    }

    @Override
    public void nextStep(Graphics g) {
        g.setColor(Color.black);
        g.drawOval(10, 10, 8, 8);
        System.out.println("ant created");
    }

    public void move() {

    }

}
