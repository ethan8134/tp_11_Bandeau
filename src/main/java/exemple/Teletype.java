package exemple;

import bandeau.Bandeau;

public class Teletype extends Effet {
    @Override
    public void jouer(Bandeau bandeau) {
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        for (char c : message.toCharArray()) {
            bandeau.setMessage(bandeau.getMessage() + c);
            bandeau.sleep(200);
        }
    }
}
