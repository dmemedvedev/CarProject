package home;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private List<Car> carsOnStock;
    private List<String> availableColors;
    private List<Integer> availableWheelSizes;
    private List<Integer> availableEngineVolumes;
    private List<Class<? extends Car>> allowedCarTypes;

    public CarFactory(List<Class<? extends Car>> allowedCarTypes,
                      List<String> availableColors,
                      List<Integer> availableWheelSizes,
                      List<Integer> availableEngineVolumes,
                      int initialStockSize) {
        this.allowedCarTypes = allowedCarTypes;
        this.availableColors = availableColors;
        this.availableWheelSizes = availableWheelSizes;
        this.availableEngineVolumes = availableEngineVolumes;
        carsOnStock = new ArrayList<>();
        for (int i = 0; i < initialStockSize; i++) {
            carsOnStock.add(createCar());
        }
    }

    public void printAvailableColors() {
        System.out.println("Available colors:");
        for (String color : availableColors) {
            System.out.println("- " + color);
        }
    }

    public void printAvailableWheelSizes() {
        System.out.println("Available wheel sizes:");
        for (int size : availableWheelSizes) {
            System.out.println("- " + size);
        }
    }

    public void printAvailableEngineVolumes() {
        System.out.println("Available engine volumes:");
        for (int volume : availableEngineVolumes) {
            System.out.println("- " + volume);
        }
    }

    public Car orderCar(Class<? extends Car> carType, String color, int wheelSize, int engineVolume) {
        Car carToModify = getCarFromStock(carType);
        if (carToModify == null) {
            carToModify = createCar(carType);
        }

        if (!availableColors.contains(color)) {
            throw new IllegalArgumentException("Color " + color + " is not available for this factory");
        }
        carToModify.setColor(color);

        if (!availableWheelSizes.contains(wheelSize)) {
            throw new IllegalArgumentException("Wheel size " + wheelSize + " is not available for this factory");
        }
        carToModify.setWheelSize(wheelSize);

        if (!availableEngineVolumes.contains(engineVolume)) {
            throw new IllegalArgumentException("Engine volume " + engineVolume + " is not available for this factory");
        }
        carToModify.setEngineVolume(engineVolume);

        return carToModify;
    }

    private Car createCar(Class<? extends Car> carType) {
        try {
            return carType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not create car instance", e);
        }
    }

    private Car createCar() {
        if (allowedCarTypes.isEmpty()) {
            throw new IllegalStateException("No car types are allowed in this factory");
        }
        Class<? extends Car> carType = allowedCarTypes.get((int) (Math.random() * allowedCarTypes.size()));
        return createCar(carType);
    }

    private Car getCarFromStock(Class<? extends Car> carType) {
        for (Car car : carsOnStock) {
            if (carType.isInstance(car)) {
                carsOnStock.remove(car);
                return car;
            }
        }
        return null;
    }

    public void addCarToStock(Car car) {
        if (allowedCarTypes.contains(car.getClass())) {
            carsOnStock.add(car);
        } else {
            throw new IllegalArgumentException("Cannot add car of type " + car.getClass().getSimpleName() +
                    " to this factory, only " + allowedCarTypes + " are allowed.");
        }
    }

    public void printAvailableModels() {
    }

    public void printAvailableEngineSizes() {
    }
}