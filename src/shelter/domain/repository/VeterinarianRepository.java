package shelter.domain.repository;

import shelter.domain.entity.Cage;
import shelter.domain.entity.Veterinarian;

public interface VeterinarianRepository {

    Veterinarian[] getAllVeterinarians();
    Veterinarian getVeterinarianById(int id);
    Veterinarian getVeterinarianByCage(Cage cage);
}