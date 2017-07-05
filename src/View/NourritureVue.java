package View;
import Model.Nourriture;
import javax.swing.*;
import java.awt.*;

import static Model.Settings.COTE;

public class NourritureVue extends JPanel{

    private Nourriture nourriture;

    public NourritureVue(Nourriture nourriture){
        this.nourriture = nourriture;

        this.setSize(COTE, COTE);
        this.setLocation(nourriture.getPosition());
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.setLocation(nourriture.getPosition());

        g.setColor(Color.black);
        g.fillRect(0, 0, COTE, COTE);
//        System.out.println("Nourriture");

    }
}
