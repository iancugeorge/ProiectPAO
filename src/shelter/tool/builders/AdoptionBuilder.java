package shelter.tool.builders;

import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;
import shelter.domain.entity.Animal;

import java.util.Date;

public class AdoptionBuilder {

    private Adoption target = new Adoption();

    public AdoptionBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public AdoptionBuilder withDate(Date date) {
        target.setDate(date);
        return this;
    }

    public AdoptionBuilder withAnimal(Animal animal) {
        target.setAnimal(animal);
        return this;
    }

    public AdoptionBuilder witAdopter(Adopter adopter) {
        target.setAdopter(adopter);
        return this;
    }

    public Adoption build() {
        return target;
    }

}
