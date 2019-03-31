package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Animal;
import shelter.domain.entity.Cage;
import shelter.domain.entity.Cat;
import shelter.domain.entity.Dog;
import shelter.domain.repository.AnimalRepository;
import shelter.tool.builders.CatBuilder;
import shelter.tool.builders.DogBuilder;
import shelter.tool.enums.Gender;
import shelter.tool.enums.Species;

public class AnimalService {


    private static AnimalService instance;
    private AnimalRepository animalRepo = RepositoryConfig.getAnimalRepository();

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
        if (animal != null && animal.getClass() == dog.getClass())
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
        if (animal != null) {
            if (getSpecies(animal) == Species.CAT) {
                System.out.println("Animal with ID: " + animal.getId()
                        + " is named " + animal.getName()
                        + " and is " + animal.getGender() + " " + getSpecies(animal)
                        + ".\n\tChipID: " + animal.getChipId()
                        + " PassportID: " + animal.getPassportId()
                        + ".\n\tAdoption status -> " + checkAdopted(animal));
            } else {
                System.out.println("Animal with ID: " + animal.getId()
                        + " is named " + animal.getName()
                        + " and is " + animal.getGender() + " " + getSpecies(animal)
                        + ".\n\tChipID: " + animal.getChipId()
                        + " PassportID: " + animal.getPassportId()
                        + ".\n\tAdoption status -> " + checkAdopted(animal));
                if (checkAdopted(animal) == false) {
                    Dog dog = (Dog) animal;
                    if (dog.getCage() != null) {
                        int CageId = dog.getCage().getId();
                        System.out.println("\tIn cage: " + CageId);
                    }
                }
            }
        }
        System.out.println();
    }

    public void addDog(int id, String name, Gender gender) {
        Dog dog = new DogBuilder()
                .withId(id)
                .withName(name)
                .withGender(gender)
                .build();
        animalRepo.addDog(dog);
    }

    public void addCat(int id, String name, Gender gender) {
        Cat cat = new CatBuilder()
                .withId(id)
                .withName(name)
                .withGender(gender)
                .build();
        animalRepo.addCat(cat);
    }

    public void setChipId(int id, String chipId) {
        animalRepo.getAnimalById(id).setChipId(chipId);
    }

    public void setPassportId(int id, String passportId) {
        animalRepo.getAnimalById(id).setPassportId(passportId);
    }

}
