public class Circle implements Comparable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
}