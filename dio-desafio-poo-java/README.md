# 🚀 Desafio POO DIO - Sistema de Bootcamp

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## 📖 Sobre o Projeto

Este projeto é uma implementação completa do **Desafio de Programação Orientada a Objetos** da [Digital Innovation One](https://web.digitalinnovation.one/). O objetivo principal é demonstrar na prática os **4 pilares fundamentais da POO**: **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**.

> 💎 **Objetivo:** Criar um sistema de gerenciamento de bootcamps que modela o domínio real da plataforma DIO, aplicando todos os conceitos de orientação a objetos.

## 🎯 Conceitos Demonstrados

### 🔺 **ABSTRAÇÃO**
- Modelagem do domínio "Bootcamp" com suas entidades essenciais
- Classe abstrata `Conteudo` que define a estrutura comum
- Foco nos aspectos essenciais, ignorando detalhes menos importantes

### 🔺 **ENCAPSULAMENTO**
- Atributos privados e protected com acesso controlado
- Métodos getters e setters para manipulação segura dos dados
- Ocultação da implementação interna das classes

### 🔺 **HERANÇA**
- `Curso` e `Mentoria` herdam de `Conteudo`
- Reutilização de código e extensão de funcionalidades
- Relação "é um" claramente estabelecida

### 🔺 **POLIMORFISMO**
- Implementação específica do método `calcularXp()` em cada classe filha
- Tratamento uniforme de objetos de tipos diferentes
- Flexibilidade para futuras extensões

## 🏗️ Estrutura do Projeto

```
src/
├── Conteudo.java          # Classe abstrata base
├── Curso.java             # Implementação específica para cursos
├── Mentoria.java          # Implementação específica para mentorias
├── Bootcamp.java          # Gerenciamento de bootcamps
├── Dev.java               # Representação dos desenvolvedores
└── Main.java              # Demonstração do sistema
```

## 🔧 Pré-Requisitos

- ✅ **Java JDK 11** ou superior
- ✅ **IDE** para desenvolvimento Java (IntelliJ IDEA, Eclipse, VSCode)
- ✅ **Git** para versionamento
- ✅ Conhecimento básico da **sintaxe Java**

## 🚀 Como Executar

### 1️⃣ Clone o repositório
```bash
git clone https://github.com/seu-usuario/desafio-poo-dio.git
cd desafio-poo-dio
```

### 2️⃣ Compile o projeto
```bash
javac *.java
```

### 3️⃣ Execute a aplicação
```bash
java Main
```

### 4️⃣ Observe a saída
```
🚀 === DESAFIO POO DIO - SISTEMA DE BOOTCAMP === 🚀

📚 Conteúdos do Bootcamp:
Curso{titulo='Curso Java Básico', descricao='Aprenda os fundamentos do Java', cargaHoraria=8}
Curso{titulo='Curso Java Avançado', descricao='Conceitos avançados de Java e Spring Boot', cargaHoraria=12}
Mentoria{titulo='Mentoria de Java', descricao='Tirando dúvidas sobre POO', data=2025-09-28}

Dev: Camila
Conteúdos Inscritos: 3
Conteúdos Concluídos: 0
XP Total: 0.0

⏩ Camila progredindo...

Dev: Camila
Conteúdos Inscritos: 1
Conteúdos Concluídos: 2
XP Total: 200.0
```

## 📋 Funcionalidades

### ✨ **Sistema de Bootcamp**
- Criação e gerenciamento de bootcamps
- Adição de cursos e mentorias
- Controle de data de início e fim (45 dias)

### 👨‍💻 **Gerenciamento de Desenvolvedores**
- Inscrição em bootcamps
- Progressão através dos conteúdos
- Cálculo automático de XP
- Estatísticas detalhadas

### 📊 **Sistema de XP**
- **Cursos:** XP = 10 × carga horária
- **Mentorias:** XP = 30 (fixo, mais valorizado)
- Acompanhamento do progresso individual

### 🛡️ **Controles de Integridade**
- Uso de `Set` para evitar conteúdos duplicados
- Validações para progressão ordenada
- Tratamento de casos excepcionais

## 🎨 Possíveis Melhorias e Extensões

### 🔮 **Próximas Funcionalidades**
- [ ] Sistema de certificados digitais
- [ ] Diferentes tipos de conteúdo (workshops, projetos práticos)
- [ ] Sistema de badges e conquistas
- [ ] Ranking global de desenvolvedores
- [ ] Avaliações e feedbacks
- [ ] Sistema de pré-requisitos entre conteúdos

### 🏗️ **Melhorias Técnicas**
- [ ] Integração com banco de dados (JPA/Hibernate)
- [ ] API REST com Spring Boot
- [ ] Testes unitários com JUnit
- [ ] Documentação com JavaDoc
- [ ] Padrões de design (Strategy, Observer)
- [ ] Logs com SLF4J

### 🎯 **Recursos Avançados**
- [ ] Notificações por email
- [ ] Dashboard web interativo
- [ ] Integração com GitHub para projetos
- [ ] Sistema de mentoria ao vivo
- [ ] Gamificação avançada

## 📚 Conceitos de POO Aprofundados

### 🧠 **Abstração na Prática**
```java
// Focamos apenas no essencial: todo conteúdo tem título, descrição e XP
public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    public abstract double calcularXp(); // Comportamento específico para cada tipo
}
```

### 🔒 **Encapsulamento Efetivo**
```java
public class Dev {
    private Set<Conteudo> conteudosInscritos; // Dados protegidos
    
    public void progredir() { // Comportamento controlado
        // Lógica interna protegida da manipulação externa
    }
}
```

### 👨‍👩‍👧‍👦 **Herança Bem Estruturada**
```java
public class Curso extends Conteudo {
    private int cargaHoraria; // Atributo específico
    
    @Override
    public double calcularXp() { // Comportamento especializado
        return XP_PADRAO * cargaHoraria;
    }
}
```

### 🎭 **Polimorfismo em Ação**
```java
// Mesmo método, comportamentos diferentes
for (Conteudo conteudo : bootcamp.getConteudos()) {
    double xp = conteudo.calcularXp(); // Polimórfico!
    // Curso calcula baseado em horas, Mentoria é valor fixo
}
```

## 🤝 Contribuições

Este é um projeto educacional, então **contribuições são muito bem-vindas**!

### 📋 **Como Contribuir:**
1. Faça um **fork** do projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/nova-funcionalidade`)
3. **Commit** suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`)
4. Faça **push** para a branch (`git push origin feature/nova-funcionalidade`)
5. Abra um **Pull Request**

