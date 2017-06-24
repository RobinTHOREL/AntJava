package Model;
import com.antjava.observer.Observer;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

import static Model.Settings.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Nourriture extends Case{

    public Nourriture(Point position) {
        super(position);
    }

    @Override
    public void reset() {
        for(int i=0; i< NBNOURRITURE;i++)
        {
//            Nourriture n = new Nourriture((int) Math.random(), (int) Math.random());
        }
    }

    @Override
    public void nextStep(Graphics g) {
        //image.paintIcon(panel, g, x, y); - commented out because I don't have an ImageIcon
        g.setColor(Color.darkGray);
        g.fillRect(new Random().nextInt(HAUT - X_START)+X_START ,
                new Random().nextInt(HAUT - X_START)+X_START , 5, 5);
        System.out.println("food created");
    }

    @Override
    public void move() {

    }

    public void notifyObserver() {
        System.out.println("observer notified.");
    }

}
