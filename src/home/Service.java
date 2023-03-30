package home;

public class Service {
    private String name;

    public Service(String name) {
        this.name = name;
    }

    public void changeColor(Car car, String color) {
        System.out.println(name + " service: changing color of " + car.getModel() + " to " + color);
        car.setColor(color);
    }

    public void changeWheelSize(Car car, int wheelSize) {
        System.out.println(name + " service: changing wheel size of " + car.getModel() + " to " + wheelSize);
        car.setWheelSize(wheelSize);
    }

    public void addOption(Car car, String option) {
        System.out.println(name + " service: adding option " + option + " to " + car.getModel());
        car.addOption(option);
    }

    public void removeOption(Car car, String option) {
        System.out.println(name + " service: removing option " + option + " from " + car.getModel());
        car.removeOption(option);
    }
}
