public class Car_two {
    private String model; // модель автомобиля
    private String license; // номер автомобиля
    private String color; // цвет автомобиля
    private int year; // год выпуска

    
    public Car_two() {
        // конструктор со всеми полями
    }

    public Car_two(String model, String color, int year) {
        // конструктор по выбору студента
        this.model = model;
        this.color = color;
        this.year = year;
    }


    // добавляю геттеры для всех полей
    public String get_model() {
        return this.model;
    }

    public String get_license() {
        return this.license;
    }

    public String get_color() {
        return this.color;
    }

    public int get_year() {
        return this.year;
    }


    // добавляю сеттеры для всех полей
    public void set_model(String model) {
        this.model = model;
    }

    public void set_license(String license) {
        this.license = license;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public void set_year(int year) {
        this.year = year;
    }

    
     // метод, выводящий значения полей экземпляров класса
     public void to_string() {
        System.out.println("model = " + model + "; " + "year = " + year + "; " + "color = " + color + "; " + "license = " + license + ";");
    }

    

    // метод, возвраащющий возраст автомобиля, вычисляющийся от текущего года
    public void to_age_car() {
        int current_year = 2024;
        System.out.println("Возраст автомобиля: " + (current_year - year));
    }
}

