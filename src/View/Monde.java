package View;
import Controller.Controlleur;
import Model.Fourmilliere;
import Model.Fourmis;
import Model.Model;
import Model.Nourriture;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static Model.Settings.*;
import static Model.Settings.LARGEUR_FOURMILLIERE;


/**
 * Created by Kush on 26/05/2017.
 */

public class Monde extends JFrame {
    private Controlleur controlleur;

    public Monde() {


        this.setSize(LONG, HAUT);
        this.setTitle("Monde - Simulation");
        this.setLayout(new BorderLayout());

        this.setLocation(550, 100);
//        frame.add(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void init(Model model) {
      this.initFourmis(model.getFourmisList());
      this.initNourriture(model.getFoodList());
      this.initFourmilliere(model.getFourmilliere());
        this.revalidate();
        this.repaint();
    }
    public void paint(Model model){
        this.repaint();
    }
    private void initFourmis(ArrayList<Fourmis> fourmisList) {
        for (Fourmis fourmis : fourmisList) {
            JPanel vue = fourmis.getVue();
            this.add(vue);
        }
    }
    private void initNourriture(ArrayList<Nourriture> foodList) {
        for (Nourriture nourriture : foodList) {
            System.out.println(nourriture.getPosition());
            JPanel vue = nourriture.getVue();
            this.add(vue);
        }
    }
    private void initFourmilliere(Fourmilliere fourmilliere)
    {
        JPanel vue = fourmilliere.getVue();
        this.add(vue);
    }

}

