class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Sem desconto";
    }
}
