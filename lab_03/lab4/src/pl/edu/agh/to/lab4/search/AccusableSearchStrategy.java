package pl.edu.agh.to.lab4.search;

import pl.edu.agh.to.lab4.types.Suspect;

public class AccusableSearchStrategy implements SearchStrategy {
    @Override
    public boolean filter(Suspect suspect) {
        return suspect.canBeAccused();
    }
}
