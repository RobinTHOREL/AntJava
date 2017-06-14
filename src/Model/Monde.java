package Model;

import javax.swing.*;

/**
 * Created by Kush on 26/05/2017.
 */
public class Monde extends JPanel{

    private Case a[][] = new Case[LONG][HAUT];

    public Monde()
    {
        for(int i=0; i<LONG; i++)
            for(int j=0; j<HAUT; j++)
            {
                a[i][j] = new Case(i,j);
            }
    }



}
