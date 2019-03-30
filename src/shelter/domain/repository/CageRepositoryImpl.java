package shelter.domain.repository;

import shelter.domain.entity.Cage;
import shelter.tool.builders.CageBuilder;

public class CageRepositoryImpl implements CageRepository {

    Cage[] cages =
            new Cage[]{
                    new CageBuilder()
                            .withId(1)
                            .build(),
                    new CageBuilder()
                            .withId(2)
                            .build(),
                    new CageBuilder()
                            .withId(3)
                            .build()
            };

    @Override
    public Cage[] getAllCages() {
        return cages;
    }

    @Override
    public Cage getCageById(int id) {
        for (Cage cage : cages
        ) {
            if (cage.getId() == id)
                return cage;
        }
        ;
        return null;
    }
}
