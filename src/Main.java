import Controller.ControlleurLauncher;
import View.Parametrage;

/**
 * Created by younesdiouri on 26/05/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Parametrage theView = new Parametrage();
        ControlleurLauncher launch = new ControlleurLauncher(theView);
        theView.setVisible(true);


    }



}
