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
    protected void paintComponent(Graphics graph) {
        this.setLocation(nourriture.getPosition());


        if(nourriture.getNb() != 0)
        {
            graph.setColor(Color.black);
            graph.fillRect(0, 0, COTE, COTE);

        }
        else{
//            System.out.println("PLUS DE FOOD");
            graph.setColor(Color.white);
            graph.fillRect(0,0,0,0);
        }
//        System.out.println("Nourriture");

    }
}
