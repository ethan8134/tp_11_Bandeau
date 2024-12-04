package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class Test_Scenario {
    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        bandeau.setMessage("Démo Bandeau");

        Effet teletype = new Teletype();
        Effet clignotant = new Clignotant();
        Effet zoom = new Zoom();

        Scenario scenario = new Scenario();
        scenario.ajouterEffet(teletype, 1);
        scenario.ajouterEffet(clignotant, 3);
        scenario.ajouterEffet(zoom, 1);

        bandeau.setFont(new Font("Dialog", Font.PLAIN, 15));
        bandeau.setBackground(Color.BLACK);
        bandeau.setForeground(Color.WHITE);

        scenario.jouer(bandeau);

        bandeau.setMessage("Terminé");
        bandeau.sleep(3000);
        bandeau.close();
    }
}
