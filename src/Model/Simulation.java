package Model;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Kush on 26/05/2017.
 */
public class Simulation extends JFrame implements ActionListener{

    int i=3;
    JFormattedTextField nbFourmisField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel fourmis = new JLabel();
    JButton boutonValider = new JButton("Valider les changements de simulation");
    JFormattedTextField nbNourritureField = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JLabel nourriture = new JLabel();
    JPanel Panel = new JPanel();
    public Simulation() {

        this.setSize(600, 300);
        this.setTitle("Simulation");
        this.setLayout(new BorderLayout());

        this.getContentPane().add(Panel, BorderLayout.NORTH);
        fourmis.setText("Nombre de fourmis :");
        nourriture.setText("Nombre de plats :");
        Panel.add(fourmis);
        Panel.add(nbFourmisField);
        nbFourmisField.setPreferredSize(new Dimension(150, 30));
        Panel.add(nourriture);
        Panel.add(nbNourritureField);
        nbNourritureField.setPreferredSize(new Dimension(150, 30));
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
        }



    }
}
