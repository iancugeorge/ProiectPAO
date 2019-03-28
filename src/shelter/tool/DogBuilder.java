package shelter.tool;

import shelter.domain.entity.Dog;

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

    public DogBuilder withSex(Gender gender) {
        target.setGender(gender);
        return this;
    }

    public Dog build() {
        return target;
    }
}
