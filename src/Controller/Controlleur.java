package Controller;

import Model.Fourmilliere;
import Model.Nourriture;
import View.Monde;

import java.awt.*;

import static Model.Settings.HAUT;
import static Model.Settings.LONG;
import static Model.Settings.NBNOURRITURE;

/**
 * Created by Kush on 26/05/2017.
 */
public class Controlleur {

    public void launchWorld() {
        Monde m = new Monde();
    }
    public void addRandomFood() {
        for(int i = 0; i < NBNOURRITURE; i++){
            Nourriture n = new Nourriture(i/LONG, (i/HAUT)*2);
        }
    }

    public void addFourmiliere() {
        Fourmilliere f = new Fourmilliere(10,10);
    }

    public void paintComponnent(Graphics g) {
        g.fillRect(10, 10, 20, 20);
        System.out.println("ok");
    }
}
