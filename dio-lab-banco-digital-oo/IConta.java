/**
 * Interface que define as operações básicas de uma conta no sistema bancário digital.
 * <p>
 * Esta interface estabelece as funções que devem ser implementadas por qualquer classe
 * que represente uma conta, garantindo a padronização das operações de saque, depósito,
 * transferência e impressão de extrato.
 * </p>
 */
interface IConta {

    /**
     * Realiza um saque na conta.
     * <p>
     * Deduz o valor informado do saldo da conta, caso o saldo seja suficiente e o valor seja válido.
     * </p>
     *
     * @param valor Valor a ser sacado.
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     * <p>
     * Adiciona o valor informado ao saldo da conta, caso o valor seja positivo.
     * </p>
     *
     * @param valor Valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência para outra conta.
     * <p>
     * Deduz o valor informado do saldo da conta de origem e adiciona à conta de destino,
     * caso o saldo seja suficiente e o valor seja válido.
     * </p>
     *
     * @param valor Valor a ser transferido.
     * @param contaDestino Conta de destino para a transferência.
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta.
     * <p>
     * Exibe as informações detalhadas da conta, como saldo, titular e outras informações relevantes.
     * </p>
     */
    void imprimirExtrato();
}
