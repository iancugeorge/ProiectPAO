package Shelter;

public class CatBuilder {
    private final Cat target = new Cat();


    public CatBuilder withName(String catName) {
        target.setName(catName);
        return this;
    }

    public CatBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public CatBuilder withSex(boolean sex) {
        target.setSex(sex);
        return this;
    }



    public Cat build() {
        return target;
    }
}
