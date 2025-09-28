class Order {
    private final String id;
    private final String customerName;
    private final String customerEmail;
    private final java.util.List<Product> products;
    private final DiscountStrategy discountStrategy;
    private final String shippingAddress;
    private final boolean expressShipping;
    private final java.util.List<OrderObserver> observers;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerName = builder.customerName;
        this.customerEmail = builder.customerEmail;
        this.products = builder.products;
        this.discountStrategy = builder.discountStrategy;
        this.shippingAddress = builder.shippingAddress;
        this.expressShipping = builder.expressShipping;
        this.observers = new java.util.ArrayList<>();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String event) {
        for (OrderObserver observer : observers) {
            observer.update(this, event);
        }
    }

    public double getSubTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double getDiscount() {
        return discountStrategy.calculateDiscount(getSubTotal());
    }

    public double getShippingCost() {
        return expressShipping ? 15.00 : 5.00;
    }

    public double getTotal() {
        return getSubTotal() - getDiscount() + getShippingCost();
    }

    public void processOrder() {
        notifyObservers("ORDER_PLACED");
        System.out.println("\n🛒 PROCESSANDO PEDIDO #" + id);
        System.out.println("Cliente: " + customerName + " (" + customerEmail + ")");
        System.out.println("Endereço: " + shippingAddress);
        System.out.println("Entrega: " + (expressShipping ? "Expressa" : "Normal"));

        System.out.println("\nProdutos:");
        for (Product product : products) {
            product.displayInfo();
        }

        System.out.println("\n💰 RESUMO FINANCEIRO:");
        System.out.println("Subtotal: $" + String.format("%.2f", getSubTotal()));
        System.out.println("Desconto (" + discountStrategy.getDescription() + "): -$" +
                          String.format("%.2f", getDiscount()));
        System.out.println("Frete: $" + String.format("%.2f", getShippingCost()));
        System.out.println("TOTAL: $" + String.format("%.2f", getTotal()));

        notifyObservers("ORDER_PROCESSED");
    }

    // Getters
    public String getId() { return id; }
    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public java.util.List<Product> getProducts() { return products; }

    // Builder interno
    public static class Builder {
        private String id;
        private String customerName;
        private String customerEmail;
        private java.util.List<Product> products = new java.util.ArrayList<>();
        private DiscountStrategy discountStrategy = new NoDiscount();
        private String shippingAddress;
        private boolean expressShipping = false;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Builder addProduct(Product product) {
            this.products.add(product);
            return this;
        }

        public Builder setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
            return this;
        }

        public Builder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setExpressShipping(boolean expressShipping) {
            this.expressShipping = expressShipping;
            return this;
        }

        public Order build() {
            // Validações
            if (id == null || id.isEmpty()) {
                throw new IllegalStateException("ID do pedido é obrigatório");
            }
            if (customerName == null || customerName.isEmpty()) {
                throw new IllegalStateException("Nome do cliente é obrigatório");
            }
            if (products.isEmpty()) {
                throw new IllegalStateException("Pedido deve ter pelo menos um produto");
            }

            return new Order(this);
        }
    }
}
