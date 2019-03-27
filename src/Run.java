import shelter.domain.entity.Animal;
import shelter.services.AnimalService;
import shelter.domain.repository.ShelterRepository;

public class Run {

    public static void main(String[] args) {

        ShelterRepository shelterRepository = ShelterRepository.getShelterService();
        AnimalService animalService = AnimalService.getAnimalService();

/*
        for (Animal animal : shelterRepository.getAnimals()) {
            System.out.println("Animalul cu Id-ul " + animal.getId()
                    + " are numele " + animal.getName()
                    + " si are " + animal.getAge()
                    + " ani.");
        }

        Animal dogs[] = shelterRepository.getAllDogs();
        dogs[0].latra();
        */
    }
}