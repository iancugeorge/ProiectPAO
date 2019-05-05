package shelter.domain.entity;

import shelter.tool.comparators.DateComparator;

import java.util.Set;
import java.util.TreeSet;

public class Adopter extends Person {

    private Set<Adoption> adoptions = new TreeSet<>(new DateComparator());

    public Set<Adoption> getAdoptions() {
        return adoptions;
    }

    public void setAdoptions(Set<Adoption> adoptions) {
        this.adoptions = adoptions;
    }
}
