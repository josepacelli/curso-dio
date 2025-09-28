# 🏦 ContaBanco - Sistema de Criação de Conta Bancária

## 📋 Sobre o Projeto

**DIO - Trilha Java Básico**  
Desafio do módulo de Sintaxe Java para exercitar conceitos fundamentais da linguagem.

### 👨‍💻 Autores
* **Gleyson Sampaio** - Instrutor DIO
* **Pacelli** - Implementação do código

---

## 🎯 Objetivo

Desenvolver uma aplicação Java que simule a criação de uma conta bancária, coletando dados do usuário via terminal e exibindo uma mensagem personalizada de confirmação.

---

## 📊 Estrutura de Dados

A aplicação trabalha com os seguintes atributos:

| **Atributo** | **Tipo** | **Exemplo** |
|-------------|----------|-------------|
| Numero | Integer | 1021 |
| Agencia | String | "067-8" |
| Nome Cliente | String | "MARIO ANDRADE" |
| Saldo | Double | 237.48 |

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java** - Linguagem de programação
- 📟 **Scanner** - Para captura de dados via terminal
- 🔤 **String.concat()** - Para concatenação de strings
- 💻 **Terminal/Console** - Interface de interação

---

## 📝 Funcionalidades

### ✅ Entrada de Dados
- 📋 Número da conta
- 🏢 Número da agência
- 👤 Nome completo do cliente
- 💰 Saldo inicial

### ✅ Validação e Processamento
- 🔍 Captura dados via terminal
- ⚙️ Processa informações inseridas
- 🔗 Concatena strings usando método `.concat()`

### ✅ Saída Formatada
- 🎨 Interface visual com ícones
- 📄 Mensagem personalizada de confirmação
- 💫 Formatação de valores monetários

---

## 🚀 Como Executar

### Pré-requisitos
- ☕ Java JDK 8 ou superior instalado
- 💻 Terminal/Prompt de comando

### Passos para execução:

1. **Clone ou baixe o arquivo** `ContaTerminal.java`

2. **Compile o programa:**
   ```bash
   javac ContaTerminal.java
   ```

3. **Execute o programa:**
   ```bash
   java ContaTerminal
   ```

4. **Siga as instruções no terminal:**
    - Digite o número da conta
    - Digite o número da agência
    - Digite o nome completo
    - Digite o saldo inicial

---

## 📖 Exemplo de Execução

```
═══════════════════════════════════════
🏦  SISTEMA BANCÁRIO - CRIAÇÃO DE CONTA
═══════════════════════════════════════

📋 Por favor, digite o número da Conta: 1021
🏢 Por favor, digite o número da Agência: 067-8
👤 Por favor, digite o nome completo do Cliente: MARIO ANDRADE
💰 Por favor, digite o saldo inicial: R$ 237.48

═══════════════════════════════════════
✅  CONTA CRIADA COM SUCESSO!
═══════════════════════════════════════

📄 Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, 
sua agência é 067-8, conta 1021 e seu saldo R$ 237,48 já está 
disponível para saque.

═══════════════════════════════════════
🎉 Bem-vindo ao nosso banco!
═══════════════════════════════════════
```

---

## 🧠 Conceitos Aplicados

### 📚 Sintaxe Java
- ✅ Declaração de variáveis
- ✅ Tipos primitivos (`int`, `double`) e objetos (`String`)
- ✅ Método `main` e argumentos

### 🔧 Entrada de Dados
- ✅ Classe `Scanner`
- ✅ Métodos `nextInt()`, `nextLine()`, `nextDouble()`
- ✅ Tratamento de quebras de linha

### 🔗 Manipulação de Strings
- ✅ Método `.concat()` para concatenação
- ✅ `String.valueOf()` para conversão
- ✅ `String.format()` para formatação

### 🎨 Interface de Console
- ✅ Uso de ícones Unicode
- ✅ Formatação visual com caracteres especiais
- ✅ Organização hierárquica de informações

---

## 🏗️ Estrutura do Projeto

```
ContaBanco/
│
├── 📄 ContaTerminal.java    # Classe principal da aplicação
├── 📖 README.md            # Documentação do projeto
└── 🎯 .gitignore           # Arquivos ignorados pelo Git
```

---

## 🎓 Aprendizados

Este projeto exercita conceitos fundamentais de:

- 🔤 **Sintaxe Java básica**
- 💻 **Interação via terminal**
- 🔗 **Concatenação de strings**
- 📊 **Manipulação de diferentes tipos de dados**
- 🎨 **Formatação de saída**
- 📋 **Boas práticas de código**

---

## 🤝 Contribuições

Projeto desenvolvido como parte do desafio da **DIO (Digital Innovation One)** na trilha de Java Básico.

---

## 📞 Contato

Para dúvidas sobre implementação ou sugestões de melhorias, entre em contato através da plataforma DIO.

---

**⭐ Desenvolvido com dedicação para o aprendizado de Java! ⭐**
