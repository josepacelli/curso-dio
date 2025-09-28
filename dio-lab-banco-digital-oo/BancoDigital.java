/**
 * Classe principal para demonstração do sistema bancário digital.
 * <p>
 * Esta classe cria um banco, clientes, contas e demonstra as funcionalidades
 * do sistema bancário, como depósitos, saques, transferências, aplicação de
 * rendimentos e cobrança de tarifas.
 * </p>
 */
public class BancoDigital {

    /**
     * Função principal que executa a demonstração do sistema bancário.
     * <p>
     * Cria um banco, clientes, contas e realiza operações bancárias para
     * demonstrar as funcionalidades do sistema.
     * </p>
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital POO");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "(11) 99999-1111");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00", "(11) 99999-2222");

        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);

        // Adicionando contas ao banco
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Demonstrando funcionalidades
        System.out.println("=== DEMONSTRAÇÃO DO SISTEMA BANCÁRIO ===\n");

        // Depósitos
        System.out.println("--- DEPÓSITOS ---");
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(2000);

        // Extratos
        System.out.println("\n--- EXTRATOS APÓS DEPÓSITOS ---");
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Saques
        System.out.println("\n--- SAQUES ---");
        contaCorrente.sacar(1200); // Teste com cheque especial
        contaPoupanca.sacar(500);

        // Transferência
        System.out.println("\n--- TRANSFERÊNCIA ---");
        contaPoupanca.transferir(300, contaCorrente);

        // Funcionalidades específicas
        System.out.println("\n--- FUNCIONALIDADES ESPECÍFICAS ---");
        contaPoupanca.aplicarRendimento();
        contaCorrente.cobrarTarifaMensal();

        // Extratos finais
        System.out.println("\n--- EXTRATOS FINAIS ---");
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Lista de contas do banco
        banco.listarContas();

        // Demonstrando polimorfismo
        System.out.println("\n--- DEMONSTRAÇÃO DE POLIMORFISMO ---");
        IConta conta1 = new ContaCorrente(new Cliente("Pedro", "111.222.333-44"));
        IConta conta2 = new ContaPoupanca(new Cliente("Ana", "555.666.777-88"));

        banco.adicionarConta((Conta) conta1);
        banco.adicionarConta((Conta) conta2);

        // Usando polimorfismo - mesmo procedimento, comportamentos diferentes
        conta1.depositar(500);
        conta2.depositar(500);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        System.out.println("\n=== FIM DA DEMONSTRAÇÃO ===");
    }
}
