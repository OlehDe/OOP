package pr10.models;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected double maxSpeed;
    protected int capacity;

    public Vehicle(String brand, String model, double maxSpeed, int capacity) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public abstract void displayInfo();

    public abstract double currentSpeed();

    public abstract void showCapacity();
}
