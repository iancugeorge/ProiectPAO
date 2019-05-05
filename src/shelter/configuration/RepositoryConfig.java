package shelter.configuration;

import shelter.domain.repository.*;

public class RepositoryConfig {

    private static final CageRepository cageRepository = new CageRepositoryImpl();
    private static final AnimalRepository animalRepository = new AnimalRepositorySmartImpl();
    private static final AdoptionRepository adoptionRepository = new AdoptionRepositoryImpl();
    private static final MedicalProcedureRepository medicalProcedureRepository = new MedicalProcedureImpl();
    private static final VeterinarianRepository veterinarianRepository = new VeterinarianRepositoryImpl();
    private static final AdopterRepository adopterRepository = new AdopterRepositoryImpl();
    private static RepositoryConfig ourInstance = new RepositoryConfig();

    private RepositoryConfig() {
    }

    public static AnimalRepository getAnimalRepository() {
        return animalRepository;
    }

    public static CageRepository getCageRepository() {
        return cageRepository;
    }

    public static AdoptionRepository getAdoptionRepository() {
        return adoptionRepository;
    }

    public static MedicalProcedureRepository getMedicalProcedureRepository() {
        return medicalProcedureRepository;
    }

    public static VeterinarianRepository getVeterinarianRepository() {
        return veterinarianRepository;
    }

    public static AdopterRepository getAdopterRepository() {
        return adopterRepository;
    }

    public static RepositoryConfig getRepositoryConfig() {
        return ourInstance;
    }
}
