# Classes em Java

Em Java, **classes** são a base da programação orientada a objetos. Elas definem os atributos e comportamentos que os objetos criados a partir delas terão. Uma classe funciona como um molde para criar objetos.

## Estrutura de uma Classe

Uma classe em Java é composta por:

- **Atributos**: variáveis que representam as características do objeto.
    
- **Métodos**: funções que representam o comportamento do objeto.
    
- **Construtor**: método especial chamado ao instanciar o objeto.a
    

### Exemplo Básico

```java
public class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

### Instanciando Objetos

```java
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 30);
        p1.apresentar();
    }
}
```

## Modificadores de Acesso

- `public`: acessível de qualquer lugar.
    
- `private`: acessível apenas dentro da própria classe.
    
- `protected`: acessível dentro do mesmo pacote ou subclasses.
    

### Exemplo com Encapsulamento

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
```

## Construtores

- Têm o mesmo nome da classe.
    
- Não possuem tipo de retorno.
    
- Podem ser sobrecarregados (vários com parâmetros diferentes).
    

### Exemplo com Sobrecarga

```java
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0; // valor padrão
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

## Conclusão

Classes são elementos essenciais em Java. Elas organizam o código em estruturas reutilizáveis, facilitando a manutenção e o crescimento de aplicações. Dominar classes é o primeiro passo para compreender totalmente a Programação Orientada a Objetos.

![[Classe_(programação).pdf]]