package Model;

import View.FourmisVue;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmis extends Case{

   private boolean gotFood;


    public Fourmis(Point position, boolean gotFood) {
        super(position);
        this.vue = new FourmisVue(this);
        this.gotFood = false;
    }

    public boolean getGotFood() {
        return gotFood;
    }

    public void setGotFood(boolean gotFood) {
        this.gotFood = gotFood;
    }

    @Override
    public void reset(Graphics g) {
//        g.setColor(Color.black);
//        g.drawOval(10, 10, 8, 8);
//        System.out.println("ant created");
    }

    @Override
    public void nextStep(Graphics g) {

    }

    @Override
    public void move() {

    }

    public void explore()
    {
        int direction = new Random().nextInt(8);


        Point point = this.getPosition();
        Point move = new Point(0, 0);

        switch (direction) {
            case 0:
                move.x += 0;
                move.y -= 1;
                break;
            case 1:
                move.x += 1;
                move.y -= 1;
                break;
            case 2:
                move.x += 1;
                move.y += 0;
                break;
            case 3:
                move.x += 1;
                move.y += 1;
                break;
            case 4:
                move.x += 0;
                move.y += 1;
                break;
            case 5:
                move.x -= 1;
                move.y += 1;
                break;
            case 6:
                move.x -= 1;
                move.y += 0;
                break;
            case 7:
                move.x -= 1;
                move.y -= 1;
                break;
        }


        point.x += move.x;
        point.y += move.y;


        this.setPosition(point);
    }

}
