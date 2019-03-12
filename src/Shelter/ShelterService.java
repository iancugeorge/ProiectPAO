package Shelter;

public class ShelterService {

    private Animal animals[] = new Animal[]{new Animal(1, "Max", 3), new Animal(2, "Sam")};

    private ShelterService() {
        System.out.println("Constructor apelat");
    }

    private static ShelterService instance;

    public static ShelterService getShelterService() {
        if (instance == null) {
            System.out.println("Instanta noua creata");
            return instance = new ShelterService();
        } else {
            System.out.println("Instanta veche returnata");
            return instance;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }


}
