public class GroceryDelivery extends DeliveryService {
    public GroceryDelivery() { // конструктор 
        super("Grocery");
    } 

    public void createOrder() {
        System.out.println("Создание заказа для доставки " + this.deliveryType);
    }
}
