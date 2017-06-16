package Model;
import static Model.Settings.NBNOURRITURE;
import java.lang.Math;

/**
 * Created by Kush on 26/05/2017.
 */
public class Nourriture extends Case{

    public Nourriture(int x, int y) {
        super(x,y);
    }

    @Override
    public void reset() {
        for(int i=0; i< NBNOURRITURE;i++)
        {
            Nourriture n = new Nourriture((int) Math.random(), (int) Math.random());
        }
    }

    @Override
    public void step() {

    }

    @Override
    public void move() {

    }

}
