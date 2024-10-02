package vehicles;

public class Car extends Vehicle {
    public Car(String ownerName, String model, String license, String color,
     String insuranceNumber, String engineType, int year) {
        super(ownerName, model, license, color, insuranceNumber, engineType, year);
    }

    public String vehicleType() {
        return "Car";
    }
}