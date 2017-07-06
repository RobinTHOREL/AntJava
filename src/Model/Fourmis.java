package Model;

import View.FourmisVue;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static Model.Settings.*;

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

    public void explore(Fourmilliere fourmilliere) {

        if (this.gotFood) {

            Point home = fourmilliere.getPosition();
            Point fourmi = this.getPosition();
            Point move = new Point(0,0);

            if (this.isHome(fourmilliere)) {
                this.setGotFood(false);
                //permet de relancer les fourmis en chasse
                fourmi.x = 45;
                fourmi.y = 45;

                this.setPosition(fourmi);

                NBFOODFOURMIL++;

                System.out.println("Il y a " + NBFOODFOURMIL + " nourritures dans la fourmilliere, il en reste "
                        + (NBNOURRITURE - NBFOODFOURMIL) + " a trouver dans le monde");
            }

            move.x = home.x - fourmi.x;
            move.y = home.y - fourmi.y;

            if(move.x > 0) {
                move.x = 1;
            }else if(move.x < 0){
                move.x = -1;
            }

            if(move.y > 0) {
                move.y = 1;
            }else if(move.y < 0){
                move.y = -1;
            }

            fourmi.x += move.x;
            fourmi.y += move.y;

            this.setPosition(fourmi);

        } else {

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

            if (((point.x > 40 || point.y > 40) && (point.x > 0 && point.y > 0)
                    && (point.x < LONG - 60 && point.y < HAUT - 60)))
                this.setPosition(point);

//        System.out.println(point.x + ", "+ point.y);
        }
    }

    public boolean isHome(Fourmilliere fourmilliere) {

        Point home = fourmilliere.getPosition();
        Point fourmi = this.getPosition();

        if(fourmi.x <= home.x && fourmi.y <= home.y)
            return true;

        return false;

    }

}
