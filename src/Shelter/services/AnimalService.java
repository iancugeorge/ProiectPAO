package shelter.services;

import shelter.domain.entity.Animal;
import shelter.domain.entity.Dog;

public class AnimalService {

    private AnimalService(){}
    private static AnimalService instance;

    public static AnimalService getAnimalService(){
        if (instance == null) {
            return instance = new AnimalService();
        } else {
            return instance;
        }
    }


    public Animal getAnimalById(int id){return new Dog();}
    public void getAnimaHistory(Animal animal){}


}
