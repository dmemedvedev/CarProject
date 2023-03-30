package home;

public enum Engine {
    ENGINE1("V6TFSI",2),
    ENGINE2("8E2", 3),
    ENGINE3("T6AWD",4);

    private String engineName;
    private int engineVolume;

    private Engine(String engineName, int engineVolume) {
        this.engineName = engineName;
        this.engineVolume = engineVolume;
    }

    public String getEngineName() {
        return engineName;
    }

    public int getEngineVolume() {
        return engineVolume;
    }
}