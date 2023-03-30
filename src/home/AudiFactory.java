package home;

import java.util.ArrayList;

public class AudiFactory extends Car {
    private int topSpeed;

    public AudiFactory(String color, String model, int year, int wheelSize, int engineVolume, ArrayList<String> options, int topSpeed) {
        super(color, model, year, wheelSize, engineVolume, options);
        this.topSpeed = topSpeed;
    }



    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
