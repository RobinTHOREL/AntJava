package View;

import Model.Fourmilliere;

import javax.swing.*;
import java.awt.*;

import static Model.Settings.*;

public class FourmilliereVue extends JPanel{

    private Fourmilliere fourmilliere;

    public FourmilliereVue(Fourmilliere fourmilliere){
        this.fourmilliere = fourmilliere;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(X_START, Y_START, LARGEUR_FOURMILLIERE, LARGEUR_FOURMILLIERE);
    }
}
