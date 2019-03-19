import Shelter.Animal;
import Shelter.AnimalService;
import Shelter.Dog;
import Shelter.ShelterService;

public class Run {

    public static void main(String[] args) {

        ShelterService shelterService = ShelterService.getShelterService();
        AnimalService animalService = AnimalService.getAnimalService();


        for (Animal animal : shelterService.getAnimals()) {
            System.out.println("Animalul cu Id-ul " + animal.getId()
                            + " are numele " + animal.getName()
                            + " si are " + animal.getAge()
                            + " ani.");
        }

        Animal dogs[] = shelterService.getAllDogs();
        dogs[0].latra();
    }
}
