public class Curso extends Conteudo {

    private int cargaHoraria;

    // Construtor
    public Curso() {
    }

    // POLIMORFISMO: Implementação específica do método abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // ENCAPSULAMENTO: Getters e setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
