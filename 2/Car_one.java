public class Car_one {
    String model; // модель автомобиля
    String license; // номер автомобиля
    String color; // цвет автомобиля
    int year; // год выпуска

    public Car_one() {
        // конструктор со всеми полями
    }

    public static void main(String[] args) {
        // конструктор по умолчанию
        Car_one Chevy = new Car_one(); 
        Chevy.model = "Impala";
        Chevy.license = "wx300";
        Chevy.color = "blue";
        Chevy.year = 2011;
        System.out.println(Chevy.model + " " + Chevy.license + " " + Chevy.color + " " + Chevy.year);
    }

    public Car_one(String model, String color, int year) {
        // конструктор по выбору студента
        this.model = model;
        this.color = color;
        this.year = 0;
    }
}

