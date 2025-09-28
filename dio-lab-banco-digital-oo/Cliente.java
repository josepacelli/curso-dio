/**
 * Classe que representa um cliente no sistema bancário digital.
 * <p>
 * Esta classe armazena as informações de um cliente, como nome, CPF e telefone.
 * Permite a criação de clientes com ou sem telefone e fornece métodos para acessar
 * e modificar essas informações.
 * </p>
 */
class Cliente {
    private String nome; // Nome do cliente
    private String cpf; // CPF do cliente
    private String telefone; // Telefone do cliente

    /**
     * Construtor da classe Cliente.
     * <p>
     * Inicializa um cliente com nome e CPF, sem telefone.
     * </p>
     *
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Construtor da classe Cliente.
     * <p>
     * Inicializa um cliente com nome, CPF e telefone.
     * </p>
     *
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * @param telefone Telefone do cliente.
     */
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return Nome do cliente.
     */
    public String getNome() { return nome; }

    /**
     * Atualiza o nome do cliente.
     *
     * @param nome Novo nome do cliente.
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna o CPF do cliente.
     *
     * @return CPF do cliente.
     */
    public String getCpf() { return cpf; }

    /**
     * Atualiza o CPF do cliente.
     *
     * @param cpf Novo CPF do cliente.
     */
    public void setCpf(String cpf) { this.cpf = cpf; }

    /**
     * Retorna o telefone do cliente.
     *
     * @return Telefone do cliente.
     */
    public String getTelefone() { return telefone; }

    /**
     * Atualiza o telefone do cliente.
     *
     * @param telefone Novo telefone do cliente.
     */
    public void setTelefone(String telefone) { this.telefone = telefone; }

    /**
     * Retorna uma representação textual do cliente.
     *
     * @return Representação textual do cliente no formato 'Cliente{nome='...', cpf='...', telefone='...'}'.
     */
    @Override
    public String toString() {
        return String.format("Cliente{nome='%s', cpf='%s', telefone='%s'}", nome, cpf, telefone);
    }
}
