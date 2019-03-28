package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Animal;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.repository.AnimalRepository;

public class AnimalService {


    private AnimalRepository animalRepository = RepositoryConfig.getAnimalRepository();

    private static AnimalService instance;

    private AnimalService() {
    }

    public static AnimalService getAnimalService() {
        if (instance == null) {
            return instance = new AnimalService();
        } else {
            return instance;
        }
    }


    public boolean checkAdopted(Animal animal) {
        if (animal.getAdoption() == null)
            return false;
        else return true;
    }


    public Dog[] getDogsByCage(Cage cage){

        int i = 0;
        Dog[] dogs = new Dog[10];

        for (Dog dog: animalRepository.getAllDogs()
        ) {
            if (dog.getCage() == cage) {
                dogs[i] = dog;
                i++;
            }
        }
        return dogs;
    }


}
