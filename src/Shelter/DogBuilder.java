package Shelter;

public class DogBuilder {
    private final Dog target = new Dog();


    public DogBuilder withName(String dogName) {
        target.setName(dogName);
        return this;
    }

    public DogBuilder withId(int id) {
        target.setId(id);
        return this;
    }

    public DogBuilder withSex(boolean sex) {
        target.setSex(sex);
        return this;
    }



    public Dog build() {
        return target;
    }
}
