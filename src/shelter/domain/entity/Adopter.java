package shelter.domain.entity;

public class Adopter extends Person {

    private Adoption[] adoptions;

    public Adoption[] getAdoptions() {
        return adoptions;
    }

    public void setAdoptions(Adoption[] adoptions) {
        this.adoptions = adoptions;
    }
}
