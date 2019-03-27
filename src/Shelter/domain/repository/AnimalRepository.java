package shelter.domain.repository;

import shelter.tool.CatBuilder;
import shelter.tool.DogBuilder;
import shelter.domain.entity.Animal;
import shelter.domain.entity.Cat;

public class AnimalRepository {

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

    public Animal[] getAnimals() {
        return animals;
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
