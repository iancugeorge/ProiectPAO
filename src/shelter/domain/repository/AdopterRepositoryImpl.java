package shelter.domain.repository;

import shelter.domain.entity.Adopter;

public class AdopterRepositoryImpl implements AdopterRepository{

    private Adopter[] adopters = new Adopter[]{new Adopter()};

    @Override
    public Adopter[] getAllAdopters() {
        return adopters;
    }

    @Override
    public Adopter getAdopterById(int id) {
        for (Adopter adopter:adopters
             ) {
            if(adopter.getId() == id)
                return adopter;
        }
        return null;
    }
}
