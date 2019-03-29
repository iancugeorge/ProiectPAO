package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.repository.CageRepository;

public class CageService {

    private CageRepository cageRepo = RepositoryConfig.getCageRepository();
    private AnimalService animalService = AnimalService.getAnimalService();

    private static CageService instance;

    private CageService() {
    }

    public static CageService getCageService() {
        if (instance == null) {
            return instance = new CageService();
        } else {
            return instance;
        }
    }

    public void addDogToCage(Dog dog, Cage cage) {
        dog.setCage(cage);

        Dog[] dogs = new Dog[cage.getDogs().length + 1];

        int i = 0;
        for (Dog cageDog : cage.getDogs()
        ) {
            dogs[i] = cageDog;
            i++;
        }
        dogs[i] = dog;

        cage.setDogs(dogs);
    }

    public void listAllCages() {
        for (Cage cage : cageRepo.getAllCages()
        ) {
            System.out.println("Cage with ID: " + cage.getId()
                + " with dogs: ");
            animalService.listAnimals(cage.getDogs());
            System.out.println(" cared by: " + cage.getVeterinarian());
        }
    }
}
