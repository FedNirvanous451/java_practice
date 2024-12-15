class NewOrder implements StateOrder {
    @Override
    public void handle(Order order, String event) {
        if (event.equals("process")) {
            order.setState(new Processing());
        }
        else {
            System.out.println("Некорректное событие для состояния New" + event);
        }
    }
    @Override
    public String getStatus() { return "New"; }
}