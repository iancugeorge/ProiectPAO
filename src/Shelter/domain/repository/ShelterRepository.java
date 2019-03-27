package shelter.domain.repository;

import shelter.domain.entity.Cage;

public class ShelterRepository {

    private Cage[] cages = new Cage[]{

    };

    private ShelterRepository() {
    }

    private static ShelterRepository instance;

    public static ShelterRepository getShelterService() {
        if (instance == null) {
            return instance = new ShelterRepository();
        } else {
            return instance;
        }
    }

}
