class LoggingService implements OrderObserver {
    @Override
    public void update(Order order, String event) {
        System.out.println("📝 Log: " + event + " - Pedido #" + order.getId() +
                          " - Total: $" + order.getTotal());
    }
}
