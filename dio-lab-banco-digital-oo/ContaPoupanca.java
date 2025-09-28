/**
 * Classe que representa uma conta poupança no sistema bancário digital.
 * <p>
 * Esta classe estende a classe Conta e adiciona funcionalidades específicas
 * para contas poupança, como a aplicação de rendimentos com base em uma taxa de rendimento.
 * </p>
 */
class ContaPoupanca extends Conta {
    private double taxaRendimento; // Taxa de rendimento da conta poupança

    /**
     * Construtor da classe ContaPoupanca.
     * <p>
     * Inicializa uma conta poupança com um cliente associado e uma taxa de rendimento padrão.
     * </p>
     *
     * @param cliente Objeto da classe Cliente associado à conta poupança.
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.taxaRendimento = 0.005; // 0.5% ao mês
    }

    /**
     * Construtor da classe ContaPoupanca.
     * <p>
     * Inicializa uma conta poupança com um cliente associado e uma taxa de rendimento personalizada.
     * </p>
     *
     * @param cliente Objeto da classe Cliente associado à conta poupança.
     * @param taxaRendimento Taxa de rendimento personalizada.
     */
    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    /**
     * Aplica o rendimento na conta poupança.
     * <p>
     * Calcula o rendimento com base no saldo atual e na taxa de rendimento,
     * adicionando o valor calculado ao saldo da conta.
     * </p>
     */
    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.printf("Rendimento de R$ %.2f aplicado. Novo saldo: R$ %.2f%n", rendimento, saldo);
    }

    /**
     * Imprime o extrato da conta poupança.
     * <p>
     * Exibe as informações comuns da conta, além da taxa de rendimento.
     * </p>
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.printf("Taxa de Rendimento: %.3f%%%n", this.taxaRendimento * 100);
        System.out.println("===============================");
    }

    /**
     * Retorna a taxa de rendimento da conta poupança.
     *
     * @return Taxa de rendimento.
     */
    public double getTaxaRendimento() { return taxaRendimento; }
}
