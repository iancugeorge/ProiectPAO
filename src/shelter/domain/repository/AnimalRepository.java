package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.Cat;
import shelter.domain.entity.Dog;
import shelter.domain.entity.Cage;
import shelter.domain.entity.MedicalProcedure;

import java.util.List;

public interface AnimalRepository {

    void getData();
    void setData();

    List<Animal> getAllAnimals();

    Dog[] getAllDogs();

    Cat[] getAllCats();

    Animal getAnimalById(int id);

    MedicalProcedure[] getMedicalHistory(Animal animal);

    void addDog(Dog dog);

    void addCat(Cat cat);

    Cage getCageByAnimalId(int animalId);
}
