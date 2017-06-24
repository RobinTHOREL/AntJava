package Model;

import java.awt.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Pheromone  extends Case{

    int posX;
    int posY;

    public Pheromone(Point position) {
    super(position);

    }

    public int getX(){ return this.posX; }

    public int getY(){ return this.posY; }

    @Override
    public void reset(Graphics g) {

    }

    @Override
    public void nextStep(Graphics g) {

    }

    @Override
    public void move() {

    }

}
