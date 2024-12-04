package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private final List<EffetScenario> effets = new ArrayList<>();

    public void ajouterEffet(Effet effet, int repetitions) {
        effets.add(new EffetScenario(effet, repetitions));
    }

    public void jouer(Bandeau bandeau) {
        for (EffetScenario effectScenario : effets) {
            for (int i = 0; i < effectScenario.repetitions; i++) {
                effectScenario.effet.jouer(bandeau);
            }
        }
    }

    private static class EffetScenario {
        Effet effet;
        int repetitions;

        EffetScenario(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }
}
