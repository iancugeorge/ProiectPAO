package shelter.tool;

public class TestData {
    private static TestData instance = new TestData();

    private TestData() {
    }

    public static TestData getInstance() {
        return instance;
    }

    public String[] getAnimalData() {
        String[] ext = {"1,Max", "2,Tom", "3,Recs"};
        return ext;
    }
}
