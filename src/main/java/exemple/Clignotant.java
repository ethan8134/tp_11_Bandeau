package exemple;

import bandeau.Bandeau;

import java.awt.Color;

public class Clignotant extends Effet {
    @Override
    public void jouer(Bandeau bandeau) {
        String originalMessage = bandeau.getMessage(); // Sauvegarder le message original
        for (int i = 0; i < 5; i++) {
            bandeau.setMessage(""); // Cacher le texte
            bandeau.sleep(200); // Pause
            bandeau.setMessage(originalMessage); // Restaurer le texte
            bandeau.sleep(200); // Pause
        }
    }
}

