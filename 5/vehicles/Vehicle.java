package vehicles;

public abstract class Vehicle {
    String model; // модель автомобиля
    String license; // номер автомобиля
    String color; // цвет автомобиля
    int year; // год выпуска
    String ownerName; // имя владельца
    String insuranceNumber; // страховой номер
    String engineType; // тип двигателя
    
    public abstract String vehicleType();

    public String get_model() { return model; }

    public String get_license() { return license; }

    public String get_color() { return color; }

    public int get_year() { return year; }

    public String get_ownerName() { return ownerName; }

    public String get_insuranceNumber() { return insuranceNumber; }

    public String get_engineType() { return engineType; }



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
    
    public void set_ownerName(String owneString) {
        this.ownerName = owneString;
    }

    public void set_insuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void set_engineType(String engineType) {
        this.engineType = engineType;
    }

    public Vehicle(String ownerName, String model, String license, String color,
     String insuranceNumber, String engineType, int year) {
        this.ownerName = ownerName;
        this.engineType = engineType;
        this.insuranceNumber = insuranceNumber;
        this.model = model; 
        this.license = license;
        this.color = color;
    }

    
    public void to_string() {
        System.out.println("model = " + model + "; " + "year = " + year + "; " + "color = " + color + "; " + "license = " + license + ";");
    }

}
