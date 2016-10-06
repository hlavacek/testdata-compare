package sk.vhlavacek.test.testdata.compare;

public class TestConfiguration {

    private String testDataFolder = "src/test/test_data";
    private String inputFolder    = "input";
    private String outputFolder   = "output";
    private String expectedFolder = "expected";

    public String getTestDataFolder() {
        return testDataFolder;
    }

    public void setTestDataFolder(String testDataFolder) {
        this.testDataFolder = testDataFolder;
    }

    public String getInputFolder() {
        return inputFolder;
    }

    public void setInputFolder(String inputFolder) {
        this.inputFolder = inputFolder;
    }

    public String getOutputFolder() {
        return outputFolder;
    }

    public void setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
    }

    public String getExpectedFolder() {
        return expectedFolder;
    }

    public void setExpectedFolder(String expectedFolder) {
        this.expectedFolder = expectedFolder;
    }

}
