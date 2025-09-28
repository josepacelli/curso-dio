class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double amount) {
        return amount * (percentage / 100);
    }

    @Override
    public String getDescription() {
        return percentage + "% de desconto";
    }
}
