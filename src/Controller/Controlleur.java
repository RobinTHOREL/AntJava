package Controller;

import Model.*;
import View.Monde;
import javax.swing.*;

import static Model.Settings.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Controlleur {

    private Fourmilliere fourmilliere;
    private Fourmis fourmis;
    private Pheromone pheromone;
    private Nourriture nourriture;
    private Monde monde;

    public Controlleur(Fourmilliere fourmilliere, Fourmis fourmis, Pheromone pheromone,
                       Nourriture nourriture, Monde monde)
    {
        this.fourmilliere = fourmilliere;
         this.fourmis = fourmis;
         this.pheromone = pheromone;
         this.nourriture = nourriture;
         this.monde = monde;

    }
//    public void addFourmis() {
//        for(int i = 0; i < NBFOURMIS; i++){
//            new Fourmis(X_START, Y_START, false);
//        }
//    }
//    public void addRandomFood() {
//        for(int i = 0; i < NBNOURRITURE; i++){
//            Nourriture n = new Nourriture((int)Math.random()*(HAUT-X_START),
//                    (int)Math.random()*(LONG-Y_START));
//            n.notifyObserver();
//        }
    }

//    public void addFourmiliere() {
//        Fourmilliere f = new Fourmilliere(10,10);
//    }




