package View;
import javax.swing.*;

import java.awt.*;

import static Model.Settings.HAUT;
import static Model.Settings.LONG;


/**
 * Created by Kush on 26/05/2017.
 */

public class Monde extends JPanel {

    JPanel Panel = new JPanel();
    JFrame frame = new JFrame();

    public Monde() {

        frame.setSize(LONG, HAUT);
        frame.setTitle("Monde - Simulation");
        frame.setLayout(new BorderLayout());

//        for(int i=0; i<LONG; i++)
//            for(int j=0; j<HAUT; j++){
//                System.out.println(i + j);
//                a[i][j] = new Case(i,j);
//            }

        //frame.setLocationRelativeTo(null);
        frame.setLocation(550, 100);
//        frame.add(this);
       frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        repaint();
    }



}
