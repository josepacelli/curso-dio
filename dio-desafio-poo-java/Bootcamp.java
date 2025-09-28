import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    // ENCAPSULAMENTO: Uso de Set para evitar conteúdos duplicados
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new LinkedHashSet<>();

    // Construtor
    public Bootcamp() {
    }

    // ENCAPSULAMENTO: Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    // Métodos utilitários
    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
               Objects.equals(descricao, bootcamp.descricao) &&
               Objects.equals(dataInicial, bootcamp.dataInicial) &&
               Objects.equals(dataFinal, bootcamp.dataFinal) &&
               Objects.equals(conteudos, bootcamp.conteudos) &&
               Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, conteudos, devsInscritos);
    }
}
