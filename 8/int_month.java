import java.util.InputMismatchException;
import java.util.Scanner;

public class int_month {
    public static void main(String[] args) {
        class Is {
            // класс со статическим методом определения високосного года
            public static boolean is_year(int x) {
                if (x % 4 == 0 && x % 100 == 0 && x % 400 == 0) {
                    return true;
                }
                return false;
            }
        }

        String[] months = {"январь", "февраль", "март", "апрель", "май",
        "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int amount; // переменная для ввода пользователем числа от 1 до 12
        int year; // каков год на дворе

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        try {
            amount = input.nextInt();
            if (amount == 2) {
                System.out.print("Введите год: ");
                year = input.nextInt();
                if (Is.is_year(year)) {
                    System.out.println("Год високосный и " + months[amount - 1] + " has 29 days");
                }
            }
            else {
                System.out.println(months[amount - 1] + " has " + dom[amount - 1] + " days");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Введено не целое число.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива.");
        }
    }
}
