public class Square extends GeometricObject implements Comparable {
    private double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        setSide(side);
    }

    // безаргументированный конструктор
    public Square() {
        this.side = 0;
    }
    
    public void howToColor(boolean filled) {
        if (filled == true) {
            System.out.println("Раскрасьте четыре стороны.");
        }
    }

    // Устанавливает side
    public void setSide(double side) {
        this.side = side;
    }

    /** Возвращает side */
    public double getSide() {
        return this.side;
    }
    
}
