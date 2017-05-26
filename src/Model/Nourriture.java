package Model;

/**
 * Created by Kush on 26/05/2017.
 */
public class Nourriture {

    int posX;
    int posY;
    boolean isCarried;

    public Nourriture(int x, int y) {

        this.posX = x;
        this.posY = y;
        isCarried = false;

    }

    public int getX(){ return this.posX; }

    public int getY(){ return this.posY; }

}
