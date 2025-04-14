package pr10.models;

import interfaces.VehicleInterface;

public class Bicycle extends Vehicle implements VehicleInterface {

    public Bicycle(String brand, String model, double maxSpeed, int capacity) {
        super(brand, model, maxSpeed, capacity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle - " + brand + " " + model);
    }

    @Override
    public double currentSpeed() {
        return maxSpeed * 0.5;
    }

    @Override
    public void showCapacity() {
        System.out.println("Capacity: " + capacity + " persons");
    }

    @Override
    public void start() {
        System.out.println("Bicycle ride started!");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle ride stopped.");
    }
}
