import shelter.services.AnimalService;
import shelter.services.CageService;

public class Run {

    public static void main(String[] args) {

        AnimalService animalService = AnimalService.getAnimalService();
        CageService cageService = CageService.getCageService();

        animalService.listAllAnimals();

        cageService.addDogToCageById(1,1);
        cageService.addDogToCageById(2,1);
        cageService.addDogToCageById(3,2);
        cageService.addDogToCageById(4,3);
        cageService.listAllCages();
    }
}