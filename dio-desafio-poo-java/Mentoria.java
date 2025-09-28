import java.time.LocalDate;

// HERANÇA: Mentoria herda de Conteudo
public class Mentoria extends Conteudo {

    private LocalDate data;

    // Construtor
    public Mentoria() {
    }

    // POLIMORFISMO: Implementação específica do método abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // Mentoria vale mais XP
    }

    // ENCAPSULAMENTO: Getters e setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
