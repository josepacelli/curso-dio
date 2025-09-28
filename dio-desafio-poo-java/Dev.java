import java.util.*;

public class Dev {

    private String nome;

    // ENCAPSULAMENTO: LinkedHashSet mantém ordem de inserção e evita duplicatas
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Construtor
    public Dev() {
    }

    public Dev(String nome) {
        this.nome = nome;
    }

    // Método para se inscrever em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do bootcamp aos conteúdos inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Adiciona o dev aos inscritos do bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    // Método para progredir nos estudos
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    // Método para calcular total de XP
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        // Alternativa usando Stream API (mais moderno):
        // return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    // Método para obter estatísticas do dev
    public String obterEstatisticas() {
        return String.format(
            "Dev: %s\n" +
            "Conteúdos Inscritos: %d\n" +
            "Conteúdos Concluídos: %d\n" +
            "XP Total: %.1f",
            this.nome,
            this.conteudosInscritos.size(),
            this.conteudosConcluidos.size(),
            this.calcularTotalXp()
        );
    }

    // ENCAPSULAMENTO: Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
               Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
               Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
