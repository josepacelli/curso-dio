import java.util.Scanner;

/**
 * <p>Classe principal do desafio Controle de Fluxo</p>
 * <p>Sistema que recebe dois parâmetros e realiza contagem incrementada</p>
 *
 * @author DIO - Trilha Java Básico
 */
public class Contador {

    /**
     * <p>Função principal - ponto de entrada do programa</p>
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // Exibição de mensagem inicial do programa
        System.out.println("=== DESAFIO CONTROLE DE FLUXO - DIO ===");
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Leitura do primeiro parâmetro

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Leitura do segundo parâmetro

        try {
            // Chamando a função contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Captura e exibe a mensagem da exceção customizada
            System.err.println("ERRO: " + exception.getMessage());

        } finally {
            // Fecha o scanner para liberar recursos
            terminal.close();
            System.out.println("\nPrograma finalizado!");
        }
    }

    /**
     * <p>Função responsável por validar os parâmetros e realizar a contagem</p>
     *
     * @param parametroUm primeiro número digitado
     * @param parametroDois segundo número digitado
     * @throws ParametrosInvalidosException quando o primeiro parâmetro for maior que o segundo
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é maior que parametroDois e lança a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de iterações
        int contagem = parametroDois - parametroUm;

        // Exibe informações iniciais da contagem
        System.out.println("\nIniciando contagem de " + parametroUm + " até " + parametroDois + ":");
        System.out.println("Total de iterações: " + contagem);
        System.out.println("----------------------------------------");

        // Realiza a contagem e imprime os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        // Exibe mensagem de finalização da contagem
        System.out.println("----------------------------------------");
        System.out.println("Contagem finalizada com sucesso!");
    }
}
