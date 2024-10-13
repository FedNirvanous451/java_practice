package vehicles;

public class ElectricCar extends Car implements ElectricVehicle{
    private double batteryCapacity;

    public ElectricCar(String ownerName, String model, String license, String color,
     String insuranceNumber, String engineType, int year, double batteryCapacity) {
        super(ownerName, model, license, color, insuranceNumber, engineType, year);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
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

