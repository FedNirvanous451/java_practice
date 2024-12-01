import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<Object> stack = new MyStack();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            String s = input.nextLine();
            stack.push(s);
        }

        System.out.println("Строки в обратном порядке:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
