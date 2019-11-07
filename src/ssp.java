import javax.swing.*;
import java.util.Random;

public class ssp {
    public static void main(String[] args) {

        int spelare;
        int rundor;
        int sten;
        int sax;
        int pase;

        spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));

        while (spelare > 2) {
            JOptionPane.showMessageDialog(null, "Max 2 spelare! Välj nytt tal!!");
            spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));
        }
        while (spelare < 1){
            JOptionPane.showMessageDialog(null, "Minst 1 spelare! Välj nytt tal!!");
            spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));
        }
        rundor = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många rundor vill du/ni spela?"));


        if (spelare == 1) {


        }


        else if (spelare == 2) {


        }


    }
}
