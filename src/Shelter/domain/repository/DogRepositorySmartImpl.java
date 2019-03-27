package shelter.domain.repository;

import shelter.domain.entity.Dog;
import shelter.tool.TestData;

public class DogRepositorySmartImpl implements DogRepository {

    private Dog[] dogs;

    public DogRepositorySmartImpl(){
        int length = TestData.getInstance().getDogData().length;
        this.dogs = new Dog[length];
        for(int i=0; i<length; i++){
            String[] splitedData = TestData.getInstance().getDogData()[i].split(",");
            this.dogs[i].setId(Integer.valueOf(splitedData[0]));
            this.dogs[i].setName(splitedData[1]);
        }
    }

}
