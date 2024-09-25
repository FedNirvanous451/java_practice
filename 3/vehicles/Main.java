package vehicles;

// реализация наследования и инкапсуляции

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Karla", "98134", "Diesel");
        System.out.println(car1.get_ownerName());
        System.out.println(car1.get_insuranceNumber());
        System.out.println(car1.get_engineType());

        ElectricCar electry = new ElectricCar("Max", "39580", 25.76);
        System.out.println(electry.get_batteryCapacity());
        System.out.println(electry.get_engineType());
        System.out.println(electry.get_insuranceNumber());
        System.out.println(electry.get_ownerName());
    }
    
}
