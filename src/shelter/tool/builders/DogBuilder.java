package shelter.tool.builders;

import shelter.domain.entity.Adoption;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.entity.MedicalProcedure;
import shelter.tool.enums.Gender;

public class DogBuilder {
    private final Dog target = new Dog();

    public DogBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public DogBuilder withName(String dogName) {
        target.setName(dogName);
        return this;
    }

    public DogBuilder withGender(Gender gender) {
        target.setGender(gender);
        return this;
    }

    public DogBuilder withChipId(String chipId) {
        target.setChipId(chipId);
        return this;
    }

    public DogBuilder withPassportId(String passportId) {
        target.setPassportId(passportId);
        return this;
    }

    public DogBuilder withAdoption(Adoption adoption) {
        target.setAdoption(adoption);
        return this;
    }

    public DogBuilder withMedicalHistory(MedicalProcedure[] medicalProcedures) {
        target.setMedicalHistory(medicalProcedures);
        return this;
    }

    public DogBuilder withCage(Cage cage) {
        target.setCage(cage);
        return this;
    }

    public Dog build() {
        return target;
    }
}
