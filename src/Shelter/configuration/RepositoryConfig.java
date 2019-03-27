package shelter.configuration;

import shelter.domain.repository.AnimalRepository;
import shelter.domain.repository.DogRepository;
import shelter.domain.repository.DogRepositorySmartImpl;
import shelter.domain.repository.ShelterRepository;

public class RepositoryConfig {

    private static final AnimalRepository animalRepository = new AnimalRepository();
    private static final DogRepository dogRepository = new DogRepositorySmartImpl();
    /// TODO: CHANGE TO REPOSITORY
    private static final ShelterRepository shelterRepository = ShelterRepository.getShelterService();

    public static AnimalRepository getAnimalRepository() {
        return animalRepository;
    }

    public static ShelterRepository getShelterRepository() {
        return shelterRepository;
    }

    private static RepositoryConfig ourInstance = new RepositoryConfig();

    public static RepositoryConfig getInstance() {
        return ourInstance;
    }

    private RepositoryConfig() {
    }
}
