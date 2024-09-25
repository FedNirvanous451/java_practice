import java.util.Scanner;

public class Convert {
    public static void main(String args[]) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan; // сумма денег а китайских юанях
        double roubles; // сумма денег к российских рублях

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайских юанях: ");
        yuan = input.nextInt();

        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);
        System.out.print("Ваша сумма в российских рублях: " + roubles);
    }
}

