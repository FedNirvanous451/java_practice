// вариант 7 - реализация паттерна Proxy
public class TestProxyImage {
    public static void main(String[] args) {
        Image image = new ProxyImage("plain.png");

        System.out.println("Первый вызов: ");
        image.display();
        System.out.println("Второй вызов: ");
        image.display();
    }
}
