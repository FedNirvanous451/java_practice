public class Main {
    public static void main(String[] args) {
        Car_two Nissan = new Car_two();
        Nissan.set_model("Skyline");
        Nissan.set_year(1999);
        Nissan.set_license("xz929");
        Nissan.set_color("grey");
        Nissan.to_string();
        Nissan.to_age_car();

        Car_two Ford = new Car_two("Mustang", "blue", 1972);
        Ford.to_string();
        Ford.to_age_car();
    }
}


