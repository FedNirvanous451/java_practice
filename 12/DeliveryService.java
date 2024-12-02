public abstract class DeliveryService {
    protected String deliveryType;
    
    public DeliveryService(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public abstract void createOrder();

    public void deliver() {
        System.out.println("Это служба доставки DeliveryService!");
    }
}
