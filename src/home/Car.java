package home;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private final String model;
    private final int year;
    private int wheelSize;
    private final int engineVolume;
    private ArrayList<String> options;

    public Car(String color, String model, int year, int wheelSize, int engineVolume, ArrayList<String> options) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = options;
    }

    public String getColor() {
        return color;
    }

    public void setEngineVolume(int engineVolume)
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void addOption(String option) {
        options.add(option);
    }

    public void removeOption(String option) {
        options.remove(option);
    }


    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Wheel size: " + wheelSize);
        System.out.println("Engine volume: " + engineVolume);
        System.out.print("Options: ");
        for (String option : options) {
            System.out.print(option + ", ");
        }
        System.out.println();
    }




    public Object getMake() {
    }

    public int getEngineSize() {
    }

    public Car createCar(String model, String color, int engineSize, int wheelSize, List<String> options) {
    }
}


