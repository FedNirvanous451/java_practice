import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // задание 1
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        System.out.println("Список без дубликатов: " + Main.deleteDubl(numbers));

        // задание 2
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Индекс элемента 3: " + Main.linearSearch(array, 3)); 
        System.out.println("Индекс элемента 6: " + Main.linearSearch(array, 6)); 


        // задание 3
        Circle[] circle = {new Circle(67), new Circle(10), new Circle(7)};
        System.out.println("Радиус наибольшего круга: " + Main.maximum_of(circle).radius); 

        // задание 4
        Circle[][] circles = {{new Circle(12), new Circle(5)},
                {new Circle(33), new Circle(10)}
        };
        System.out.println("Радиус наибольшего круга (в двумерном массиве): " + Main.maximum_of_two(circles).radius); 
    }
}

