package vehicles.app;
import vehicles.Car;
import vehicles.ElectricCar;


// реализация наследования и инкапсуляции

public class TestCar_ {
    public static void main(String[] args) {
        Car car1 = new Car("Шайтан", "Жигули 2107", "98134", "розовый", "9hj45", "Наш", 2002);
        System.out.println(car1.get_ownerName());
        System.out.println(car1.get_color());
        car1.set_color("red");
        car1.to_string();

        ElectricCar electry = new ElectricCar("Эславик", "Dodge", "39580", "black", "34fg82", "V8", 1993, 25.76);
        System.out.println(electry.get_batteryCapacity());
        System.out.println(electry.get_model());
        electry.set_model("Mercedes");
        electry.to_string();
    }
}
