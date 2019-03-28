package shelter.domain.repository;

import shelter.domain.entity.*;
import shelter.tool.CatBuilder;
import shelter.tool.DogBuilder;
import shelter.tool.Gender;

public class AnimalRepositoryImpl implements AnimalRepository{

    private Animal[] animals =
            new Animal[]{
                    new DogBuilder()
                            .withId(1)
                            .withName("Max")
                            .withSex(Gender.MALE)
                            .build(),
                    new CatBuilder()
                            .withId(2)
                            .withName("Tom")
                            .withSex(Gender.MALE)
                            .build()
            };

    public Animal[] getAllAnimals() {
        return animals;
    }

    public Dog[] getAllDogs()
    {
        Dog[] dogs = (Dog[]) new Animal[10];
        int index = 0;
        for (Animal animal:animals) {
            Dog dog = new Dog();
            if(animal.getClass() == dog.getClass())
            {
                dogs[0] = (Dog) animal;
                index++;
            }
        }
        return dogs;
    }

    public Cat[] getAllCats()
    {
        Cat[] cats = (Cat[]) new Animal[10];
        int index = 0;
        for (Animal animal:animals) {
            Cat cat = new Cat();
            if(animal.getClass() == cat.getClass())
            {
                cats[index] = (Cat) animal;
                index++;
            }
        }
        return cats;
    }

    public Animal getAnimalById(int id){

        for (Animal animal:animals) {
            if(animal.getId() == id)
                return animal;
        }
        return null;
    }


    public MedicalProcedure[] getMedicalHistory(Animal animal){
        return animal.getMedicalHistory();
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
