package shelter.domain.repository;

import shelter.domain.entity.Adopter;

public interface AdopterRepository {

    Adopter[] getAllAdopters();
    Adopter getAdopterById(int id);
}
