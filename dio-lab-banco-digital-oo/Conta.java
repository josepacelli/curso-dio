/**
 * Classe abstrata que representa uma conta no sistema bancário digital.
 * <p>
 * Esta classe define os atributos e funções comuns a todas as contas, como agência, número, saldo e cliente.
 * Também implementa as funções básicas de saque, depósito e transferência, além de fornecer getters para os atributos.
 * </p>
 */
abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1; // Código padrão da agência
    private static int SEQUENCIAL = 1; // Sequencial para geração de números de conta

    protected int agencia; // Agência da conta
    protected int numero; // Número da conta
    protected double saldo; // Saldo da conta
    protected Cliente cliente; // Cliente associado à conta

    /**
     * Construtor da classe Conta.
     * <p>
     * Inicializa uma conta com a agência padrão, um número sequencial e associa um cliente.
     * </p>
     *
     * @param cliente Objeto da classe Cliente associado à conta.
     */
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    /**
     * Realiza um saque na conta.
     * <p>
     * Deduz o valor informado do saldo da conta, caso o saldo seja suficiente e o valor seja válido.
     * Caso contrário, exibe uma mensagem de erro.
     * </p>
     *
     * @param valor Valor a ser sacado.
     */
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    /**
     * Realiza um depósito na conta.
     * <p>
     * Adiciona o valor informado ao saldo da conta, caso o valor seja positivo.
     * Caso contrário, exibe uma mensagem de erro.
     * </p>
     *
     * @param valor Valor a ser depositado.
     */
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Valor de depósito deve ser positivo!");
        }
    }

    /**
     * Realiza uma transferência para outra conta.
     * <p>
     * Deduz o valor informado do saldo da conta de origem e adiciona à conta de destino,
     * caso o saldo seja suficiente e o valor seja válido.
     * Caso contrário, exibe uma mensagem de erro.
     * </p>
     *
     * @param valor Valor a ser transferido.
     * @param contaDestino Conta de destino para a transferência.
     */
    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f realizada com sucesso!%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência!");
        }
    }

    /**
     * Imprime as informações comuns da conta.
     * <p>
     * Exibe o titular, agência, número e saldo da conta.
     * </p>
     */
    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

    /**
     * Retorna o código da agência da conta.
     *
     * @return Código da agência.
     */
    public int getAgencia() { return agencia; }

    /**
     * Retorna o número da conta.
     *
     * @return Número da conta.
     */
    public int getNumero() { return numero; }

    /**
     * Retorna o saldo da conta.
     *
     * @return Saldo da conta.
     */
    public double getSaldo() { return saldo; }

    /**
     * Retorna o cliente associado à conta.
     *
     * @return Cliente associado.
     */
    public Cliente getCliente() { return cliente; }
}
