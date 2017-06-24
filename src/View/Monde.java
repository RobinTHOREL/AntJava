package View;
import Model.Fourmilliere;
import Model.Fourmis;
import Model.Nourriture;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static Model.Settings.*;
import static Model.Settings.LARGEUR_FOURMILLIERE;


/**
 * Created by Kush on 26/05/2017.
 */

public class Monde extends JPanel {

    private ArrayList<Fourmis> fourmisList = new ArrayList<Fourmis>();
    private ArrayList<Nourriture> foodList = new ArrayList<Nourriture>();
    private Fourmilliere fourmilliere;

    JPanel Panel = new JPanel();
    JFrame frame = new JFrame();

    public Monde() {
        for(int i=0;i<NBFOURMIS;i++)
        {
            fourmisList.add(new Fourmis(new Point(10,10),false));
        }
        for(int i=0;i<NBNOURRITURE;i++)
        {
            foodList.add(new Nourriture(new Point(10,10)));
        }
        frame.setSize(LONG, HAUT);
        frame.setTitle("Monde - Simulation");
        frame.setLayout(new BorderLayout());

//        for(int i=0; i<LONG; i++)
//            for(int j=0; j<HAUT; j++){
//                System.out.println(i + j);
//                a[i][j] = new Case(i,j);
//            }

        //frame.setLocationRelativeTo(null);
        frame.setLocation(550, 100);
//        frame.add(this);
       frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(X_START, Y_START, LARGEUR_FOURMILLIERE, LARGEUR_FOURMILLIERE);
        System.out.println("ok");
        for (Fourmis fourmis : fourmisList) {
            fourmis.nextStep(g);
        }
        for (Nourriture food : foodList) {
            food.nextStep(g);
        }
    }
}

