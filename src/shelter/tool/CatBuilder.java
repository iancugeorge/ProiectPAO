package shelter.tool;

import shelter.domain.entity.Cat;

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

    public CatBuilder withSex(Gender gender) {
        target.setGender(gender);
        return this;
    }

    public Cat build() {
        return target;
    }
}
