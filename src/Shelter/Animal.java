package Shelter;

import java.util.Date;

public abstract class Animal {

    private int id;

    private String name;
    private boolean sex;

    private Date birthDate;
    private Date identificationDate;

    private boolean castrated;

    /// Constructors

    public Animal() {
    }

    public Animal(int id, String name, boolean sex, boolean castrated, Date identificationDate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.identificationDate = identificationDate;
        this.castrated = castrated;
    }

    public Animal(int id, String name, boolean sex, boolean castrated) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.identificationDate = new Date();
        this.castrated = castrated;
    }

    public Animal(int id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.identificationDate = new Date();
        this.castrated = false;
    }

    /// Getters / Setters

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getIdentificationDate() {
        return identificationDate;
    }

    public void setIdentificationDate(Date identificationDate) {
        this.identificationDate = identificationDate;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /// Methods

    public int getAge() {
        //Calendar today = Calendar.getInstance();
        //return birthDate.getYear();
        return -1;
    }

    public void latra() {
    }

}
