package Model;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

import static Model.Settings.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Simulation extends JFrame implements ActionListener{

    //int i=3;

    JFormattedTextField nbFourmisField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel fourmis = new JLabel();
    JFormattedTextField nbNourritureField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel nourriture = new JLabel();
    JFormattedTextField hauteurMonde = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel hauteur = new JLabel();
    JFormattedTextField largeurMonde = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel largeur = new JLabel();
    JButton boutonValider = new JButton("Valider les paramètres de la simulation");
    JPanel Panel = new JPanel();
    JPanel Panel1 = new JPanel();
    public Simulation() {

        this.setSize(600, 300);
        this.setTitle("Simulation");
        this.setLayout(new BorderLayout());

        this.getContentPane().add(Panel, BorderLayout.NORTH);
        fourmis.setText("Nombre de fourmis :");
        nourriture.setText("Nombre de nourritures :");

        Panel.add(fourmis);
        Panel.add(nbFourmisField);
        nbFourmisField.setPreferredSize(new Dimension(150, 30));

        Panel.add(nourriture);
        Panel.add(nbNourritureField);
        nbNourritureField.setPreferredSize(new Dimension(150, 30));

        this.getContentPane().add(Panel1, BorderLayout.CENTER);
        hauteur.setText("Hauteur du monde :");
        largeur.setText("Largeur du monde :");

        Panel1.add(hauteur);
        Panel1.add(hauteurMonde);
        hauteurMonde.setPreferredSize(new Dimension(150, 30));

        Panel1.add(largeur);
        Panel1.add(largeurMonde);
        largeurMonde.setPreferredSize(new Dimension(150, 30));


        boutonValider.addActionListener(this);
        this.getContentPane().add(boutonValider, BorderLayout.SOUTH);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //gere le != du int
        if(e.getSource() == boutonValider)
        {
            int nbFourmis = Integer.parseInt(nbFourmisField.getText());
            nbFourmisField.setText(""+nbFourmis);

            int nbNourriture = Integer.parseInt(nbNourritureField.getText());
            nbNourritureField.setText(""+nbNourriture);

            int largeur = Integer.parseInt(largeurMonde.getText());
            largeurMonde.setText(""+largeur);

            int hauteur = Integer.parseInt(hauteurMonde.getText());
            hauteurMonde.setText(""+hauteur);

            NBFOURMIS = nbFourmis;
            NBNOURRITURE = nbNourriture;
            LONG = largeur;
            HAUT = hauteur;

            /*System.out.println("nbFourmis : " + NBFOURMIS + " \nnbNourriture : " + NBNOURRITURE + " \nlargeurMonde " +
                    LONG + " \n hauteur : " + HAUT);*/
        }



    }
}
