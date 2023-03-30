package home;

import java.util.ArrayList;

public class VolvoFactory extends Car {
    private int groundClearance;

    public VolvoFactory(String color, String model, int year, int wheelSize, int engineVolume, ArrayList<String> options, int groundClearance) {
        super(color, model, year, wheelSize, engineVolume, options);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() {
        return groundClearance;
    }
}