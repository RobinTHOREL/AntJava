package View;
import Model.Pheromone;
import javax.swing.*;
import java.awt.*;

import static Model.Settings.COTE;

public class PheromoneVue extends JPanel{

    private Pheromone pheromone;

    public PheromoneVue(Pheromone pheromone){
        this.pheromone = pheromone;

        this.setSize(COTE, COTE);
        this.setLocation(pheromone.getPosition());
    }

    @Override
    protected void paintComponent(Graphics graph) {
        this.setLocation(pheromone.getPosition());


        if(pheromone.getNb() != 0)
        {
            graph.setColor(Color.blue);
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
