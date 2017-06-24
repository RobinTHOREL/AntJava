package Controller;

import Model.*;
import View.Monde;

/**
 * Created by Kush on 26/05/2017.
 */
public class Controlleur {

    /* Model */
    private Model model;
    /* Vue */
    private Monde monde;

    public Controlleur()
    {
        this.model = new Model(this);
        this.monde = new Monde();
        monde.init(model);
        while(true)
        {
            model.nextStep();
            monde.paint(model);

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}




