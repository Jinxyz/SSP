import jdk.nashorn.internal.scripts.JO;
/*
Skapad av Rasmus, Isac H och Alexander H
*/


import javax.swing.*;
import java.util.Random;

public class ssp {
    public static void main(String[] args) {

        int spelare;
        int rundor;
        int antalrundor = 0;
        int sten = 0;
        int sax = 1;
        int pase = 2;
        int val1;
        int val2;
        int datorval;
        Random rand = new Random();
        int points1 = 0;
        int points2 = 0;
        int datorpoints = 0;

        spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));

        while (spelare > 2) {
            JOptionPane.showMessageDialog(null, "Max 2 spelare! Välj nytt tal!!");
            spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));
        }
        while (spelare < 1) {
            JOptionPane.showMessageDialog(null, "Minst 1 spelare! Välj nytt tal!!");
            spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antal spelare, 1 eller 2."));
        }
        rundor = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många rundor vill du/ni spela?"));


        if (spelare == 1) {

            while (antalrundor <= rundor) {
                datorval = rand.nextInt(3);
                val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Välj mellan sten(0), sax(1) och pase(2)"));


                if (val1 == 0 && datorval == 0) {
                    JOptionPane.showMessageDialog(null, "Sten mot sten, det blir lika!" + "\n" + points1 + " : " + datorpoints);
                } else if (val1 == 0 && datorval == 1) {
                    points1++;
                    JOptionPane.showMessageDialog(null, "Sten mot sax, sten vinner!" + "\n" + points1 + " : " + datorpoints);
                } else if (val1 == 0 && datorval == 2) {
                    datorpoints++;
                    JOptionPane.showMessageDialog(null, "Sten mot påse, påse vinner!" + "\n" + points1 + " : " + datorpoints);


                } else if (val1 == 1 && datorval == 0) {
                    datorpoints++;
                    JOptionPane.showMessageDialog(null, "Sax mot sten, sten vinner!" + "\n" + points1 + " : " + datorpoints);

                } else if (val1 == 1 && datorval == 1) {
                    JOptionPane.showMessageDialog(null, "Sax mot sax, det blir lika!" + "\n" + points1 + " : " + datorpoints);
                } else if (val1 == 1 && datorval == 2) {
                    JOptionPane.showMessageDialog(null, "Sax mot påse, sax vinner!" + "\n" + points1 + " : " + datorpoints);
                    points1++;
                } else if (val1 == 2 && datorval == 0) {
                    points1++;
                    JOptionPane.showMessageDialog(null, "Påse mot sten, påse vinner!" + "\n" + points1 + " : " + datorpoints);
                } else if (val1 == 2 && datorval == 1) {
                    datorpoints++;
                    JOptionPane.showMessageDialog(null, "Påse mot sax, sax vinner!" + "\n" + points1 + " : " + datorpoints);
                } else if (val1 == 2 && datorval == 2) {
                    JOptionPane.showMessageDialog(null, "Påse mot påse, det blir lika!" + "\n" + points1 + " : " + datorpoints);
                }

                antalrundor++;
            }
            if (points1 > datorpoints) {
                JOptionPane.showMessageDialog(null, "Du vann!" + "\n" + "Det blev: " + points1 + " : " + datorpoints);
            } else if (points1 < datorpoints) {
                JOptionPane.showMessageDialog(null, "Du förlorade nyss mot datorn...." + "\n" + "Det blev: " + points1 + " : " + datorpoints);
            } else if (points1 == datorpoints) {
                JOptionPane.showMessageDialog(null, "Det blev lika, nästan bra gjort.." + "\n" + "Det blev: " + points1 + " : " + datorpoints);
            }
        }

            else if (spelare == 2) {

                while (antalrundor <= rundor) {
                    val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Spelare 1, välj mellan sten(0), sax(1) och pase(2)"));
                    val2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Spelare 2, välj mellan sten(0), sax(1) och pase(2)"));

                    if (val1 == 0 && val2 == 0) {
                        JOptionPane.showMessageDialog(null, "Sten mot sten, det blir lika!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 0 && val2 == 1) {
                        points1++;
                        JOptionPane.showMessageDialog(null, "Sten mot sax, sten vinner!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 0 && val2 == 2) {
                        points2++;
                        JOptionPane.showMessageDialog(null, "Sten mot påse, påse vinner!" + "\n" + points1 + " : " + points2);


                    } else if (val1 == 1 && val2 == 0) {
                        points2++;
                        JOptionPane.showMessageDialog(null, "Sax mot sten, sten vinner!" + "\n" + points1 + " : " + points2);

                    } else if (val1 == 1 && val2 == 1) {
                        JOptionPane.showMessageDialog(null, "Sax mot sax, det blir lika!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 1 && val2 == 2) {
                        points1++;
                        JOptionPane.showMessageDialog(null, "Sax mot påse, sax vinner!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 2 && val2 == 0) {
                        points1++;
                        JOptionPane.showMessageDialog(null, "Påse mot sten, påse vinner!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 2 && val2 == 1) {
                        points2++;
                        JOptionPane.showMessageDialog(null, "Påse mot sax, sax vinner!" + "\n" + points1 + " : " + points2);
                    } else if (val1 == 2 && val2 == 2) {
                        JOptionPane.showMessageDialog(null, "Påse mot påse, det blir lika!" + "\n" + points1 + " : " + points2);
                    }

                    antalrundor++;
                }
                if (points1 > points2) {
                    JOptionPane.showMessageDialog(null, "Du vann!" + "\n" + "Det blev: " + points1 + " : " + points2);
                } else if (points1 < points2) {
                    JOptionPane.showMessageDialog(null, "Du förlorade nyss mot datorn...." + "\n" + "Det blev: " + points1 + " : " + points2);
                } else if (points1 == points2) {
                    JOptionPane.showMessageDialog(null, "Det blev lika, nästan bra gjort.." + "\n" + "Det blev: " + points1 + " : " + points2);
                }


            }
        }
    }


