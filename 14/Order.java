class Order {
    private StateOrder state;

    public Order() {
        this.state = new NewOrder();
    }

    public void setState(StateOrder state) {
        this.state = state;
        System.out.println("Статус заказа изменен: " + state.getStatus());
    }

    public void handle(String event) {
        this.state.handle(this, event);
    }

    public String getStatus() {
        return this.state.getStatus();
    }
}
