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
//    private ArrayList<Nourriture> foodList;
    private HashMap<Point, Nourriture> foodList;
//    private HashMap<Point, Pheromone> pheromoneHashMap;
    private Fourmilliere fourmilliere;
    private Random random;

    public Model(Controlleur controlleur) {
        this.controlleur = controlleur;
        this.fourmisList = new ArrayList<Fourmis>();
        this.foodList = new HashMap<Point, Nourriture>();
//        this.pheromoneHashMap = new HashMap<Point, Pheromone>();
        this.fourmilliere = new Fourmilliere(new Point(10,10));
        this.random = new Random();

        this.initFourmis();
        this.initFood();
    }

    public void initFourmis() {
        for(int i=0;i<NBFOURMIS;i++)
        {
            fourmisList.add(new Fourmis(new Point(40,40),false));
        }
    }

    public void initFood() {
        for(int i=0;i<NBNOURRITURE;i++)
        {
            Point point = new Point(new Random().nextInt(HAUT - X_START*5)+X_START,
                    new Random().nextInt(HAUT - X_START*5)+X_START);
            foodList.put(point,new Nourriture(point));
        }
    }
    public HashMap<Point, Nourriture> getFoodList() {
        return foodList;
    }

    public void setFoodList(HashMap<Point, Nourriture> foodList) {
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
            rechercheNourriture(fourmis);
//            fourmis.isHome(fourmilliere);

        }
    }
    public void nextStep() {
        this.move();
    }
    public void rechercheNourriture(Fourmis fourmis){
//        for (Nourriture nourriture : foodList)
//        {
//            Point tolerance = new Point(1,1);
//            if (fourmis.getPosition() == nourriture.getPosition())
//                System.out.println("FOOD");
//            System.out.println("FOOD : " +nourriture.getPosition() + "ANT : " +fourmis.getPosition());
//        }
//
            Point position = fourmis.getPosition();

            Nourriture food = this.foodList.get(position);
            if (food != null) {
                System.out.println("NOURRITURE RECUPEREE");
            }

    }
}
