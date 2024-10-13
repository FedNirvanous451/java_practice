package vehicles;

public class Car extends Vehicle {
    public Car(String ownerName, String model, String license, String color,
     String insuranceNumber, String engineType, int year) {
        super(ownerName, model, license, color, insuranceNumber, "Combustion", year);
    }

    public String vehicleType() {
        return "Car";
    }

    @Override
    public void to_string() {
        System.out.println("model = " + model + "; " + "year = " + year + "; "
         + "color = " + color + "; " + "license = " + license + "; "
         + "ownername = " + ownerName + "; " + "insurance number = " + insuranceNumber + "; "
         + "engine type = " + engineType);
    }
}