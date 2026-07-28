# Sistema de Gerenciamento de Funcionários

Projeto desenvolvido em Java com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, gerenciamento de coleções com **ArrayList** e implementação de um CRUD completo em memória.

O sistema permite cadastrar, listar, buscar, atualizar e remover funcionários de uma empresa.

---

## 🚀 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- ArrayList (Java Collections)
- Encapsulamento
- Construtores
- Getters e Setters

---

## 📌 Objetivo do projeto

Este projeto foi desenvolvido para aplicar conceitos fundamentais do desenvolvimento Java:

- Criação e organização de classes
- Separação de responsabilidades
- Manipulação de objetos
- Associação entre classes
- Implementação de operações CRUD

---

# 🏗️ Estrutura do projeto

```
src
└── br.com.geovanni.sistemafuncionarios
    │
    ├── Main.java
    │
    ├── model
    │   └── Funcionario.java
    │
    └── service
        └── Empresa.java
```

---

# 📚 Classes do projeto

## 👤 Funcionario

Classe responsável por representar os dados de um funcionário.

### Atributos:

```java
private String nome;
private int idade;
private String cpf;
private String cargo;
private double salario;
```

### Funcionalidades:

- Cadastro de informações do funcionário
- Alteração dos dados através de setters
- Exibição das informações cadastradas

Exemplo:

```java
Funcionario ana = new Funcionario(
    "Ana",
    25,
    "111",
    "Chefe",
    5000.00
);
```

---

# 🏢 Empresa

Classe responsável pelo gerenciamento dos funcionários.

A empresa possui uma lista de funcionários utilizando:

```java
private ArrayList<Funcionario> funcionarios;
```

## Funcionalidades implementadas:

### ➕ Adicionar funcionário

```java
empresa.adicionarFuncionario(ana);
```

Adiciona um funcionário na lista da empresa.

---

### 📋 Listar funcionários

```java
empresa.listarFuncionarios();
```

Exibe todos os funcionários cadastrados.

---

### 🔎 Buscar funcionário

```java
empresa.buscarFuncionario("Bruno");
```

Realiza uma busca pelo nome do funcionário.

Caso encontre, exibe seus dados.

---

### ✏️ Atualizar funcionário

```java
empresa.atualizarFuncionario(
    "Ana",
    "Gerente",
    7000
);
```

Permite atualizar informações como:

- Cargo
- Salário

---

### ❌ Remover funcionário

```java
empresa.removerFuncionario("Bruno");
```

Remove um funcionário da lista da empresa.

---

# 🔄 Operações CRUD

O projeto implementa as quatro operações básicas:

| Operação | Método | Descrição |
|---|---|---|
| Create | `adicionarFuncionario()` | Cadastra funcionários |
| Read | `listarFuncionarios()` / `buscarFuncionario()` | Consulta funcionários |
| Update | `atualizarFuncionario()` | Atualiza informações |
| Delete | `removerFuncionario()` | Remove funcionários |

---

# ▶️ Exemplo de execução

```java
Empresa empresa = new Empresa();

empresa.setNomeEmpresa("Geovanni Tech");

Funcionario ana = new Funcionario(
    "Ana",
    25,
    "111",
    "Chefe",
    5000.00
);

Funcionario bruno = new Funcionario(
    "Bruno",
    21,
    "222",
    "Analista",
    4000.00
);

empresa.adicionarFuncionario(ana);
empresa.adicionarFuncionario(bruno);

empresa.listarFuncionarios();
```

Saída:

```
Funcionários ativos:

Ana
25
111
Chefe
5000.0

Bruno
21
222
Analista
4000.0
```

---

# 🧠 Conceitos aplicados

## Encapsulamento

Os atributos das classes são privados:

```java
private String nome;
```

O acesso é feito através de métodos:

```java
getNome()
setNome()
```

---

## Associação entre classes

A classe `Empresa` possui uma lista de objetos `Funcionario`:

```java
ArrayList<Funcionario> funcionarios;
```

Isso representa que uma empresa pode possuir vários funcionários.

---

## Construtores

O projeto utiliza dois tipos:

### Construtor vazio

```java
public Funcionario(){

}
```

Permite criar um objeto sem informações iniciais.

### Construtor completo

```java
public Funcionario(
String nome,
int idade,
String cpf,
String cargo,
double salario
)
```

Permite criar um funcionário já preenchido.

---

# 📌 Próximas melhorias

Possíveis evoluções do projeto:

- Implementar persistência de dados com PostgreSQL
- Utilizar JDBC para conexão com banco de dados
- Migrar para JPA/Hibernate
- Criar uma API REST utilizando Spring Boot
- Implementar autenticação de usuários
- Criar testes automatizados

---

# 👨‍💻 Autor

Geovanni

Projeto desenvolvido para estudo e evolução em Java Backend.
