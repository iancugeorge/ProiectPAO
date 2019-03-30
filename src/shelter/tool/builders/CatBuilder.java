package shelter.tool.builders;

import shelter.domain.entity.Adoption;
import shelter.domain.entity.Cat;
import shelter.domain.entity.MedicalProcedure;
import shelter.tool.enums.Gender;

public class CatBuilder {
    private final Cat target = new Cat();

    public CatBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public CatBuilder withName(String catName) {
        target.setName(catName);
        return this;
    }

    public CatBuilder withGender(Gender gender) {
        target.setGender(gender);
        return this;
    }

    public CatBuilder withChipId(String chipId) {
        target.setChipId(chipId);
        return this;
    }

    public CatBuilder withPassportId(String passportId) {
        target.setPassportId(passportId);
        return this;
    }

    public CatBuilder withAdoption(Adoption adoption) {
        target.setAdoption(adoption);
        return this;
    }

    public CatBuilder withMedicalHistory(MedicalProcedure[] medicalProcedures) {
        target.setMedicalHistory(medicalProcedures);
        return this;
    }

    public Cat build() {
        return target;
    }
}
