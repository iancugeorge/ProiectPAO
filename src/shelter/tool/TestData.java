package shelter.tool;

public class TestData {
    private TestData(){}
    private static TestData instance = new TestData();
    public static TestData getInstance() {
        return instance;
    }

    public String[] getDogData() {
        String[] ext = {new String("1,Max"), new String("2,Tom")};
        return ext;
    }
}
