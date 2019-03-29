package shelter.domain.repository;

import shelter.domain.entity.Cage;

public class CageRepositoryImpl implements CageRepository{

    Cage[] cages = new Cage[]{new Cage(), new Cage()};

    @Override
    public Cage[] getAllCages() {
        return cages;
    }

    @Override
    public Cage getCageById(int id) {
        for (Cage cage:cages
             ) {
            if(cage.getId() == id)
                return cage;
        };
        return null;
    }
}
