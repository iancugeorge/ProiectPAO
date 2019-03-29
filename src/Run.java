import shelter.services.AnimalService;
import shelter.services.CageService;

public class Run {

    public static void main(String[] args) {

        AnimalService animalService = AnimalService.getAnimalService();
        CageService cageService = CageService.getCageService();

        animalService.listAllAnimals();

        cageService.listAllCages();
    }
}