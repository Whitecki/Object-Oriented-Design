package pl.edu.agh.to.lab4.providers;

import pl.edu.agh.to.lab4.types.CracovCitizen;
import pl.edu.agh.to.lab4.types.Suspect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDataProvider implements SuspectAggregate {

    private final Collection<CracovCitizen> cracowCitizens = new ArrayList<>();

    public PersonDataProvider() {
        cracowCitizens.add(new CracovCitizen("Jan", "Kowalski", 30));
        cracowCitizens.add(new CracovCitizen("Janusz", "Krakowski", 30));
        cracowCitizens.add(new CracovCitizen("Janusz", "Mlodociany", 10));
        cracowCitizens.add(new CracovCitizen("Kasia", "Kosinska", 19));
        cracowCitizens.add(new CracovCitizen("Piotr", "Zgredek", 29));
        cracowCitizens.add(new CracovCitizen("Tomek", "Gimbus", 14));
        cracowCitizens.add(new CracovCitizen("Janusz", "Gimbus", 15));
        cracowCitizens.add(new CracovCitizen("Alicja", "Zaczarowana", 22));
        cracowCitizens.add(new CracovCitizen("Janusz", "Programista", 77));
        cracowCitizens.add(new CracovCitizen("Pawel", "Pawlowicz", 32));
        cracowCitizens.add(new CracovCitizen("Krzysztof", "Mendel", 30));
    }

    @Override
    public Iterator<Suspect> iterator() {
        return ((Collection<Suspect>)(Collection<?>) cracowCitizens).iterator();
    }
}
