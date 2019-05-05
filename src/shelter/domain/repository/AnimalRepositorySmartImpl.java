package shelter.domain.repository;

import shelter.domain.entity.*;
import shelter.tool.enums.Gender;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepositorySmartImpl implements AnimalRepository {


    private List<Animal> animals = new ArrayList<>();

    public void getData() {

        String csvFile = "C:\\Users\\George\\IdeaProjects\\ProiectPAO\\src\\Animals.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] animalCsv = line.split(cvsSplitBy);

                Animal animal;
                if(animalCsv[0].equals("DOG"))
                {
                    animal = new Dog();
                } else {
                    animal = new Cat();
                }

                animal.setId(Integer.valueOf(animalCsv[1]));
                animal.setName(animalCsv[2]);
                if(animalCsv[3].equals("MALE")) {
                    animal.setGender(Gender.MALE);
                } else {
                    animal.setGender(Gender.FEMALE);
                }
                animal.setChipId(animalCsv[4]);
                animal.setPassportId(animalCsv[5]);

                animals.add(animal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setData() {
        try (PrintWriter writer = new PrintWriter(new File("C:\\Users\\George\\IdeaProjects\\ProiectPAO\\src\\Animals.csv"))) {

            StringBuilder sb = new StringBuilder();

            Dog dog = new Dog();
            String species = null;

            for (Animal animal : getAllAnimals()
            ) {
                if (animal.getClass() == dog.getClass())
                    species = "DOG";
                else
                    species = "CAT";
                sb.append( species + "," + animal.getId() + ',' + animal.getName() + ',' + animal.getGender() + ',' + animal.getChipId() + ',' + animal.getPassportId() + '\n');
            }

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Animal> getAllAnimals() {
        return animals;
    }

    public Dog[] getAllDogs() {
        Dog[] dogs = (Dog[]) new Animal[100];
        int index = 0;
        for (Animal animal : animals) {
            Dog dog = new Dog();
            if (animal.getClass() == dog.getClass()) {
                dogs[0] = (Dog) animal;
                index++;
            }
        }
        return dogs;
    }

    public Cat[] getAllCats() {
        Cat[] cats = (Cat[]) new Animal[100];
        int index = 0;
        for (Animal animal : animals) {
            Cat cat = new Cat();
            if (animal.getClass() == cat.getClass()) {
                cats[index] = (Cat) animal;
                index++;
            }
        }
        return cats;
    }

    public Animal getAnimalById(int id) {

        for (Animal animal : animals) {
            if (animal.getId() == id)
                return animal;
        }
        return null;
    }

    public void addDog(Dog animal) {
        animals.add(animal);

    }

    public void addCat(Cat animal) {
        animals.add(animal);
    }

    public MedicalProcedure[] getMedicalHistory(Animal animal) {
        return animal.getMedicalHistory();
    }

    public Cage getCageByAnimalId(int animalId){

        for (Animal animal : getAllAnimals()
        ) {
            if (animal.getId() == animalId) {
                Dog dog = (Dog)animal;
                return dog.getCage();
            }
        }
        return null;
    }

}
