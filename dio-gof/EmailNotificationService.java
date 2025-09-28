// Observadores concretos
class EmailNotificationService implements OrderObserver {
    @Override
    public void update(Order order, String event) {
        System.out.println("📧 Email enviado: " + event + " para pedido #" + order.getId());
    }
}
