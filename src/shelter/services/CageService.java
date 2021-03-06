package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Animal;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.repository.AnimalRepository;
import shelter.domain.repository.CageRepository;

import java.util.List;

public class CageService {

    private static CageService instance;
    private CageRepository cageRepo = RepositoryConfig.getCageRepository();
    private AnimalRepository animalRepo = RepositoryConfig.getAnimalRepository();
    private AnimalService animalService = AnimalService.getAnimalService();

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

        List<Dog> dogs = cage.getDogs();
        dogs.add(dog);

        cage.setDogs(dogs);
    }

    public void addDogToCageById(int dogId, int cageId) {

        Dog dog = (Dog) animalRepo.getAnimalById(dogId);
        Cage cage = cageRepo.getCageById(cageId);

        addDogToCage(dog, cage);
    }

    public void listAllCages() {
        for (Cage cage : cageRepo.getAllCages()
        ) {
            listCage(cage);
        }
    }

    public void listCageById(int id) {
        listCage(cageRepo.getCageById(id));
    }

    public void listCage(Cage cage) {
        System.out.println("Cage with ID: " + cage.getId());
        if (cage.getDogs() != null) {
            System.out.println("With dogs: ");
            animalService.listAnimals(cage.getDogs().toArray(new Animal[]{}));
        } else {
            System.out.println("Cage is empty.");
        }
        System.out.println("Cared by: " + cage.getVeterinarian() + "\n");
    }

    public int numberOfDogs(int id) {
        if (cageRepo.getCageById(id).getDogs() != null) {
            return cageRepo.getCageById(id).getDogs().toArray().length;
        }
        return 0;
    }
}
