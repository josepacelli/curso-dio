class InventoryService implements OrderObserver {
    @Override
    public void update(Order order, String event) {
        if ("ORDER_PLACED".equals(event)) {
            System.out.println("📦 Estoque atualizado para produtos do pedido #" + order.getId());
        }
    }
}
