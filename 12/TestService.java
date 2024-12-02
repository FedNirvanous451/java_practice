// вариант 2 - реализация паттерна FactoryMethod
public class TestService {
    public static void main(String[] args) {
        PizzaDelivery pizza = new PizzaDelivery();
        pizza.createOrder();
        pizza.deliver();

        GroceryDelivery grocery = new GroceryDelivery();
        grocery.createOrder();
        grocery.deliver();
    }
}
