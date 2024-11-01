// задание 3

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    
    public void howToColor(boolean filled) {
        if (filled == true) {
            System.out.println(this.getColor());
        }
    }
}
