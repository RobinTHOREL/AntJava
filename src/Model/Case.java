package Model;

import java.util.ArrayList;

/**
 * Created by Kush on 01/06/2017.
 */

public class Case {

    public int x;
    public int y;
    public ArrayList<Object> objInCase;

    public Case(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void addFourmi(Fourmis f) { objInCase.add(f); }

    public void addPheromone(Pheromone p ){
        objInCase.add(p);
    }

    public void addNourriture(Nourriture n){
        objInCase.add(n);
    }

    public void delFourmi(Fourmis f) {
        objInCase.remove(f);
    }

    public void delPheromone(Pheromone p ){
        objInCase.remove(p);
    }

    public void delNourriture(Nourriture n){
        objInCase.remove(n);
    }



}
