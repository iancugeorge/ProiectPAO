package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.entity.Veterinarian;

import java.util.Date;

public interface MedicalProcedureRepository {

    MedicalProcedure getMedicalProcedureById(int id);
    MedicalProcedure[] getMedicalProceduresByVet(Veterinarian veterinarian);
    MedicalProcedure[] getMedicalProceduresByAnimal(Animal animal);
    MedicalProcedure[] getMedicalProceduresByDate(Date date);
}
