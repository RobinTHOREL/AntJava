package View;
import Controller.Controlleur;
import Model.Fourmilliere;
import Model.Fourmis;
import Model.Model;
import Model.Nourriture;
import Model.Pheromone;
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
            JPanel vueFourmis = fourmis.getVue();
            this.add(vueFourmis);
        }
    }
    private void initNourriture(HashMap<Point, Nourriture> foodList) {
        for (Point position: foodList.keySet()) {
            Nourriture nourriture = foodList.get(position);
            JPanel vueNourriture = nourriture.getVue();
            this.add(vueNourriture);
        }
    }
    private void initFourmilliere(Fourmilliere fourmilliere)
    {
        JPanel vueFourmilliere = fourmilliere.getVue();
        this.add(vueFourmilliere);
    }
    public void placerPheromone(Pheromone pheromone){
//        JPanel vuePheromone = pheromone.getVue();
        this.add(pheromone.getVue());
    }
    private void creerPheromones(HashMap<Point, Pheromone> pheromoneList)
    {

            for (Point point: pheromoneList.keySet())
            {
                Pheromone pheromone = pheromoneList.get(point);
                System.out.println(point.x+" "+point.y);
                JPanel vuePheromones = pheromone.getVue();
                this.add(vuePheromones);
            }


    }
    @Override
    public void update() {
        if(DEBUG)
            System.out.println("update!");

        repaint();
    }

}

