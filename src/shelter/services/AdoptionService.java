package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Adoption;
import shelter.domain.repository.AdopterRepository;
import shelter.domain.repository.AdoptionRepository;
import shelter.domain.repository.AnimalRepository;
import shelter.tool.builders.AdoptionBuilder;

import java.util.Date;

public class AdoptionService {

    private static AdoptionService instance;
    private AdoptionRepository adoptionRepo = RepositoryConfig.getAdoptionRepository();
    private AnimalRepository animalRepo = RepositoryConfig.getAnimalRepository();
    private AdopterRepository adopterRepo = RepositoryConfig.getAdopterRepository();

    private AdoptionService() {
    }

    public static AdoptionService getAdoptionService() {
        if (instance == null) {
            return instance = new AdoptionService();
        } else {
            return instance;
        }
    }

    public void listAllAdoptions() {
        for (Adoption adoption : adoptionRepo.getAllAdoptions()
        ) {
            listAdoption(adoption);
        }
    }

    public void listAdoptionById(int id) {
        listAdoption(adoptionRepo.getAdoptionById(id));
    }

    public void listAdoption(Adoption adoption) {
        System.out.println("Adoption with ID: " + adoption.getId()
                + "\n\tAnimal ID-Name: " + adoption.getAnimal().getId() + " - " + adoption.getAnimal().getName()
                + "\n\tAdopter ID-Name: " + adoption.getAdopter().getId() + " - " + adoption.getAdopter().getFirstName() + " " + adoption.getAdopter().getLastName()
                + "\n\tOn " + adoption.getDate());
    }

    public void makeAdoption(int animalId, int adopterId, Date date) {
        Adoption adoption = new AdoptionBuilder()
                .withId(adoptionRepo.getId())
                .withAnimal(animalRepo.getAnimalById(animalId))
                .witAdopter(adopterRepo.getAdopterById(adopterId))
                .withDate(date)
                .build();
        animalRepo.getAnimalById(animalId).setAdoption(adoption);
        // TODO: create add adoption in Adopter
        // adopterRepo.getAdopterById(adopterId).setAdoptions();
        // TODO: set Cage of animal to null and  delete Cage->Animal
        adoptionRepo.addAdoption(adoption);
    }
}
