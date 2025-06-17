

A Programação Orientada a Objetos (POO) é um paradigma de programação que organiza o código em torno de **objetos**, que representam entidades do mundo real com **atributos** (dados) e **métodos** (comportamentos). Java é uma das linguagens mais populares que utiliza esse paradigma de forma robusta e estruturada.

## Conceitos Fundamentais

### 1. Classe[[Poo - Classes]]

Uma **classe** é um molde para criar objetos. Ela define os atributos e métodos que os objetos daquela classe terão.

```java
public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

### 2. Objeto

Um **objeto** é uma instância de uma classe. Ele possui valores concretos para os atributos definidos na classe.

```java
Pessoa p1 = new Pessoa();
p1.nome = "Carlos";
p1.idade = 30;
p1.apresentar();
```

### 3. Encapsulamento

O **encapsulamento** protege os dados de uma classe, tornando-os privados e acessíveis apenas por métodos públicos.

```java
public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

### 4. [[Herança]]

A **herança** permite que uma classe herde atributos e métodos de outra classe, promovendo o reuso de código.

```java
public class Aluno extends Pessoa {
    String curso;

    void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }
}
```

### 5. Polimorfismo

O **polimorfismo** permite que métodos tenham comportamentos diferentes dependendo da classe que os implementa.

```java
public class Pessoa {
    void apresentar() {
        System.out.println("Sou uma pessoa.");
    }
}

public class Aluno extends Pessoa {
    @Override
    void apresentar() {
        System.out.println("Sou um aluno.");
    }
}
```

### 6. Abstração

A **abstração** consiste em destacar os aspectos essenciais de um objeto, escondendo os detalhes desnecessários.

```java
public abstract class Funcionario {
    String nome;
    abstract void trabalhar();
}

public class Engenheiro extends Funcionario {
    @Override
    void trabalhar() {
        System.out.println("Engenheiro trabalhando");
    }
}
```

## Conclusão

A Programação Orientada a Objetos em Java promove uma estrutura de código mais limpa, organizada e fácil de manter. Ao entender e aplicar os princípios de classe, objeto, encapsulamento, herança, polimorfismo e abstração, é possível construir sistemas mais modulares, reutilizáveis e robustos.