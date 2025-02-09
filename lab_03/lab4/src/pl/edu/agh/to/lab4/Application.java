package pl.edu.agh.to.lab4;

import pl.edu.agh.to.lab4.providers.PersonDataProvider;
import pl.edu.agh.to.lab4.providers.PrisonersDataProvider;
import pl.edu.agh.to.lab4.providers.StudentsDataProvider;
import pl.edu.agh.to.lab4.search.AccusableSearchStrategy;
import pl.edu.agh.to.lab4.search.AgeSearchStrategy;
import pl.edu.agh.to.lab4.search.CompositeSearchStrategy;
import pl.edu.agh.to.lab4.search.NameSearchStrategy;
import pl.edu.agh.to.lab4.util.Finder;

import java.util.Arrays;

public class Application extends PersonDataProvider {

    public static void main(String[] args) {
        Finder suspects = new Finder(Arrays.asList(
                new PersonDataProvider(), new PrisonersDataProvider(), new StudentsDataProvider()
        ));

        suspects.display(10);

        suspects.display(new AgeSearchStrategy(9, 16));

        suspects.display(new CompositeSearchStrategy(
                Arrays.asList(
                        new NameSearchStrategy("Janusz"),
                        new AccusableSearchStrategy()
                )
        ));

        suspects.display(new AgeSearchStrategy(65));
    }
}
