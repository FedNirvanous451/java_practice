import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) throws IllegalTriangleException {
        Circle circle = new Circle(1);
        System.out.println("Круг " + circle.toString());
        System.out.println("Радиус равен " + circle.getRadius());
        System.out.println("Площадь равна " + circle.getArea());
        System.out.println("Диаметр равен " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nПрямоугольник " + rectangle.toString());
        System.out.println("Площадь равна " + rectangle.getArea());
        System.out.println("Периметр равен " + rectangle.getPerimeter());
        
        // задание 3 - тестирование
        double s1, s2, s3;
        boolean filled;
        String color;
        Scanner in = new Scanner(System.in);
        System.out.print("Input s1: ");
        s1 = in.nextDouble();
        System.out.print("Input s2: ");
        s2 = in.nextDouble();
        System.out.print("Input s3: ");
        s3 = in.nextDouble();
        System.out.print("Input filled: ");
        filled = in.nextBoolean();
        System.out.print("Input color: ");
        color = in.next();
        System.out.printf("Стороны треугольника: %f, %f, %f \nцвет заливки: %s\nуказание заливки: %b", s1, s2, s3, color, filled);
        in.close();

        // задание 3
        Triangle tr_one = new Triangle(s1, s2, s3, color, filled);
        tr_one.to_String();
        System.out.println("Цвет равен " + tr_one.getColor());
        System.out.println("Площадь равна " + tr_one.getArea());
        System.out.println("Периметр равен " + tr_one.getPerimeter());

        System.out.println(GeometricObject.max(tr_one.getArea(), circle.getArea())); // тест статического метода max(x, y)

        // задание 4
        Circle[] five = new Circle[5];
        five[1] = new Circle("grey", false, 3.45);
        five[1] = new Circle("yellow", false, 5);
        five[2] = new Circle("blue", true, 67);
        five[3] = new Circle("black", false, 2);
        five[4] = new Circle("white", true, 4.5);

        System.out.println("Площадь равна " + five[0].getArea());
        System.out.println("Площадь равна " + five[1].getArea());
        System.out.println("Площадь равна " + five[2].getArea());
        System.out.println("Площадь равна " + five[3].getArea());
        System.out.println("Площадь равна " + five[4].getArea());
    }
}

