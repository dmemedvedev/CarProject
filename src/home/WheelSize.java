package home;

public enum WheelSize {

    SMALL(13),
    MEDIUM(15),
    LARGE(16);

    private int wheelDiameter;
    private WheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
    public int getWheelDiameter() {
        return wheelDiameter;
    }
}
