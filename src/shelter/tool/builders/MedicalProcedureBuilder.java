package shelter.tool.builders;

import shelter.domain.entity.Animal;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.entity.Veterinarian;
import shelter.tool.enums.MedType;

import java.util.Date;

public class MedicalProcedureBuilder {

    private MedicalProcedure target = new MedicalProcedure();

    public MedicalProcedureBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public MedicalProcedureBuilder withAnimal(Animal animal) {
        target.setAnimal(animal);
        return this;
    }

    public MedicalProcedureBuilder withVeterinarian(Veterinarian veterinarian) {
        target.setVeterinarian(veterinarian);
        return this;
    }

    public MedicalProcedureBuilder withType(MedType medType) {
        target.setType(medType);
        return this;
    }

    public MedicalProcedureBuilder withDate(Date date) {
        target.setDate(date);
        return this;
    }

    public MedicalProcedure build() {
        return target;
    }

}
