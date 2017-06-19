package Model;

/**
 * Created by Kush on 26/05/2017.
 */
public class Fourmis extends Case{

   private boolean gotFood;

    public Fourmis(int x, int y, boolean gotFood) {

        super(x,y);
        gotFood = false;
    }

    public boolean isGotFood() {
        return gotFood;
    }

    public void setGotFood(boolean gotFood) {
        this.gotFood = gotFood;
    }

    @Override
    public void reset() {

    }

    @Override
    public void step() {

    }

    public void move() {

    }
    public String getPosition()
    {
        return "("+getX()+","+getY()+")";
    }
}
