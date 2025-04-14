package pr10;

import pr10.models.Bicycle;
import pr10.models.Car;
import pr10.models.Motorcycle;
import pr10.models.Vehicle;

public class Main {
    public static void main(String[] args) {
        interfaces.VehicleInterface[] vehicles = new interfaces.VehicleInterface[3];

        interfaces.VehicleInterface car = new Car("Toyota", "Corolla", 180, 5, 20);
        interfaces.VehicleInterface motorcycle = new Motorcycle("Honda", "CBR", 220, 2, 10);
        interfaces.VehicleInterface bicycle = new Bicycle("Giant", "Escape", 40, 1);

        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = bicycle;

        for (interfaces.VehicleInterface v : vehicles) {
            System.out.println("-------------------------");
            if (v instanceof Vehicle) {
                ((Vehicle) v).displayInfo();
                ((Vehicle) v).showCapacity();
                System.out.println("Current Speed: " + ((Vehicle) v).currentSpeed() + " km/h");
            }

            if (v instanceof interfaces.FuelBased) {
                ((interfaces.FuelBased) v).startEngine();
                v.start();
                ((interfaces.FuelBased) v).refuel(5);
                System.out.println("Max distance: " + ((interfaces.FuelBased) v).calculateMaxDistance() + " km");
            } else {
                v.start();
            }

            v.stop();
        }
    }
}
