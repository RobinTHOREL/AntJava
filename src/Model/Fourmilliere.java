package Model;

import java.util.ArrayList;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmilliere {

    int posX;
    int posY;

    ArrayList<Fourmis> listFourmis;
    ArrayList<Nourriture> listFood;

    public Fourmilliere(int x, int y) {

        this.posX = x;
        this.posY = y;

    }

    public int getX(){ return this.posX; }

    public int getY(){ return this.posY; }

}
