// ============================= CLASSE ABSTRATA CONTEUDO =============================
import java.time.LocalDate;

// ABSTRAÇÃO: Classe abstrata que define o "molde" comum para Curso e Mentoria
public abstract class Conteudo {

    // ENCAPSULAMENTO: Atributos protegidos (protected) - acessíveis por herança
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;

    // Método abstrato - força implementação nas classes filhas (POLIMORFISMO)
    public abstract double calcularXp();

    // ENCAPSULAMENTO: Métodos getters e setters para acesso controlado aos atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

// ============================= CLASSE CURSO =============================
// HERANÇA: Curso herda de Conteudo


// ============================= CLASSE MENTORIA =============================


// ============================= CLASSE BOOTCAMP =============================

// ============================= CLASSE DEV =============================

// ============================= CLASSE MAIN PARA DEMONSTRAÇÃO =============================
