
A herança é um dos principais pilares da programação orientada a objetos em Java. Ela permite que uma classe (denominada subclasse ou classe derivada) herde atributos e métodos de outra classe (chamada superclasse ou classe base), promovendo reuso de código, extensibilidade e organização lógica.

## Conceito Básico

Quando uma classe herda de outra, ela pode reutilizar comportamentos já implementados, especializá-los ou sobrescrevê-los para alterar seu funcionamento. Em Java, essa relação de herança é declarada com a palavra-chave `extends`.

### Exemplo:

```java
// Superclasse
public class Animal {
    String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse
public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

Nesse exemplo, a classe `Cachorro` herda a propriedade `nome` e o método `fazerSom` da classe `Animal`, podendo modificá-los conforme a necessidade.

## Palavra-chave `super`

A palavra-chave `super` é usada para se referir à superclasse imediata da subclasse. Ela pode ser utilizada para:

1. Acessar métodos da superclasse.
    
2. Acessar o construtor da superclasse (necessário quando a superclasse não tem um construtor padrão).
    

```java
public class Animal {
    public Animal(String nome) {
        System.out.println("Animal: " + nome);
    }
}

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
}
```

## Herança Múltipla

Java não permite herança múltipla de classes para evitar ambiguidade. Uma classe não pode estender mais de uma superclasse. Contudo, Java permite herança múltipla por meio de interfaces:

```java
interface A {
    void metodoA();
}

interface B {
    void metodoB();
}

public class C implements A, B {
    public void metodoA() {}
    public void metodoB() {}
}
```

## Benefícios da Herança

- Reutilização de código já existente
    
- Cria estruturas organizadas e hierárquicas
    
- Facilita o uso de polimorfismo
    
- Permite especialização de comportamentos