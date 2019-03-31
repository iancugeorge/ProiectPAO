package shelter.domain.repository;

import shelter.domain.entity.Adopter;

public interface AdopterRepository {

    int getId();

    Adopter[] getAllAdopters();

    Adopter getAdopterById(int id);

    void addAdopter(Adopter adopter);
}
