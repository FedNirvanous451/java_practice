public class Test_ {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Новый статус заказа: " + order.getStatus()); // New

        order.handle("process");  // Переход в Processing
        System.out.println("Статус заказа: " + order.getStatus());

        order.handle("ship");     // Переход в Shipped
        System.out.println("Статус заказа: " + order.getStatus());

        order.handle("некорректное событие"); // Обработка некорректного события
        System.out.println("Статус заказа: " + order.getStatus());

        order.handle("process"); // Попытка некорректного перехода
        System.out.println("Статус заказа: " + order.getStatus());
    }
}
