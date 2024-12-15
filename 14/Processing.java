class Processing implements StateOrder {
    @Override
    public void handle(Order order, String event) {
        if (event.equals("ship")) {
            order.setState(new Shipped());
        } else {
            System.out.println("Некорректное событие для Processing: " + event);
        }
    }
    @Override
    public String getStatus() { return "Processing"; }
}