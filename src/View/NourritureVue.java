package View;
import Model.Nourriture;
import javax.swing.*;
import java.awt.*;

public class NourritureVue extends JPanel{

    private Nourriture nourriture;

    public NourritureVue(Nourriture nourriture){
        this.nourriture = nourriture;

        this.setSize(20, 20);
        this.setLocation(nourriture.getPosition());
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.setLocation(nourriture.getPosition());

        g.setColor(Color.black);
        g.fillRect(0, 0, 20, 20);
        System.out.println("Nourriture");

    }
}
