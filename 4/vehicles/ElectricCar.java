package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String ownerName, String model, String license, String color,
     String insuranceNumber, String engineType, int year, double batteryCapacity) {
        super(ownerName, model, license, color, insuranceNumber, "Electric", year);
        this.batteryCapacity = batteryCapacity;
    }

    public String vehicleType() {
        return "Electric Car";
    }

    // геттер
    public double get_batteryCapacity() {
        return this.batteryCapacity;
    }

    // сеттер 
    public void set_batteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}    

