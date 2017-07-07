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
        graph.setColor(Color.red);
        graph.drawOval(10, 10, 8, 8);

//        else{
////            System.out.println("PLUS DE FOOD");
//            graph.setColor(Color.white);
//            graph.fillRect(0,0,0,0);
//        }
//        System.out.println("Nourriture");

    }
}
