package shelter.domain.entity;

import shelter.tool.enums.Gender;

public abstract class Animal {

    private int id;

    private String name;
    private Gender gender;
    private String ChipId;
    private String PassportId;

    private MedicalProcedure[] medicalHistory;

    private Adoption adoption;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getChipId() {
        return ChipId;
    }

    public void setChipId(String chipId) {
        ChipId = chipId;
    }

    public String getPassportId() {
        return PassportId;
    }

    public void setPassportId(String passportId) {
        PassportId = passportId;
    }

    public MedicalProcedure[] getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalProcedure[] medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Adoption getAdoption() {
        return adoption;
    }

    public void setAdoption(Adoption adoption) {
        this.adoption = adoption;
    }
}
