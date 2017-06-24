package Controller;

import View.Monde;
import View.Parametrage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Model.Settings.*;
import javax.swing.*;

/**
 * Created by younesdiouri on 19/06/2017.
 */
public class ControlleurLauncher extends JPanel{

    private Parametrage theView;
    private boolean firstTry = true;

    public ControlleurLauncher(Parametrage theView)
    {
        this.theView = theView;
        this.theView.addValiderListener(new ValiderListener());
    }

    class ValiderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //gere le != du int
            int nbFourmis = 0, nbNourriture = 0, largeur = 0, hauteur = 0;

            if(theView.getNbFourmisField() != 0) {
                nbFourmis = theView.getNbFourmisField();
                theView.setNbFourmisField(nbFourmis);
                NBFOURMIS = nbFourmis;
            }

            if(theView.getNbNourritureField() != 0 ){
                nbNourriture = theView.getNbNourritureField();
                theView.setNbNourritureField(nbNourriture);
                NBNOURRITURE = nbNourriture;
            }

            if(theView.getLargeurMonde() != 0) {
                largeur = theView.getLargeurMonde();
                theView.setLargeurMonde(largeur);
                LONG = largeur;
            }

            if(theView.getHauteurMonde() != 0) {
                hauteur = theView.getHauteurMonde();
                theView.setHauteurMonde(hauteur);
                HAUT = hauteur;
            }
            if(firstTry)
            {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new Controlleur();
                        firstTry = false;
                    }
                }).start();
            }
        }

    }

}


