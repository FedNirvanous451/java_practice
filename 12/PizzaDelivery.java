public class PizzaDelivery extends DeliveryService {
    public PizzaDelivery() {
        super("Pizza");
    }; // конструктор 

    public void createOrder() {
        System.out.println("Создание заказа для доставки " + this.deliveryType);
    }
}
