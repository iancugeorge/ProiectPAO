package shelter.domain.repository;

import shelter.domain.entity.*;
import shelter.tool.builders.CatBuilder;
import shelter.tool.builders.DogBuilder;
import shelter.tool.enums.Gender;

import java.util.Arrays;

public class AnimalRepositoryImpl implements AnimalRepository {


    private Animal[] animals =
            new Animal[]{
                    new DogBuilder()
                            .withId(1)
                            .withName("Max")
                            .withGender(Gender.MALE)
                            .withChipId("A1234567890")
                            .withPassportId("B12345")
                            .build(),
                    new DogBuilder()
                            .withId(2)
                            .withName("Mini")
                            .withGender(Gender.FEMALE)
                            .withChipId("A1234567890")
                            .withPassportId("B12345")
                            .build(),
                    new DogBuilder()
                            .withId(3)
                            .withName("Rex")
                            .withGender(Gender.MALE)
                            .withChipId("A1234567890")
                            .withPassportId("B12345")
                            .build(),
                    new DogBuilder()
                            .withId(4)
                            .withName("Rexi")
                            .withGender(Gender.FEMALE)
                            .withChipId("A1234567890")
                            .withPassportId("B12345")
                            .build(),
                    new CatBuilder()
                            .withId(5)
                            .withName("Tom")
                            .withGender(Gender.MALE)
                            .withChipId("A9876543210")
                            .withPassportId("B54321")
                            .build()
            };

    public Animal[] getAllAnimals() {
        return animals;
    }

    public Dog[] getAllDogs() {
        Dog[] dogs = (Dog[]) new Animal[100];
        int index = 0;
        for (Animal animal : animals) {
            Dog dog = new Dog();
            if (animal.getClass() == dog.getClass()) {
                dogs[0] = (Dog) animal;
                index++;
            }
        }
        return dogs;
    }

    public Cat[] getAllCats() {
        Cat[] cats = (Cat[]) new Animal[100];
        int index = 0;
        for (Animal animal : animals) {
            Cat cat = new Cat();
            if (animal.getClass() == cat.getClass()) {
                cats[index] = (Cat) animal;
                index++;
            }
        }
        return cats;
    }

    public Animal getAnimalById(int id) {

        for (Animal animal : animals) {
            if (animal.getId() == id)
                return animal;
        }
        return null;
    }

    public void addDog(Dog animal) {
        if (animals != null) {
            animals = Arrays.copyOf(animals, animals.length + 1);
            animals[animals.length - 1] = animal;
        } else {
            animals = new Animal[1];
            animals[0] = animal;
        }
    }

    public void addCat(Cat animal) {
        if (animals != null) {
            animals = Arrays.copyOf(animals, animals.length + 1);
            animals[animals.length - 1] = animal;
        } else {
            animals = new Animal[1];
            animals[0] = animal;
        }
    }

    public MedicalProcedure[] getMedicalHistory(Animal animal) {
        return animal.getMedicalHistory();
    }

    public Cage getCageByAnimalId(int animalId){

        for (Animal animal : getAllAnimals()
             ) {
            if (animal.getId() == animalId) {
                Dog dog = (Dog)animal;
                return dog.getCage();
            }
        }
        return null;
    }

    /** File Read
     *
     * public DogRepositorySmartImpl(){
     *         int length = TestData.getInstance().getDogData().length;
     *         this.dogs = new Dog[length];
     *         for(int i=0; i<length; i++){
     *             String[] splitedData = TestData.getInstance().getDogData()[i].split(",");
     *             this.dogs[i].setId(Integer.valueOf(splitedData[0]));
     *             this.dogs[i].setName(splitedData[1]);
     *         }
     *     }
     *
     */
}
