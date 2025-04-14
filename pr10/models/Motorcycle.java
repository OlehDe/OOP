package pr10.models;

import interfaces.VehicleInterface;
import interfaces.FuelBased;

public class Motorcycle extends Vehicle implements VehicleInterface, FuelBased {
    private double fuelLevel;
    private boolean engineRunning;

    public Motorcycle(String brand, String model, double maxSpeed, int capacity, double fuelLevel) {
        super(brand, model, maxSpeed, capacity);
        this.fuelLevel = fuelLevel;
        this.engineRunning = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - " + brand + " " + model);
    }

    @Override
    public double currentSpeed() {
        return engineRunning ? maxSpeed * 0.8 : 0;
    }

    @Override
    public void showCapacity() {
        System.out.println("Capacity: " + capacity + " persons");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
        engineRunning = true;
    }

    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Motorcycle refueled. Current fuel: " + fuelLevel + " L");
    }

    @Override
    public double calculateMaxDistance() {
        return fuelLevel * 20;
    }

    @Override
    public void start() {
        if (engineRunning) {
            System.out.println("Motorcycle is starting...");
        } else {
            System.out.println("Start failed: engine is not running.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
        engineRunning = false;
    }
}
