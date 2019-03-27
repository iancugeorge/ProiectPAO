package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.Dog;

public class DogRepositoryImpl {

    /// EXTRACT INTERFACE

    private Animal[] animals = new AnimalRepository().getAnimals();

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
}
