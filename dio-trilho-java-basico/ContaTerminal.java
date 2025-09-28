import java.util.Scanner;

/**
 * Classe principal do programa que simula a criação de uma conta bancária.
 * O programa solicita informações do usuário, como número da conta, agência,
 * nome do cliente e saldo inicial, e exibe uma mensagem de confirmação com os dados fornecidos.
 */
public class ContaTerminal {

    /**
     * Função principal que inicia a execução do programa.
     *
     * <p>O programa realiza as seguintes etapas:</p>
     * <ul>
     * <li>Solicita ao usuário os dados da conta bancária.</li>
     * <li>Exibe uma mensagem de confirmação com os dados fornecidos.</li>
     * </ul>
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis conforme especificado
        int numero; // Número da conta bancária
        String agencia; // Número da agência bancária
        String nomeCliente; // Nome completo do cliente
        double saldo; // Saldo inicial da conta

        // Exibindo cabeçalho do programa
        System.out.println("═══════════════════════════════════════");
        System.out.println("🏦  SISTEMA BANCÁRIO - CRIAÇÃO DE CONTA");
        System.out.println("═══════════════════════════════════════");
        System.out.println();

        // Solicitando dados do usuário
        System.out.print("📋 Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        // Consumir a quebra de linha deixada pelo nextInt()
        scanner.nextLine();

        System.out.print("🏢 Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("👤 Por favor, digite o nome completo do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("💰 Por favor, digite o saldo inicial: R$ ");
        saldo = scanner.nextDouble();

        // Exibindo linha separadora
        System.out.println();
        System.out.println("═══════════════════════════════════════");
        System.out.println("✅  CONTA CRIADA COM SUCESSO!");
        System.out.println("═══════════════════════════════════════");
        System.out.println();

        // Exibindo a mensagem final concatenada
        String mensagemFinal = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo R$ ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque.");

        System.out.println("📄 " + mensagemFinal);

        System.out.println();
        System.out.println("═══════════════════════════════════════");
        System.out.println("🎉 Bem-vindo ao nosso banco!");
        System.out.println("═══════════════════════════════════════");

        // Fechando o Scanner
        scanner.close();
    }
}
