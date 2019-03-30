package shelter.tool.builders;

import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.entity.Veterinarian;

public class CageBuilder {

    private final Cage target = new Cage();

    public CageBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public CageBuilder withDogs(Dog[] dogs) {
        target.setDogs(dogs);
        return this;
    }

    public CageBuilder withVeterinarian(Veterinarian veterinarian) {
        target.setVeterinarian(veterinarian);
        return this;
    }

    public Cage build() {
        return target;
    }
}
