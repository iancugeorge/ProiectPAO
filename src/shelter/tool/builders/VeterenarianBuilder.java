package shelter.tool.builders;

import shelter.domain.entity.Cage;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.entity.Veterinarian;

public class VeterenarianBuilder {

    private Veterinarian target = new Veterinarian();

    public VeterenarianBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public VeterenarianBuilder withFirstName(String firstName) {
        target.setFirstName(firstName);
        return this;
    }

    public VeterenarianBuilder withLastName(String lastName) {
        target.setLastName(lastName);
        return this;
    }

    public VeterenarianBuilder withEmail(String email) {
        target.setEmail(email);
        return this;
    }

    public VeterenarianBuilder withMedicalInterventions(MedicalProcedure[] medicalInterventions) {
        target.setMedicalInterventions(medicalInterventions);
        return this;
    }

    public VeterenarianBuilder withCages(Cage[] cages) {
        target.setCages(cages);
        return this;
    }

    public Veterinarian build() {
        return target;
    }
}
