package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.entity.Veterinarian;

import java.util.Date;

public interface MedicalProcedureRepository {

    int getId();

    MedicalProcedure getMedicalProcedureById(int id);

    MedicalProcedure[] getMedicalProceduresByVet(Veterinarian veterinarian);

    MedicalProcedure[] getMedicalProceduresByAnimal(Animal animal);

    MedicalProcedure[] getMedicalProceduresByDate(Date date);

    MedicalProcedure[] getAllMedicalProcedures();

    void addMedicalProcedure(MedicalProcedure medicalProcedure);
}
