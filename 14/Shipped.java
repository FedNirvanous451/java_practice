class Shipped implements StateOrder {
    @Override
    public void handle(Order order, String event) {
        System.out.println("Заказ уже отправлен. Дальнейшие действия невозможны.");
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}