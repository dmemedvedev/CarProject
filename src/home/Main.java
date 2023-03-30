package home;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        AudiFactory audiFactory = new AudiFactory();
        VolvoFactory volvoFactory = new VolvoFactory();
        KiaFactory kiaFactory = new KiaFactory();

        CarDealership carDealership = new CarDealership();

        CarDealership.printAvailableModels();
        CarDealership.printAvailableModels();
        CarDealership.printAvailableModels();
        CarDealership.printAvailableModels();

        CarDealership.makeOrder("Audi", "A5", "Red", 2.0, 18);
        CarDealership.makeOrder("Volvo", "XC90", "Blue", 3.0, 20);
        CarDealership.makeOrder("Kia", "Sorento", "Green", 2.5, 17);
        CarDealership.changeColor("Audi A5", "White");
        CarDealership.changeWheelSize("Audi A5", 19);
        CarDealership.addOption("Volvo XC90", "Rear view camera");
        CarDealership.removeOption("Kia Sorento", "Cruise control");

        CarDealership.printAllCars();
    }
}