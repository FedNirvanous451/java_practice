package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, double batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
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

