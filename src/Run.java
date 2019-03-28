import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Animal;
import shelter.domain.repository.AnimalRepository;
import shelter.services.AnimalService;

public class Run {

    public static void main(String[] args) {

        AnimalService animalService = AnimalService.getAnimalService();
        AnimalRepository animalRepository = RepositoryConfig.getAnimalRepository();

        for (Animal animal : animalRepository.getAllAnimals()) {
            System.out.println("Animalul cu Id-ul " + animal.getId()
                    + " are numele " + animal.getName()
                    + " este " + animal.getGender()
                    + ". Statutul adoptarii -> " + animalService.checkAdopted(animal));
        }
        


    }
}