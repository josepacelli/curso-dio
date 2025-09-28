# Desafio Controle de Fluxo - DIO

## 📋 Descrição do Projeto

Este projeto foi desenvolvido como parte do módulo de **Controle de Fluxo** da trilha Java Básico da Digital Innovation One (DIO). O sistema recebe dois parâmetros via terminal e realiza a contagem e impressão de números incrementados com base na diferença entre eles.

## 🎯 Objetivo

Exercitar os conceitos de:
- Estruturas de controle (if/else)
- Laços de repetição (for)
- Tratamento de exceções (try/catch/throws)
- Criação de exceções customizadas
- Entrada de dados via Scanner

## 🚀 Funcionalidades

- **Entrada de dados**: Recebe dois números inteiros via terminal
- **Validação**: Verifica se o segundo parâmetro é maior que o primeiro
- **Contagem**: Calcula a diferença entre os números
- **Impressão**: Exibe os números incrementados no console
- **Tratamento de erro**: Lança exceção customizada para parâmetros inválidos

## 📁 Estrutura do Projeto

```
DesafioControleFluxo/
├── src/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
└── README.md
```

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Passos para execução

1. **Clone ou baixe o projeto**
2. **Compile as classes:**
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```

3. **Execute o programa:**
   ```bash
   java Contador
   ```

4. **Insira os parâmetros quando solicitado:**
    - Digite o primeiro número
    - Digite o segundo número

## 📝 Exemplos de Uso

### Exemplo 1 - Execução com Sucesso
```
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

### Exemplo 2 - Parâmetros Inválidos
```
Digite o primeiro parâmetro
30
Digite o segundo parâmetro
12
O segundo parâmetro deve ser maior que o primeiro
```

## 🏗️ Arquitetura do Código

### Classe `Contador`
- **Método main**: Ponto de entrada do programa, responsável pela entrada de dados e tratamento de exceções
- **Método contar**: Contém a lógica de validação, contagem e impressão dos números

### Classe `ParametrosInvalidosException`
- Exceção customizada que herda de `Exception`
- Utilizada quando o primeiro parâmetro é maior que o segundo

## 🔍 Conceitos Aplicados

- **Scanner**: Para capturar entrada do usuário
- **try/catch**: Para tratamento de exceções
- **throws**: Para declarar que um método pode lançar exceção
- **for loop**: Para iteração e impressão dos números
- **Validação de entrada**: Verificação de regras de negócio
- **Exceções customizadas**: Criação de exceções específicas do domínio

## 📚 Regras de Negócio

1. O sistema deve receber dois números inteiros
2. O segundo parâmetro deve ser **maior** que o primeiro
3. A quantidade de iterações é calculada pela diferença: `parametroDois - parametroUm`
4. Se a regra não for atendida, deve ser lançada a exceção `ParametrosInvalidosException`
5. Os números devem ser impressos de forma incremental (1, 2, 3, ...)

## 👨‍💻 Autor

**Desenvolvido por**: [Seu Nome]  
**Curso**: DIO - Trilha Java Básico  
**Instrutor**: Gleyson Sampaio

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais como parte do curso da Digital Innovation One.

---

⭐ **Gostou do projeto?** Deixe uma estrela no repositório!
