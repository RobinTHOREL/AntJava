package Model;

import java.awt.*;

/**
 * Created by Kush on 14/06/2017.
 */
public class Settings {
    //Dimension de la fenetre de similation
    public static int LONG = 800;
    public static int HAUT = 600;
    // temps en ms du pas de la simulation
    public static final int DELAY = 3;
    // Longueur et largeur de chaque element (plante, pheromone ...)
    public static final int COTE = 10;

    //Settings fourmiliere
    public static int NBFOURMIS = 10;
    public static int NBNOURRITURE = 10;
    public static int LARGEUR_FOURMILLIERE = 40;

    // Duree de vie d une pheromone
    public static final int DUREE_VIE_PHERO = 5000;

    //Positions start
    public static final int X_START = 10;
    public static final int Y_START = 10;

    //Statistic fourmiliere
    public static int NBFOODFOURMIL = 0;

    //Option debug
    public static boolean DEBUG = false;

    // pheromones
    public static int TEMPSPHEROMONES = 4000;
}
