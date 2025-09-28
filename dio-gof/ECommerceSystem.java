public class ECommerceSystem {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("🏪 " + ConfigurationManager.getInstance().getAppInfo());
        System.out.println("=".repeat(60));

        try {
            // Demonstração do padrão Factory Method
            System.out.println("\n📦 CRIANDO PRODUTOS (Factory Pattern):");
            Product laptop = ProductFactory.createProduct("electronics", "MacBook Pro", 2499.99);
            Product jeans = ProductFactory.createProduct("clothing", "Jeans Premium", 89.99);
            Product book = ProductFactory.createProduct("books", "Design Patterns", 49.99);

            laptop.displayInfo();
            jeans.displayInfo();
            book.displayInfo();

            // Demonstração do padrão Strategy
            System.out.println("\n💳 ESTRATÉGIAS DE DESCONTO (Strategy Pattern):");
            DiscountStrategy noDiscount = new NoDiscount();
            DiscountStrategy percentDiscount = new PercentageDiscount(15);
            DiscountStrategy fixedDiscount = new FixedAmountDiscount(50);

            double testAmount = 100;
            System.out.println("Valor teste: $" + testAmount);
            System.out.println(noDiscount.getDescription() + " = $" + noDiscount.calculateDiscount(testAmount));
            System.out.println(percentDiscount.getDescription() + " = $" + percentDiscount.calculateDiscount(testAmount));
            System.out.println(fixedDiscount.getDescription() + " = $" + fixedDiscount.calculateDiscount(testAmount));

            // Demonstração do padrão Builder
            System.out.println("\n🛍️ CRIANDO PEDIDO (Builder Pattern):");
            Order order = new Order.Builder()
                .setId("ORD-001")
                .setCustomerName("João Silva")
                .setCustomerEmail("joao@email.com")
                .addProduct(laptop)
                .addProduct(jeans)
                .addProduct(book)
                .setDiscountStrategy(new PercentageDiscount(10))
                .setShippingAddress("Rua das Flores, 123 - São Paulo, SP")
                .setExpressShipping(true)
                .build();

            // Demonstração do padrão Observer
            System.out.println("\n👀 ADICIONANDO OBSERVADORES (Observer Pattern):");
            order.addObserver(new EmailNotificationService());
            order.addObserver(new InventoryService());
            order.addObserver(new LoggingService());

            // Processando o pedido
            order.processOrder();

            System.out.println("\n" + "=".repeat(60));
            System.out.println("✅ DEMONSTRAÇÃO DE PADRÕES CONCLUÍDA!");
            System.out.println("Padrões implementados:");
            System.out.println("• Singleton - ConfigurationManager");
            System.out.println("• Factory Method - ProductFactory");
            System.out.println("• Strategy - DiscountStrategy");
            System.out.println("• Observer - OrderObserver");
            System.out.println("• Builder - Order.Builder");
            System.out.println("=".repeat(60));

        } catch (Exception e) {
            System.err.println("❌ Erro durante a execução: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
