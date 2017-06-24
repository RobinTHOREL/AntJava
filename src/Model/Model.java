package Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Controller.Controlleur;
import Model.Fourmis;
import java.awt.*;
import java.util.Random;
import Model.Fourmilliere;
import Model.Pheromone;
import Model.Nourriture;
import javax.swing.*;

import static Model.Settings.*;


public class Model {
    private Controlleur controlleur;

    private ArrayList<Fourmis> fourmisList;
    private ArrayList<Nourriture> foodList;
//    private HashMap<Point, Pheromone> pheromoneHashMap;
    private Fourmilliere fourmilliere;
    private Random random;

    public Model(Controlleur controlleur) {
        this.controlleur = controlleur;
        this.fourmisList = new ArrayList<Fourmis>();
        this.foodList = new ArrayList<Nourriture>();
//        this.pheromoneHashMap = new HashMap<Point, Pheromone>();
        this.fourmilliere = new Fourmilliere(new Point(10,10));
        this.random = new Random();

        this.initFourmis();
        this.initFood();
    }

    public void initFourmis() {
        for(int i=0;i<NBFOURMIS;i++)
        {
            fourmisList.add(new Fourmis(new Point(10,10),false));
        }
    }

    public void initFood() {
        for(int i=0;i<NBNOURRITURE;i++)
        {
            foodList.add(new Nourriture(new Point(new Random().nextInt(HAUT - X_START*5)+X_START,
                    new Random().nextInt(HAUT - X_START*5)+X_START)));
        }
    }
    public ArrayList<Nourriture> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Nourriture> foodList) {
        this.foodList = foodList;
    }

    public Fourmilliere getFourmilliere() {
        return fourmilliere;
    }

    public void setFourmilliere(Fourmilliere fourmilliere) {
        this.fourmilliere = fourmilliere;
    }

    public ArrayList<Fourmis> getFourmisList() {
        return fourmisList;
    }

    public void setFourmisList(ArrayList<Fourmis> fourmisList) {
        this.fourmisList = fourmisList;
    }
    private void move() {
        for (Fourmis fourmis : fourmisList) {
            fourmis.explore();
        }
    }
    public void nextStep() {
        this.move();
    }
}
