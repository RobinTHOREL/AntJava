package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import static Model.Settings.*;
import static Controller.Controlleur.*;

/**
 * Created by Kush on 26/05/2017.
 */

public class Parametrage extends JFrame implements ActionListener{

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
    public Parametrage() {

        this.setSize(320, 400);
        this.setTitle("Paramètrages");
        this.setLayout(new BorderLayout());

        this.getContentPane().add(Panel, BorderLayout.CENTER);

        this.getContentPane().add(Panel1, BorderLayout.CENTER);
        fourmis.setText("Nombre de fourmis :");
        nourriture.setText("Nombre de nourriture :");
        hauteur.setText("Hauteur du monde :");
        largeur.setText("Largeur du monde :");

        Panel1.add(fourmis);
        Panel1.add(nbFourmisField);
        nbFourmisField.setPreferredSize(new Dimension(150, 30));

        Panel1.add(nourriture);
        Panel1.add(nbNourritureField);
        nbNourritureField.setPreferredSize(new Dimension(150, 30));

        Panel1.add(hauteur);
        Panel1.add(hauteurMonde);
        hauteurMonde.setPreferredSize(new Dimension(150, 30));

        Panel1.add(largeur);
        Panel1.add(largeurMonde);
        largeurMonde.setPreferredSize(new Dimension(150, 30));


        boutonValider.addActionListener(this);
        this.getContentPane().add(boutonValider, BorderLayout.SOUTH);

        this.setLocation(200, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //gere le != du int
        if(e.getSource() == boutonValider)
        {
            int nbFourmis = 0, nbNourriture = 0, largeur = 0, hauteur = 0;

            if(nbFourmisField.getText() != null) {
                nbFourmis = Integer.parseInt(nbFourmisField.getText());
                nbFourmisField.setText("" + nbFourmis);
                NBFOURMIS = nbFourmis;
            }

            if(nbNourritureField.getText() != null) {
                nbNourriture = Integer.parseInt(nbNourritureField.getText());
                nbNourritureField.setText("" + nbNourriture);
                NBNOURRITURE = nbNourriture;
            }

            if(largeurMonde.getText() != null) {
                largeur = Integer.parseInt(largeurMonde.getText());
                largeurMonde.setText("" + largeur);
                LONG = largeur;
            }

            if(hauteurMonde.getText() != null) {
                hauteur = Integer.parseInt(hauteurMonde.getText());
                hauteurMonde.setText("" + hauteur);
                HAUT = hauteur;
            }

            /*System.out.println("nbFourmis : " + NBFOURMIS + " \nnbNourriture : " + NBNOURRITURE + " \nlargeurMonde " +
                    LONG + " \n hauteur : " + HAUT);*/

            //Lancer le monde a partir du controlleur
           launchWorld();
        }



    }
}
