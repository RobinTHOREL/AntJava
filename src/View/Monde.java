package View;
import Controller.Controlleur;
import Model.Fourmilliere;
import Model.Fourmis;
import Model.Model;
import Model.Nourriture;
import com.antjava.observer.*;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import static Model.Settings.*;


/**
 * Created by Kush on 26/05/2017.
 */

public class Monde extends JFrame implements Observer{
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
        model.addObserver(this);
        this.initFourmis(model.getFourmisList());
      this.initNourriture(model.getFoodList());
      this.initFourmilliere(model.getFourmilliere());
        this.revalidate();
        this.repaint();
    }
    public void update(Observable o, Object arg) {
        if(DEBUG)
            System.out.println("update");

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
    private void initNourriture(HashMap<Point, Nourriture> foodList) {
        for (Point position: foodList.keySet()) {
            Nourriture nourriture = foodList.get(position);
            JPanel vue = nourriture.getVue();
            this.add(vue);
        }
    }
    private void initFourmilliere(Fourmilliere fourmilliere)
    {
        JPanel vue = fourmilliere.getVue();
        this.add(vue);
    }

    @Override
    public void update() {
        if(DEBUG)
            System.out.println("update!");

        repaint();
    }

}

