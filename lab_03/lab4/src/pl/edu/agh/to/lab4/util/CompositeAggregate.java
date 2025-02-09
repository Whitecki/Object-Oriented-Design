package pl.edu.agh.to.lab4.util;

import pl.edu.agh.to.lab4.providers.SuspectAggregate;
import pl.edu.agh.to.lab4.types.Suspect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CompositeAggregate {
    private final Collection<SuspectAggregate> aggregates;

    public CompositeAggregate(Collection<SuspectAggregate> aggregates) {
        this.aggregates = aggregates;
    }

    public Collection<Suspect> getAllSuspects() {
        Collection<Suspect> result = new ArrayList<>();

        for (SuspectAggregate aggregate : aggregates) {
            Iterator<Suspect> suspectIterator = aggregate.iterator();
            while (suspectIterator.hasNext())
                result.add(suspectIterator.next());
        }
        return result;
    }
}
