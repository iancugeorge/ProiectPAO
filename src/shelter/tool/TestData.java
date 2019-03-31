package shelter.tool;

public class TestData {
    private static TestData instance = new TestData();

    private TestData() {
    }

    public static TestData getInstance() {
        return instance;
    }

    public String[] getDogData() {
        String[] ext = {"1,Max", "2,Tom"};
        return ext;
    }
}
