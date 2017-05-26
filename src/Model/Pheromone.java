package Model;

/**
 * Created by Kush on 26/05/2017.
 */
public class Pheromone {

    int posX;
    int posY;

    public Pheromone(int x, int y) {

        this.posX = x;
        this.posY = y;

    }

    public int getX(){ return this.posX; }

    public int getY(){ return this.posY; }

}
