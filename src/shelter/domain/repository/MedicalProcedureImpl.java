package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.MedicalProcedure;
import shelter.domain.entity.Veterinarian;
import shelter.tool.enums.MedType;

import java.util.Arrays;
import java.util.Date;

public class MedicalProcedureImpl implements MedicalProcedureRepository {

    private MedicalProcedure[] medicalProcedures = new MedicalProcedure[]{};

    private static int id = 0;

    @Override
    public int getId(){
        return id;
    }

    @Override
    public MedicalProcedure[] getAllMedicalProcedures(){
        return medicalProcedures;
    }

    @Override
    public MedicalProcedure getMedicalProcedureById(int id) {
        for (MedicalProcedure medicalProcedure : medicalProcedures) {
            if (medicalProcedure.getId() == id)
                return medicalProcedure;
        }
        return null;
    }

    @Override
    public MedicalProcedure[] getMedicalProceduresByVet(Veterinarian veterinarian) {
        int i = 0;
        MedicalProcedure[] medicalProceduresByVet = new MedicalProcedure[10];

        for (MedicalProcedure medicalProcedure : medicalProcedures) {
            if (medicalProcedure.getVeterinarian() == veterinarian) {
                medicalProceduresByVet[i] = medicalProcedure;
                i++;
            }
        }
        return medicalProceduresByVet;
    }

    @Override
    public MedicalProcedure[] getMedicalProceduresByAnimal(Animal animal) {
        int i = 0;
        MedicalProcedure[] medicalProceduresByAnimal = new MedicalProcedure[10];

        for (MedicalProcedure medicalProcedure : medicalProcedures) {
            if (medicalProcedure.getAnimal() == animal) {
                medicalProceduresByAnimal[i] = medicalProcedure;
                i++;
            }
        }
        return medicalProceduresByAnimal;
    }

    @Override
    public MedicalProcedure[] getMedicalProceduresByDate(Date date) {
        int i = 0;
        MedicalProcedure[] medicalProceduresByDate = new MedicalProcedure[10];

        for (MedicalProcedure medicalProcedure : medicalProcedures) {
            if (medicalProcedure.getDate() == date) {
                medicalProceduresByDate[i] = medicalProcedure;
                i++;
            }
        }
        return medicalProceduresByDate;
    }

    @Override
    public void addMedicalProcedure(MedicalProcedure medicalProcedure){
        if (medicalProcedures != null) {
            medicalProcedures = Arrays.copyOf(medicalProcedures, medicalProcedures.length + 1);
            medicalProcedures[medicalProcedures.length - 1] = medicalProcedure;
        } else {
            medicalProcedures = new MedicalProcedure[1];
            medicalProcedures[0] = medicalProcedure;
        }

        id++;
    }
}
