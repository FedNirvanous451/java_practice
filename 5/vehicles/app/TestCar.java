package vehicles.app;
import vehicles.Car;
import vehicles.ElectricCar;


// реализация наследования и инкапсуляции

public class TestCar {
    public static void main(String[] args) {
        Car car2 = new Car("Шайтан", "Жигули 2107", "98134", "розовый", "9hj45", "Наш", 2002);
        car2.set_year(2013);
        car2.set_ownerName("майкл");
        car2.set_insuranceNumber("2354G5");
        car2.to_string();

        ElectricCar electry = new ElectricCar("Эссславик", "СЛАВА",
         "39580", "black", "34fg82", "V8", 1993, 25.76);
        electry.set_year(1999);
        electry.set_ownerName("Шама");
        electry.set_insuranceNumber("736Fh4");
        electry.get_batteryCapacity();
        electry.to_string();
    }
}