### 🐛 **Encontrou um Bug?**
- Abra uma [issue](../../issues) descrevendo o problema
- Inclua informações sobre como reproduzir
- Sugira uma possível solução, se tiver

### 💡 **Ideias e Sugestões**
- Compartilhe suas ideias nas [discussions](../../discussions)
- Proponha novas funcionalidades
- Discuta melhorias arquiteturais

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Seu Nome Aqui**
- GitHub: [@seu-usuario](https://github.com/seu-usuario)
- LinkedIn: [Seu Perfil](https://linkedin.com/in/seu-perfil)
- Email: seu.email@exemplo.com

## 🙏 Agradecimentos

- **[Camila Cavalcante](https://www.linkedin.com/in/cami-la/)** - Criadora original do desafio
- **[Digital Innovation One](https://web.digitalinnovation.one/)** - Plataforma educacional incrível
- **Comunidade Java** - Por todo o apoio e conhecimento compartilhado

---

## 📚 Referências e Links Úteis

- [Repositório Original do Desafio](https://github.com/cami-la/desafio-poo-dio)
- [Documentação Java](https://docs.oracle.com/javase/11/)
- [POO em Java - Oracle](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Digital Innovation One](https://web.digitalinnovation.one/)

---

### 🎯 **Objetivos de Aprendizado Alcançados:**
- ✅ Modelagem de domínio com abstração
- ✅ Aplicação prática dos 4 pilares da POO
- ✅ Uso de collections do Java
- ✅ Implementação de métodos equals() e hashCode()
- ✅ Tratamento de casos excepcionais
- ✅ Código limpo e bem estruturado

---

**⭐ Se este projeto te ajudou, deixe uma estrela! Isso nos motiva a continuar criando conteúdo educacional de qualidade!**
