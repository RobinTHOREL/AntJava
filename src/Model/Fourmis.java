package Model;

import View.FourmisVue;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static Model.Settings.HAUT;
import static Model.Settings.LONG;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmis extends Case {

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

    public void explore() {
        int direction = new Random().nextInt(8);


        Point point = this.getPosition();
        Point newPoint = new Point(0, 0);

        switch (direction) {
            case 0:
                newPoint.x += 0;
                newPoint.y -= 1;
                break;
            case 1:
                newPoint.x += 1;
                newPoint.y -= 1;
                break;
            case 2:
                newPoint.x += 1;
                newPoint.y += 0;
                break;
            case 3:
                newPoint.x += 1;
                newPoint.y += 1;
                break;
            case 4:
                newPoint.x += 0;
                newPoint.y += 1;
                break;
            case 5:
                newPoint.x -= 1;
                newPoint.y += 1;
                break;
            case 6:
                newPoint.x -= 1;
                newPoint.y += 0;
                break;
            case 7:
                newPoint.x -= 1;
                newPoint.y -= 1;
                break;
        }


        point.x += newPoint.x;
        point.y += newPoint.y;

        if (
                ((point.x > 40 || point.y > 40) && (point.x > 0 && point.y > 0 && (point.x < LONG - 25 && point.y < HAUT - 25))))
            this.setPosition(point);
        // TODO : Resolve getting out of frame problem. thoughts : None...
//        System.out.println(point.x + ", "+ point.y);
    }

    public void isHome(Fourmilliere fourmilliere) {
        Point home = fourmilliere.getPosition();
        Point fourmi = this.getPosition();
//        Point distancePoint = new Point();
//        distancePoint.x = home.x - fourmi.x ;
//        distancePoint.y = home.y - fourmi.y ;
        double distance = Math.sqrt(Math.pow((home.x - fourmi.x), 2) + Math.pow((home.y - fourmi.y), 2));
        if (distance > 30) {
//            System.out.println("Sortie : " + distance);
        }


    }

}
