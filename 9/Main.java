import java.util.ArrayList;

public class Main {
    // задание 1
    public static <E> ArrayList<E> deleteDubl(ArrayList<E> list) {
        ArrayList<E> uniqueList = new ArrayList<>();
        for (E i : list) {
            if (!uniqueList.contains(i)) { // если элемента нет в списке, то добавляем
                uniqueList.add(i);
            }
        }
        return uniqueList; 
    }

    // задание 2
    public static int linearSearch(int[] arr, int target) { // ищем идекс нужного элемента в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // возвращаем позицию элемента
            }
        }
        return -1; // если элемент не найден, выводим -1
    }

    // задание 3
    public static Circle maximum_of(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null;
        }
        Circle largest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].compareTo(largest) > 0) {
                largest = circles[i];
            }
        }
        return largest;
    }

    // задание 4
    public static Circle maximum_of_two(Circle[][] circles) { // наибольший элемент в двумерном массиве
        if (circles == null || circles.length == 0) {
            return null;
        }
        Circle largest = circles[0][0];
        for (Circle[] row : circles) {
            for (Circle circle : row) {
                if (circle.compareTo(largest) > 0) {
                    largest = circle;
                }
            }
        }
        return largest;
    }    
}
