import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("🚀 === DESAFIO POO DIO - SISTEMA DE BOOTCAMP === 🚀\n");

        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Aprenda os fundamentos do Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Avançado");
        curso2.setDescricao("Conceitos avançados de Java e Spring Boot");
        curso2.setCargaHoraria(12);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tirando dúvidas sobre POO");
        mentoria.setData(LocalDate.now());

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando devs
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        // Demonstrando o sistema
        System.out.println("📚 Conteúdos do Bootcamp:");
        bootcamp.getConteudos().forEach(System.out::println);

        System.out.println("\n" + devCamila.obterEstatisticas());

        System.out.println("\n⏩ Camila progredindo...");
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("\n" + devCamila.obterEstatisticas());

        System.out.println("\n" + devJoao.obterEstatisticas());

        System.out.println("\n⏩ João progredindo...");
        devJoao.progredir();

        System.out.println("\n" + devJoao.obterEstatisticas());

        System.out.println("\n🎯 === DEMONSTRAÇÃO DOS 4 PILARES DA POO === 🎯");
        System.out.println("✅ ABSTRAÇÃO: Classe abstrata Conteudo define estrutura comum");
        System.out.println("✅ ENCAPSULAMENTO: Atributos privados/protected com getters/setters");
        System.out.println("✅ HERANÇA: Curso e Mentoria herdam de Conteudo");
        System.out.println("✅ POLIMORFISMO: Método calcularXp() implementado diferente em cada classe");

        // Demonstrando polimorfismo
        System.out.println("\n🔄 Demonstração de Polimorfismo:");
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            System.out.printf("XP do %s: %.1f%n",
                conteudo.getClass().getSimpleName(),
                conteudo.calcularXp());
        }
    }
}
