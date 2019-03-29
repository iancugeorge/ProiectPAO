package shelter.domain.repository;

import shelter.domain.entity.Animal;
import shelter.domain.entity.Cage;

public interface CageRepository {


    Cage[] getAllCages();
    Cage getCageById(int id);


}
