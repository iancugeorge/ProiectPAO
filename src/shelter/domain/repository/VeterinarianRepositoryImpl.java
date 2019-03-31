package shelter.domain.repository;

import shelter.domain.entity.Cage;
import shelter.domain.entity.Veterinarian;

public class VeterinarianRepositoryImpl implements VeterinarianRepository {

    private Veterinarian[] veterinarians = new Veterinarian[]{new Veterinarian()};

    @Override
    public Veterinarian[] getAllVeterinarians() {
        return veterinarians;
    }

    @Override
    public Veterinarian getVeterinarianById(int id) {
        for (Veterinarian veterinarian : veterinarians
        ) {
            if (veterinarian.getId() == id)
                return veterinarian;
        }
        return null;
    }

    @Override
    public Veterinarian getVeterinarianByCage(Cage cage) {
        for (Veterinarian veterinarian : veterinarians
        ) {
            for (Cage newCage : veterinarian.getCages()
            ) {
                if (newCage == cage)
                    return veterinarian;
            }
        }
        return null;
    }
}
