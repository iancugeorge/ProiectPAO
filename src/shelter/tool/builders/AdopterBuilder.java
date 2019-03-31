package shelter.tool.builders;

import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;

public class AdopterBuilder {

    private Adopter target = new Adopter();

    public AdopterBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public AdopterBuilder withFirstName(String firstName) {
        target.setFirstName(firstName);
        return this;
    }

    public AdopterBuilder withLastName(String lastName) {
        target.setLastName(lastName);
        return this;
    }

    public AdopterBuilder withEmail(String email) {
        target.setEmail(email);
        return this;
    }

    public AdopterBuilder withAdoptions(Adoption[] adoptions) {
        target.setAdoptions(adoptions);
        return this;
    }

    public Adopter build() {
        return target;
    }

}
