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
import com.antjava.observer.Observable;
import com.antjava.observer.Observer;

import javax.swing.*;

import static Model.Settings.*;


public class Model implements Observable {
    private Controlleur controlleur;
    private ArrayList<Observer> listObserver = new ArrayList<Observer>();
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

            Point point = new Point(new Random().nextInt((LONG - 35) - X_START*5)+X_START,
                    new Random().nextInt((HAUT - 35) - Y_START*5)+Y_START);
            Nourriture n = new Nourriture(point);
            n.setNb(1);
            foodList.put(point, n);
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
            fourmis.explore(fourmilliere);
            rechercheNourriture(fourmis);
//            fourmis.isHome(fourmilliere);

        }
    }
    public void nextStep() {
        this.move();
    }
    public void rechercheNourriture(Fourmis fourmis){
            Point position = fourmis.getPosition();
            Nourriture nourriture = this.foodList.get(position);
            if (nourriture != null && nourriture.getNb()!= 0) {
                if(DEBUG)
                    System.out.println("NOURRITURE RECUPEREE" + nourriture.getPosition().x + " , "+ nourriture.getPosition().y);

                foodList.get(position).setNb(0);
                foodList.remove(position);
                fourmis.setGotFood(true);
//                setChanged();
                notifyObserver();
            }

    }

//    @Override
//    public void setChanged() {
//        System.out.println("changed");
//    }

    @Override
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }


    @Override
    public void notifyObserver() {
        if(DEBUG)
            System.out.println("Notify");

        for(Observer observer : listObserver)
        {
            observer.update();
        }

    }
}
