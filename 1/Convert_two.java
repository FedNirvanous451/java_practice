import java.util.Scanner;

public class Convert_two {
    public static void main(String args[]) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan; // сумма денег а китайских юанях
        double roubles; // сумма денег к российских рублях

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайских юанях: ");
        yuan = input.nextInt();

        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);
        if (roubles % 100 < 21 && roubles % 100 > 9)
            System.out.println("Получено " + roubles + " рублей");
        else if (roubles % 10 < 2 && roubles % 100 >= 1)
            System.out.println("Получено " + roubles + " рубль");
        else if (roubles % 10 >= 2 && roubles % 10 < 5)
            System.out.println("Получено " + roubles + " рубля");
        else 
            System.out.println("Получено " + roubles + " рублей");
    }
}


