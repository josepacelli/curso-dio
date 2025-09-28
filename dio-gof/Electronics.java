class Electronics implements Product {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public String getCategory() { return "Electronics"; }

    @Override
    public void displayInfo() {
        System.out.println("📱 " + name + " - $" + price + " (Electronics)");
    }
}
