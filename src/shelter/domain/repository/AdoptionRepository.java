package shelter.domain.repository;

import shelter.domain.entity.Adopter;
import shelter.domain.entity.Adoption;
import shelter.domain.entity.Animal;

public interface AdoptionRepository {

    Adoption getAdoptionById(int id);
    Adoption[] getAllAdoptions();
    Adoption getAdoptionByAnimal(Animal animal);
    Adoption[] getAdoptionsByAdopter(Adopter adopter);
}
