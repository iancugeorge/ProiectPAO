import Shelter.Animal;
import Shelter.ShelterService;

public class Run {

    public static void main(String[] args) {

        ShelterService shelterService = ShelterService.getShelterService();


        for (Animal animal : shelterService.getAnimals()) {
            System.out.println("Animalul cu Id-ul " + animal.getId() + " are numele " + animal.getName() + " si are varsta " + animal.getAge());
        }
    }
}
