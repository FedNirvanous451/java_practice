interface StateOrder {
    void handle(Order order, String event);
    String getStatus();
}

