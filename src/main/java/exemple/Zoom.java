package exemple;

import bandeau.Bandeau;

import java.awt.Font;

public class Zoom extends Effet {
    @Override
    public void jouer(Bandeau bandeau) {
        for (int i = 10; i <= 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, i));
            bandeau.sleep(100);
        }
    }
}
