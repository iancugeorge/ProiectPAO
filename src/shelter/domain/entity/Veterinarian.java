package shelter.domain.entity;

public class Veterinarian extends Person{

    private MedicalProcedure[] medicalInterventions;
    private Cage[] cages;

    public MedicalProcedure[] getMedicalInterventions() {
        return medicalInterventions;
    }

    public void setMedicalInterventions(MedicalProcedure[] medicalInterventions) {
        this.medicalInterventions = medicalInterventions;
    }

    public Cage[] getCages() {
        return cages;
    }

    public void setCages(Cage[] cages) {
        this.cages = cages;
    }
}
