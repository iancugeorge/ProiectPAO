package shelter.domain.repository;

import shelter.domain.entity.Adopter;

import java.util.Arrays;

public class AdopterRepositoryImpl implements AdopterRepository {

    private Adopter[] adopters = new Adopter[]{};
    private static int id = 0;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Adopter[] getAllAdopters() {
        return adopters;
    }

    @Override
    public Adopter getAdopterById(int id) {
        for (Adopter adopter : adopters
        ) {
            if (adopter.getId() == id)
                return adopter;
        }
        return null;
    }

    @Override
    public void addAdopter(Adopter adopter) {
        if (adopters != null) {
            adopters = Arrays.copyOf(adopters, adopters.length + 1);
            adopters[adopters.length - 1] = adopter;
        } else {
            adopters = new Adopter[1];
            adopters[0] = adopter;
        }

        id++;
    }

}
