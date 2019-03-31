package shelter.services;

import shelter.configuration.RepositoryConfig;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.repository.AnimalRepository;
import shelter.domain.repository.MedicalProcedureRepository;
import shelter.domain.repository.VeterinarianRepository;
import shelter.tool.builders.MedicalProcedureBuilder;
import shelter.tool.enums.MedType;

import java.util.Date;

public class MedicalProcedureService {

    private MedicalProcedureRepository medRepo = RepositoryConfig.getMedicalProcedureRepository();
    private AnimalRepository animalRepo = RepositoryConfig.getAnimalRepository();
    private VeterinarianRepository vetRepo = RepositoryConfig.getVeterinarianRepository();

    private static MedicalProcedureService instance = new MedicalProcedureService();

    private MedicalProcedureService() {
    }

    public static MedicalProcedureService getMedicalProcedureService() {
        return instance;
    }

    public void listMedicalProcedure(MedicalProcedure medicalProcedure){
        System.out.println("Medical Procedure with ID: " + medicalProcedure.getId()
            + "\n\tOn animal ID-Name: " + medicalProcedure.getAnimal().getId() + " - " + medicalProcedure.getAnimal().getName()
            + "\n\tBy veterinarian ID-Name: " + medicalProcedure.getVeterinarian().getId() + " - " + medicalProcedure.getVeterinarian().getFirstName() + " " + medicalProcedure.getVeterinarian().getLastName()
            + "\nTYPE: " + medicalProcedure.getType()
            + "\nDATE: " + medicalProcedure.getDate()
            + "\n");
    }

    public void listMedicalProcedureById(int id){
        listMedicalProcedure(medRepo.getMedicalProcedureById(id));
    }

    public void listAllMedicalProcedures(){
        for (MedicalProcedure medicalProcedure:medRepo.getAllMedicalProcedures()
             ) {
            listMedicalProcedure(medicalProcedure);
        }
    }

    public void makeMedicalProcedure(int animalId, int veterinarianId, MedType type, Date date){
        MedicalProcedure medicalProcedure = new MedicalProcedureBuilder()
                .withId(medRepo.getId())
                .withAnimal(animalRepo.getAnimalById(animalId))
                .withVeterinarian(vetRepo.getVeterinarianById(veterinarianId))
                .withType(type)
                .withDate(date)
                .build();

        // TODO: add medicalProcedure in animals
        // TODO: add medicalProcedure in veterinarian

        medRepo.addMedicalProcedure(medicalProcedure);
    }


}
