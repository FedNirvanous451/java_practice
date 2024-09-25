package vehicles;

public class Car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Car(String ownerName, String insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.engineType = engineType;
        this.insuranceNumber = insuranceNumber; 
    }

    // геттеры
    public String get_ownerName() {
        return this.ownerName;
    }

    public String get_insuranceNumber() {
        return this.insuranceNumber;
    }

    public String get_engineType() {
        return this.engineType;
    }

    
    // сеттеры
    public void set_ownerName(String owneString) {
        this.ownerName = owneString;
    }

    public void set_insuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void set_engineType(String engineType) {
        this.engineType = engineType;
    }
}