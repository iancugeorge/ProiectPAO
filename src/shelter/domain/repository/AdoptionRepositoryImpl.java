package shelter.domain.repository;

import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;
import shelter.domain.entity.Animal;

import java.util.Arrays;

public class AdoptionRepositoryImpl implements AdoptionRepository {
    private static int id = 0;
    private Adoption[] adoptions = new Adoption[]{};

    public int getId() {
        return id;
    }

    @Override
    public Adoption getAdoptionById(int id) {
        for (Adoption adoption : adoptions
        ) {
            if (adoption.getId() == id)
                return adoption;
        }
        return null;
    }

    @Override
    public Adoption[] getAllAdoptions() {
        return adoptions;
    }

    @Override
    public Adoption getAdoptionByAnimal(Animal animal) {
        for (Adoption adoption : adoptions
        ) {
            if (adoption.getAnimal() == animal)
                return adoption;
        }
        return null;

    }

    @Override
    public Adoption[] getAdoptionsByAdopter(Adopter adopter) {
        int i = 0;
        Adoption[] adoptionsByAdopter = new Adoption[10];

        for (Adoption adoption : adoptions
        ) {
            if (adoption.getAdopter() == adopter) {
                adoptionsByAdopter[i] = adoption;
                i++;
            }
        }
        return adoptionsByAdopter;
    }

    public void addAdoption(Adoption adoption) {

        if (adoptions != null) {
            adoptions = Arrays.copyOf(adoptions, adoptions.length + 1);
            adoptions[adoptions.length - 1] = adoption;
        } else {
            adoptions = new Adoption[1];
            adoptions[0] = adoption;
        }

        id++;
    }
}
