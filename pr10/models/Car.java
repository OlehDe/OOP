package pr10.models;

import interfaces.VehicleInterface;
import interfaces.FuelBased;

public class Car extends Vehicle implements VehicleInterface, FuelBased {
    private double fuelLevel;
    private boolean engineRunning;

    public Car(String brand, String model, double maxSpeed, int capacity, double fuelLevel) {
        super(brand, model, maxSpeed, capacity);
        this.fuelLevel = fuelLevel;
        this.engineRunning = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - " + brand + " " + model);
    }

    @Override
    public double currentSpeed() {
        return engineRunning ? maxSpeed * 0.6 : 0;
    }

    @Override
    public void showCapacity() {
        System.out.println("Capacity: " + capacity + " persons");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
        engineRunning = true;
    }

    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Car refueled. Current fuel: " + fuelLevel + " L");
    }

    @Override
    public double calculateMaxDistance() {
        return fuelLevel * 10;
    }

    @Override
    public void start() {
        if (engineRunning) {
            System.out.println("Car is starting...");
        } else {
            System.out.println("Start failed: engine is not running.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
        engineRunning = false;
    }
}
