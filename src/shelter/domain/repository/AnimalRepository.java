package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.Cat;
import shelter.domain.entity.Dog;
import shelter.domain.entity.MedicalProcedure;

public interface AnimalRepository {

    Animal[] getAllAnimals();

    Dog[] getAllDogs();

    Cat[] getAllCats();

    Animal getAnimalById(int id);

    MedicalProcedure[] getMedicalHistory(Animal animal);

    void addDog(Dog dog);

    void addCat(Cat cat);

}
