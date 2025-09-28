/**
 * <p>Exceção customizada para validação de parâmetros inválidos</p>
 * <p>Lançada quando o primeiro parâmetro é maior que o segundo</p>
 *
 * @author DIO - Trilha Java Básico
 * @author pacelli
 */
public class ParametrosInvalidosException extends Exception {

    /**
     * <p>Construtor da exceção customizada</p>
     * <p>Recebe uma mensagem de erro que será exibida ao lançar a exceção</p>
     *
     * @param message Mensagem de erro a ser exibida
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
