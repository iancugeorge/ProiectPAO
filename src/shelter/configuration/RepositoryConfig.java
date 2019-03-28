package shelter.configuration;

import shelter.domain.repository.*;

public class RepositoryConfig {

    private static final AnimalRepository animalRepository = new AnimalRepositoryImpl();
    public static AnimalRepository getAnimalRepository() {
        return animalRepository;
    }

    private static RepositoryConfig ourInstance = new RepositoryConfig();

    public static RepositoryConfig getInstance() {
        return ourInstance;
    }

    private RepositoryConfig() {
    }
}
