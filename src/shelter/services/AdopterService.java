package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;
import shelter.domain.repository.AdopterRepository;
import shelter.tool.builders.AdopterBuilder;

public class AdopterService {

    private static AdopterService instance = new AdopterService();
    private AdopterRepository adopterRepo = RepositoryConfig.getAdopterRepository();

    private AdopterService(){};
    public static AdopterService getAdopterService(){
        return instance;
    }

    private AdoptionService adoptionService = AdoptionService.getAdoptionService();

    public void listAdopter(Adopter adopter){
        System.out.println("Adopter with ID: " + adopter.getId() + " - " + adopter.getFirstName() + " " + adopter.getLastName());
        if(adopter.getAdoptions() != null) {
            System.out.println("\tHas adopted: ");
            for (Adoption adoption : adopter.getAdoptions()
            ) {
                adoptionService.listAdoption(adoption);
            }
        }
    }

    public void listAdopterById(int id){
        listAdopter(adopterRepo.getAdopterById(id));
    }

    public void listAllAdopters(){
        for (Adopter adopter:adopterRepo.getAllAdopters()
             ) {
        listAdopter(adopter);
        }
    }

    public void addAdopter(String firstName, String lastName, String email){
        Adopter adopter = new AdopterBuilder()
                .withId(adopterRepo.getId())
                .withFirstName(firstName)
                .withLastName(lastName)
                .withEmail(email)
                .build();

        adopterRepo.addAdopter(adopter);
    }
}
