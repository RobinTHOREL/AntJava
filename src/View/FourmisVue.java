package View;
import Model.Fourmis;
import javax.swing.*;
import java.awt.*;

public class FourmisVue extends JPanel{

    private Fourmis fourmis;

    public FourmisVue(Fourmis fourmis){
        this.fourmis = fourmis;

        this.setSize(20, 20);
        this.setLocation(fourmis.getPosition());
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.setLocation(fourmis.getPosition());

        g.setColor(Color.black);
        g.drawOval(10, 10, 8, 8);
        System.out.println("Fourmis");

    }
}
