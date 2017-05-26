package Model;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmis {

    int posX;
    int posY;
    boolean gotFood;

    public Fourmis(int x, int y) {

        this.posX = x;
        this.posY = y;
        gotFood = false;

    }

    public int getX(){ return this.posX; }

    public int getY(){ return this.posY; }

    public void move() {

    }
}
