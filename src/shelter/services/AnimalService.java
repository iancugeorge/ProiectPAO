package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Animal;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Dog;
import shelter.domain.repository.AnimalRepository;
import shelter.tool.Species;

public class AnimalService {


    private AnimalRepository animalRepo = RepositoryConfig.getAnimalRepository();


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
        return animal.getAdoption() != null;
    }


    public Dog[] getDogsByCage(Cage cage) {

        int i = 0;
        Dog[] dogs = new Dog[10];

        for (Dog dog : animalRepo.getAllDogs()
        ) {
            if (dog.getCage() == cage) {
                dogs[i] = dog;
                i++;
            }
        }
        return dogs;
    }

    public Species getSpecies(Animal animal) {
        Species species = Species.CAT;
        Dog dog = new Dog();
        if (animal.getClass() == dog.getClass())
            species = Species.DOG;
        return species;
    }

    public void listAllAnimals() {
        for (Animal animal : animalRepo.getAllAnimals()
        ) {
            listAnimal(animal);
        }
    }

    public void listAnimals(Animal[] animals) {
        for (Animal animal : animals
        ) {
            listAnimal(animal);
        }
    }

    public void listAnimal(Animal animal) {
        System.out.println("Animal with ID: " + animal.getId()
                + " is named " + animal.getName()
                + " and is " + animal.getGender() + " " + getSpecies(animal)
                + ". ChipID: " + animal.getChipId()
                + " PassportID: " + animal.getPassportId()
                + ". Adoption status -> " + checkAdopted(animal));
    }

}
