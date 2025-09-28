/**
 * Classe que representa um banco no sistema bancário digital.
 * <p>
 * Esta classe gerencia as contas associadas ao banco, permitindo adicionar novas contas,
 * listar todas as contas e buscar uma conta específica pelo número.
 * </p>
 */
class Banco {
    private String nome; // Nome do banco
    private java.util.List<Conta> contas; // Lista de contas associadas ao banco

    /**
     * Construtor da classe Banco.
     * <p>
     * Inicializa o banco com um nome e uma lista vazia de contas.
     * </p>
     *
     * @param nome Nome do banco.
     */
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new java.util.ArrayList<>();
    }

    /**
     * Adiciona uma nova conta ao banco.
     * <p>
     * A conta é adicionada à lista de contas do banco e uma mensagem de confirmação
     * é exibida com o número da conta e o nome do titular.
     * </p>
     *
     * @param conta Objeto da classe Conta a ser adicionado ao banco.
     */
    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.printf("Conta %d criada para %s%n", conta.getNumero(), conta.getCliente().getNome());
    }

    /**
     * Lista todas as contas associadas ao banco.
     * <p>
     * Exibe no console as informações de cada conta, incluindo o tipo da conta,
     * número, titular e saldo.
     * </p>
     */
    public void listarContas() {
        System.out.println("\n=== Lista de Contas do " + nome + " ===");
        for (Conta conta : contas) {
            String tipoConta = conta instanceof ContaCorrente ? "Corrente" : "Poupança";
            System.out.printf("Conta %s - Número: %d - Titular: %s - Saldo: R$ %.2f%n",
                    tipoConta, conta.getNumero(), conta.getCliente().getNome(), conta.getSaldo());
        }
        System.out.println("=====================================\n");
    }

    /**
     * Busca uma conta pelo número.
     * <p>
     * Retorna a conta correspondente ao número informado, ou null caso não seja encontrada.
     * </p>
     *
     * @param numeroConta Número da conta a ser buscada.
     * @return Objeto da classe Conta correspondente ao número informado, ou null se não encontrado.
     */
    public Conta buscarConta(int numeroConta) {
        return contas.stream()
                .filter(conta -> conta.getNumero() == numeroConta)
                .findFirst()
                .orElse(null);
    }

    /**
     * Retorna o nome do banco.
     *
     * @return Nome do banco.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna uma cópia da lista de contas do banco.
     *
     * @return Lista de contas do banco.
     */
    public java.util.List<Conta> getContas() {
        return new java.util.ArrayList<>(contas);
    }
}
