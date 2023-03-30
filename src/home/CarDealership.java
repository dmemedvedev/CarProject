package home;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private List<Car> inventory;
    private AudiFactory audiFactory;
    private VolvoFactory volvoFactory;
    private KiaFactory kiaFactory;

    public CarDealership() {
        inventory = new ArrayList<>();
        audiFactory = new AudiFactory();
        volvoFactory = new VolvoFactory();
        kiaFactory = new KiaFactory();
    }

    public static void printAvailableModels() {
    }

    public static void makeOrder(String audi, String a5, String red, double v, int i) {
    }

    public static void changeColor(String audiA5, String white) {
    }

    public static void changeWheelSize(String audiA5, int i) {
    }

    public static void addOption(String volvoXc90, String rearViewCamera) {
    }

    public static void removeOption(String kiaSorento, String cruiseControl) {
    }

    public static void printAllCars() {
    }

    public void orderCar(String make, String model, String color, int engineSize, int wheelSize, List<String> options) {
        Car car = getMatchingCar(make, model, color, engineSize, wheelSize, options);
        if (car == null) {
            car = createNewCar(make, model, color, engineSize, wheelSize, options);
            System.out.println("A new " + make + " " + model + " has been ordered.");
        } else {
            System.out.println("An existing " + make + " " + model + " has been selected.");
            inventory.remove(car);
        }
        System.out.println("The " + make + " " + model + " is being serviced...");
        car = serviceCar(car, make);
        System.out.println("The " + make + " " + model + " is ready for pickup!");
        inventory.add(car);
    }

    private Car getMatchingCar(String make, String model, String color, int engineSize, int wheelSize, List<String> options) {
        for (Car car : inventory) {
            if (car.getMake().equals(make) && car.getModel().equals(model)
                    && car.getColor().equals(color) && car.getEngineSize() == engineSize
                    && car.getWheelSize() == wheelSize && car.getOptions().equals(options)) {
                return car;
            }
        }
        return null;
    }

    private Car createNewCar(String make, String model, String color, int engineSize, int wheelSize, List<String> options) {
        switch (make) {
            case "Audi":
                return audiFactory.createCar(model, color, engineSize, wheelSize, options);
            case "Volvo":
                return volvoFactory.createCar(model, color, engineSize, wheelSize, options);
            case "Kia":
                return kiaFactory.createCar(model, color, engineSize, wheelSize, options);
            default:
                throw new IllegalArgumentException("Invalid make: " + make);
        }
    }

    private Car serviceCar(Car car, String make) {
        switch (make) {
            case "Audi":
                return new AudiFactory().serviceCar(car);
            case "Volvo":
                return new VolvoFactory().serviceCar(car);
            case "Kia":
                return new KiaFactory().serviceCar(car);
            default:
                throw new IllegalArgumentException("Invalid make: " + make);
        }
    }

    public List<Car> getInventory() {
        return inventory;
    }

    public void setInventory(List<Car> inventory) {
        this.inventory = inventory;
    }

    public AudiFactory getAudiFactory() {
        return audiFactory;
    }

    public void setAudiFactory(AudiFactory audiFactory) {
        this.audiFactory = audiFactory;
    }

    public VolvoFactory getVolvoFactory() {
        return volvoFactory;
    }

    public void setVolvoFactory(VolvoFactory volvoFactory) {
        this.volvoFactory = volvoFactory;
    }

    public KiaFactory getKiaFactory() {
        return kiaFactory;
    }

    public void setKiaFactory(KiaFactory kiaFactory) {
        this.kiaFactory = kiaFactory;
    }
}
