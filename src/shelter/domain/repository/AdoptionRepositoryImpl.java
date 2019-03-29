package shelter.domain.repository;

import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;
import shelter.domain.entity.Animal;

public class AdoptionRepositoryImpl implements AdoptionRepository {
    private Adoption[] adoptions = new Adoption[]{new Adoption()};

    @Override
    public Adoption getAdoptionById(int id) {
        for (Adoption adoption:adoptions
             ) {
            if(adoption.getId() == id)
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
        for (Adoption adoption:adoptions
        ) {
            if(adoption.getAnimal() == animal)
                return adoption;
        }
        return null;

    }

    @Override
    public Adoption[] getAdoptionsByAdopter(Adopter adopter) {
        int i = 0;
        Adoption[] adoptionsByAdopter = new Adoption[10];

        for (Adoption adoption:adoptions
             ) {
            if(adoption.getAdopter() == adopter){
                adoptionsByAdopter[i] = adoption;
                i++;
            }
        }
        return adoptionsByAdopter;
    }
}
