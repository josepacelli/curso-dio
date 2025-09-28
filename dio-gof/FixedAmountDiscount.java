class FixedAmountDiscount implements DiscountStrategy {
    private double fixedAmount;

    public FixedAmountDiscount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double calculateDiscount(double amount) {
        return Math.min(fixedAmount, amount);
    }

    @Override
    public String getDescription() {
        return "$" + fixedAmount + " de desconto fixo";
    }
}
