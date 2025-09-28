/**
 * Classe que representa uma conta corrente no sistema bancário digital.
 * <p>
 * Esta classe estende a classe Conta e adiciona funcionalidades específicas
 * para contas correntes, como limite de cheque especial e cobrança de tarifa mensal.
 * </p>
 */
class ContaCorrente extends Conta {
    private double limiteChequeEspecial; // Limite do cheque especial
    private double tarifaMensal; // Valor da tarifa mensal

    /**
     * Construtor da classe ContaCorrente.
     * <p>
     * Inicializa uma conta corrente com um cliente associado, limite de cheque especial padrão
     * e tarifa mensal padrão.
     * </p>
     *
     * @param cliente Objeto da classe Cliente associado à conta corrente.
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limiteChequeEspecial = 500.0; // Limite padrão
        this.tarifaMensal = 10.0; // Tarifa padrão
    }

    /**
     * Construtor da classe ContaCorrente.
     * <p>
     * Inicializa uma conta corrente com um cliente associado, limite de cheque especial personalizado
     * e tarifa mensal padrão.
     * </p>
     *
     * @param cliente Objeto da classe Cliente associado à conta corrente.
     * @param limiteChequeEspecial Valor do limite de cheque especial.
     */
    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.tarifaMensal = 10.0;
    }

    /**
     * Realiza um saque na conta corrente.
     * <p>
     * Deduz o valor informado do saldo da conta, considerando o limite de cheque especial.
     * Caso o saldo disponível seja insuficiente ou o valor seja inválido, exibe uma mensagem de erro.
     * </p>
     *
     * @param valor Valor a ser sacado.
     */
    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        if (valor > 0 && valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
            if (saldo < 0) {
                System.out.printf("Atenção: Você está utilizando o cheque especial. Saldo atual: R$ %.2f%n", saldo);
            }
        } else {
            System.out.println("Saldo insuficiente (incluindo limite) ou valor inválido!");
        }
    }

    /**
     * Cobra a tarifa mensal da conta corrente.
     * <p>
     * Deduz o valor da tarifa mensal do saldo da conta.
     * </p>
     */
    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.printf("Tarifa mensal de R$ %.2f cobrada.%n", tarifaMensal);
    }

    /**
     * Imprime o extrato da conta corrente.
     * <p>
     * Exibe as informações comuns da conta, além do limite de cheque especial e da tarifa mensal.
     * </p>
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.printf("Limite Cheque Especial: R$ %.2f%n", this.limiteChequeEspecial);
        System.out.printf("Tarifa Mensal: R$ %.2f%n", this.tarifaMensal);
        System.out.println("===============================");
    }

    /**
     * Retorna o limite de cheque especial da conta corrente.
     *
     * @return Valor do limite de cheque especial.
     */
    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }

    /**
     * Retorna o valor da tarifa mensal da conta corrente.
     *
     * @return Valor da tarifa mensal.
     */
    public double getTarifaMensal() { return tarifaMensal; }
}
