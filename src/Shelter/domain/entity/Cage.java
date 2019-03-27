package shelter.domain.entity;

public class Cage {

    private int id;
    private Dog[] dogs;

    public Cage(int id, Dog[] dogs) {
        this.id = id;
        this.dogs = dogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }


}
