// задание 1

public class Triangle extends GeometricObject{
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle(String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled)
    throws IllegalTriangleException {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // задание 2 - создание обработки исключения
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side3 + side2 <= side1))
        throw new IllegalTriangleException("Не выполняется правило треугольника - недопустимые значения",
        side1, side2, side3);
    }    

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void to_String() {
        System.out.println("\nТреугольник: сторона1 = " + side1 + " сторона2 = " + side2 + " сторона 3 = " + side3);
    }
}


