package Shelter;

import java.util.Date;

public class ShelterService<idx> {

    private Animal[] animals =
            new Animal[]{
                    new DogBuilder()
                            .withId(1)
                            .withName("Max")
                            .withSex(false)
                            .build(),
                    new CatBuilder()
                            .withId(2)
                            .withName("Tom")
                            .withSex(false)
                            .build()
            };




    //

    private Cage[] cages = new Cage[]{

    };

    private ShelterService() {
    }

    private static ShelterService instance;

    public static ShelterService getShelterService() {
        if (instance == null) {
            return instance = new ShelterService();
        } else {
            return instance;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }
    public Animal[] getAllDogs()
    {
        Animal[] dogs = new Animal[10];
        int index = 0;
        for (Animal animal:animals) {
            Dog dog = new Dog();
            if(animal.getClass() == dog.getClass())
            {
                dogs[0] = animal;
                index++;
            }
        }
        return dogs;
    }

    public Animal[] getAllCats()
    {
        Animal[] cats = new Animal[10];
        int index = 0;
        for (Animal animal:animals) {
            Cat cat = new Cat();
            if(animal.getClass() == cat.getClass())
            {
                cats[index] = animal;
                index++;
            }
        }
        return cats;
    }

}
