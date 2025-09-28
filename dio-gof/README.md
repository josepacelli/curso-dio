# 🏪 Sistema E-commerce com Padrões de Projeto

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![Design Patterns](https://img.shields.io/badge/Design%20Patterns-5-blue.svg)](#padrões-implementados)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

## 📋 Sobre o Projeto

Este projeto demonstra a implementação prática de **5 Padrões de Projeto (Design Patterns)** fundamentais em Java puro, aplicados em um sistema de e-commerce funcional. O objetivo é mostrar como esses padrões resolvem problemas reais de design de software, promovendo código mais limpo, flexível e maintível.

## 🎯 Padrões Implementados

### 1. 🔐 **Singleton Pattern**
**Classe:** `ConfigurationManager`

**Propósito:** Garantir que apenas uma instância da classe exista em toda a aplicação.

**Uso no projeto:** Gerencia configurações globais do sistema de forma centralizada.

```java
ConfigurationManager config = ConfigurationManager.getInstance();
System.out.println(config.getAppInfo());
```

**Características:**
- Thread-safe com double-checked locking
- Lazy initialization
- Controle global de configurações

---

### 2. 🏭 **Factory Method Pattern**
**Classes:** `ProductFactory`, `Product`, `Electronics`, `Clothing`, `Books`

**Propósito:** Criar objetos sem especificar suas classes concretas.

**Uso no projeto:** Criação dinâmica de diferentes tipos de produtos.

```java
Product laptop = ProductFactory.createProduct("electronics", "MacBook Pro", 2499.99);
Product shirt = ProductFactory.createProduct("clothing", "Camisa Polo", 59.99);
```

**Vantagens:**
- Desacoplamento da lógica de criação
- Facilita adição de novos tipos de produtos
- Centraliza a lógica de instanciação

---

### 3. 💰 **Strategy Pattern**
**Classes:** `DiscountStrategy`, `NoDiscount`, `PercentageDiscount`, `FixedAmountDiscount`

**Propósito:** Definir família de algoritmos e torná-los intercambiáveis.

**Uso no projeto:** Diferentes estratégias de aplicação de descontos.

```java
DiscountStrategy discount = new PercentageDiscount(15);
double discountAmount = discount.calculateDiscount(100.0); // $15.00
```

**Benefícios:**
- Algoritmos intercambiáveis em runtime
- Facilita teste e manutenção
- Extensível para novas estratégias

---

### 4. 👀 **Observer Pattern**
**Classes:** `OrderObserver`, `EmailNotificationService`, `InventoryService`, `LoggingService`

**Propósito:** Notificar múltiplos objetos sobre mudanças de estado.

**Uso no projeto:** Sistema de notificações para eventos de pedidos.

```java
order.addObserver(new EmailNotificationService());
order.addObserver(new InventoryService());
order.processOrder(); // Notifica todos os observadores
```

**Características:**
- Baixo acoplamento entre publisher e subscribers
- Extensível para novos tipos de notificações
- Padrão fundamental em sistemas orientados a eventos

---

### 5. 🔨 **Builder Pattern**
**Classe:** `Order.Builder`

**Propósito:** Construir objetos complexos passo a passo.

**Uso no projeto:** Criação flexível e validada de pedidos.

```java
Order order = new Order.Builder()
    .setId("ORD-001")
    .setCustomerName("João Silva")
    .addProduct(laptop)
    .setDiscountStrategy(new PercentageDiscount(10))
    .setExpressShipping(true)
    .build();
```

**Vantagens:**
- Interface fluente e legível
- Validação durante a construção
- Flexibilidade para objetos complexos

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos para execução

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/ecommerce-design-patterns.git
cd ecommerce-design-patterns
```

2. **Compile o código**
```bash
javac ECommerceSystem.java
```

3. **Execute o programa**
```bash
java ECommerceSystem
```

### Saída Esperada

```
============================================================
🏪 E-Commerce System v1.0.0 (development)
============================================================

📦 CRIANDO PRODUTOS (Factory Pattern):
📱 MacBook Pro - $2499.99 (Electronics)
👕 Jeans Premium - $89.99 (Clothing)
📚 Design Patterns - $49.99 (Books)

💳 ESTRATÉGIAS DE DESCONTO (Strategy Pattern):
Valor teste: $100.0
Sem desconto = $0.0
15.0% de desconto = $15.0
$50.0 de desconto fixo = $50.0

🛍️ CRIANDO PEDIDO (Builder Pattern):

👀 ADICIONANDO OBSERVADORES (Observer Pattern):

🛒 PROCESSANDO PEDIDO #ORD-001
Cliente: João Silva (joao@email.com)
Endereço: Rua das Flores, 123 - São Paulo, SP
Entrega: Expressa

Produtos:
📱 MacBook Pro - $2499.99 (Electronics)
👕 Jeans Premium - $89.99 (Clothing)
📚 Design Patterns - $49.99 (Books)

💰 RESUMO FINANCEIRO:
Subtotal: $2639.97
Desconto (10.0% de desconto): -$263.99
Frete: $15.00
TOTAL: $2390.98

📧 Email enviado: ORDER_PLACED para pedido #ORD-001
📦 Estoque atualizado para produtos do pedido #ORD-001
📝 Log: ORDER_PLACED - Pedido #ORD-001 - Total: $2390.98
📧 Email enviado: ORDER_PROCESSED para pedido #ORD-001
📦 Estoque atualizado para produtos do pedido #ORD-001
📝 Log: ORDER_PROCESSED - Pedido #ORD-001 - Total: $2390.98

============================================================
✅ DEMONSTRAÇÃO DE PADRÕES CONCLUÍDA!
Padrões implementados:
• Singleton - ConfigurationManager
• Factory Method - ProductFactory
• Strategy - DiscountStrategy
• Observer - OrderObserver
• Builder - Order.Builder
============================================================
```

## 📚 Estrutura do Projeto

```
ecommerce-design-patterns/
│
├── README.md
├── ECommerceSystem.java
│
├── patterns/
│   ├── singleton/
│   │   └── ConfigurationManager.java
│   ├── factory/
│   │   ├── Product.java
│   │   ├── ProductFactory.java
│   │   └── products/
│   │       ├── Electronics.java
│   │       ├── Clothing.java
│   │       └── Books.java
│   ├── strategy/
│   │   ├── DiscountStrategy.java
│   │   └── strategies/
│   │       ├── NoDiscount.java
│   │       ├── PercentageDiscount.java
│   │       └── FixedAmountDiscount.java
│   ├── observer/
│   │   ├── OrderObserver.java
│   │   └── observers/
│   │       ├── EmailNotificationService.java
│   │       ├── InventoryService.java
│   │       └── LoggingService.java
│   └── builder/
│       └── Order.java
│
└── docs/
    ├── UML-Diagrams.md
    └── Pattern-Explanations.md
```

## 🎓 Conceitos Aprendidos

### Princípios SOLID Aplicados
- **S**ingle Responsibility Principle: Cada classe tem uma responsabilidade específica
- **O**pen/Closed Principle: Classes abertas para extensão, fechadas para modificação
- **L**iskov Substitution Principle: Subtipos podem substituir tipos base
- **I**nterface Segregation Principle: Interfaces específicas são melhores que genéricas
- **D**ependency Inversion Principle: Dependa de abstrações, não de concretudes

### Benefícios dos Design Patterns
- ✅ **Reusabilidade:** Soluções testadas e comprovadas
- ✅ **Manutenibilidade:** Código mais fácil de entender e modificar
- ✅ **Flexibilidade:** Adaptação fácil a mudanças de requisitos
- ✅ **Comunicação:** Vocabulário comum entre desenvolvedores
- ✅ **Qualidade:** Redução de bugs e problemas de design

## 🔄 Extensões Possíveis

### Novos Padrões para Implementar
- **Decorator:** Para adicionar funcionalidades aos produtos
- **Command:** Para operações de pedidos (cancelar, modificar)
- **State:** Para estados do pedido (pendente, processando, entregue)
- **Template Method:** Para diferentes fluxos de processamento
- **Facade:** Para simplificar interações complexas
- **Chain of Responsibility:** Para validações em cadeia

### Melhorias no Sistema
- Persistência de dados (Repository Pattern)
- Sistema de pagamento (Strategy + State)
- Carrinho de compras (Composite Pattern)
- Sistema de logging avançado (Observer + Command)
- Cache inteligente (Proxy Pattern)

## 📖 Recursos de Estudo

### Livros Recomendados
- **"Design Patterns: Elements of Reusable Object-Oriented Software"** - GoF
- **"Head First Design Patterns"** - Eric Freeman & Elisabeth Robson
- **"Refactoring: Improving the Design of Existing Code"** - Martin Fowler

### Links Úteis
- [Design Patterns no GitHub](https://github.com/search?q=java+design+patterns)
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [SourceMaking - Design Patterns](https://sourcemaking.com/design_patterns)
- [Java Design Patterns Examples](https://github.com/iluwatar/java-design-patterns)

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

### Como Contribuir
- 🐛 Reportar bugs
- 💡 Sugerir melhorias
- 📝 Melhorar documentação
- 🔧 Implementar novos padrões
- ✅ Adicionar testes unitários

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 🙏 Agradecimentos

- **Digital Innovation One** pelo desafio inspirador
- **Gang of Four** pelos padrões fundamentais
- **Comunidade Java** pelas boas práticas
- **Todos os contribuidores** deste projeto

---

⭐ **Se este projeto te ajudou, não esqueça de dar uma estrela no repositório!** ⭐

