import shelter.services.*;
import shelter.tool.enums.Gender;
import shelter.tool.enums.MedType;

import java.util.*;

public class Run {

    public static void main(String[] args) {

        AnimalService animalService = AnimalService.getAnimalService();
        CageService cageService = CageService.getCageService();
        AdoptionService adoptionService = AdoptionService.getAdoptionService();
        MedicalProcedureService medicalProcedureService = MedicalProcedureService.getMedicalProcedureService();
        AdopterService adopterService = AdopterService.getAdopterService();

        animalService.loadData();
        animalService.listAllAnimals();

        animalService.addCat(7,"Felix", Gender.MALE);

        animalService.saveData();

        cageService.addDogToCageById(1, 1);
        cageService.addDogToCageById(2, 1);
        cageService.addDogToCageById(3, 2);
        cageService.addDogToCageById(4, 2);
        cageService.listAllCages();


        medicalProcedureService.listAllMedicalProcedures();
        medicalProcedureService.makeMedicalProcedure(1, 0, MedType.Castrate, new Date());
        medicalProcedureService.makeMedicalProcedure(1, 0, MedType.CherryEye, new Date());
        medicalProcedureService.listAllMedicalProcedures();

        adopterService.listAllAdopters();
        adopterService.addAdopter("John","Doe", "johndoe@email.com");
        adopterService.addAdopter("Jane","Doe", "jane.Doe@email.com");
        adopterService.listAllAdopters();


        adoptionService.makeAdoption(1, 0, new Date());
        adoptionService.makeAdoption(2, 0, new Date());
        animalService.listAllAnimals();
        adoptionService.listAllAdoptions();

        adopterService.listAllAdopters();

        cageService.listAllCages();

    }
}