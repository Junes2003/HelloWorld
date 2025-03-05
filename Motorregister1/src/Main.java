import models.Car;
import models.Motorcycle;
import models.Registry;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry(5);

        Car car = new Car("AB12345", "Toyota", 2018, 50_000, "Benzin");
        Motorcycle motorcycle = new Motorcycle("CD67890", "Yamaha", 2020, 12_000, 650);

        registry.addVehicle(car);
        registry.addVehicle(motorcycle);

        registry.listVehicles();
    }
}