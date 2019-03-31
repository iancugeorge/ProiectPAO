package shelter.domain.entity;

import shelter.tool.enums.MedType;

import java.util.Date;

public class MedicalProcedure {

    private int id;
    private Animal animal;
    private Veterinarian veterinarian;

    private MedType type;

    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MedType getType() {
        return type;
    }

    public void setType(MedType type) {
        this.type = type;
    }
}
