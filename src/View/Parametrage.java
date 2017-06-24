package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


/**
 * Created by Kush on 26/05/2017.
 */

public class Parametrage extends JFrame{

    //int i=3;


    private JFormattedTextField nbFourmisField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    private JLabel fourmis = new JLabel();
    private JFormattedTextField nbNourritureField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    private JLabel nourriture = new JLabel();
    private JFormattedTextField hauteurMonde = new JFormattedTextField(NumberFormat.getIntegerInstance());
    private JLabel hauteur = new JLabel();
    private JFormattedTextField largeurMonde = new JFormattedTextField(NumberFormat.getIntegerInstance());
    private JLabel largeur = new JLabel();




    private JButton boutonValider = new JButton("Valider les paramètres de la simulation");
    private JPanel Panel = new JPanel();
    private JPanel Panel1 = new JPanel();

    public void addValiderListener(ActionListener listenForValiderBouton){
        boutonValider.addActionListener(listenForValiderBouton);
    }
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



        this.getContentPane().add(boutonValider, BorderLayout.SOUTH);

        this.setLocation(200, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JButton getBoutonValider() {
        return boutonValider;
    }
    public int getNbFourmisField() {
        return Integer.parseInt(nbFourmisField.getText());
    }

    public void setNbFourmisField(int nb) {
        nbFourmisField.setText(Integer.toString(nb));
    }

    public int getNbNourritureField() {
        return Integer.parseInt(nbNourritureField.getText());
    }

    public void setNbNourritureField(int nb) {
        nbNourritureField.setText(Integer.toString(nb));
    }

    public int getLargeurMonde()
    {
        return Integer.parseInt(largeurMonde.getText());
    }
    public void setLargeurMonde(int nb)
    {
        largeurMonde.setText(Integer.toString(nb));
    }
    public int getHauteurMonde()
    {
        return Integer.parseInt(hauteurMonde.getText());
    }
    public void setHauteurMonde(int nb)
    {
        hauteurMonde.setText(Integer.toString(nb));
    }

            /*System.out.println("nbFourmis : " + NBFOURMIS + " \nnbNourriture : " + NBNOURRITURE + " \nlargeurMonde " +
                    LONG + " \n hauteur : " + HAUT);*/

        }

