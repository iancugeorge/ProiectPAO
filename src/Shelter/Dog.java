package Shelter;

public class Dog extends Animal {

    private Cage cage;

    public Dog(){}

    public Dog(int id, String name, boolean sex) {
        super(id, name, sex);
    }

    public void latra()
    {
        System.out.println("Ham ham!");
    }
}
