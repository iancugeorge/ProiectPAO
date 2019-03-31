import shelter.services.AdoptionService;
import shelter.services.AnimalService;
import shelter.services.CageService;

import java.util.Date;

public class Run {

    public static void main(String[] args) {

        AnimalService animalService = AnimalService.getAnimalService();
        CageService cageService = CageService.getCageService();
        AdoptionService adoptionService = AdoptionService.getAdoptionService();


//        animalService.listAllAnimals();
//
//        animalService.addDog(11,"test1", MALE);
//        animalService.addDog(12,"test2", FEMALE);
//
//        animalService.setChipId(11, "A1234567890");
//        animalService.setPassportId(11, "B12345");
//

        adoptionService.makeAdoption(1, 0, new Date());
        adoptionService.makeAdoption(2, 0, new Date());

        animalService.listAllAnimals();
        adoptionService.listAllAdoptions();
    }
}