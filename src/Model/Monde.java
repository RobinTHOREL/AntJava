package Model;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Model.Settings.HAUT;
import static Model.Settings.LONG;
import static Model.Settings.NBNOURRITURE;

/**
 * Created by Kush on 26/05/2017.
 */

public class Monde extends JPanel {

    private Case a[][] = new Case[LONG][HAUT];
    JPanel Panel = new JPanel();
    JFrame frame = new JFrame();

    public Monde() {

        frame.setSize(LONG, HAUT);
        frame.setTitle("Monde - Simulation");
        frame.setLayout(new BorderLayout());

        for(int i=0; i<LONG; i++)
            for(int j=0; j<HAUT; j++){
                //System.out.println(i + j);
                a[i][j] = new Case(i,j);
            }

        //frame.setLocationRelativeTo(null);
        frame.setLocation(550, 100);
//        frame.add(this);
       frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        repaint();
    }

    public void addRandomFood() {
        for(int i = 0; i < NBNOURRITURE; i++){
            Nourriture n = new Nourriture(i/LONG, (i/HAUT)*2);
        }
    }

    public void addFourmiliere() {
        Fourmilliere f = new Fourmilliere(10,10);
    }

    public void paintComponnent(Graphics g) {
        g.fillRect(10, 10, 20, 20);
        System.out.println("ok");
    }

}
