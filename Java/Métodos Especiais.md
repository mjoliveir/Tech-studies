## Construtores
Métodos usados para inicializar objetos no momento da criação.

```java
public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
```

## Método main()
Ponto de entrada do programa Java.

```java
public static void main(String[] args) {
    System.out.println("Programa iniciado");
}
```

## Método finalize()
Chamado pelo Garbage Collector antes de destruir o objeto.
(Obsoleto e desaconselhado desde Java 9)

```java
@Override
protected void finalize() throws Throwable {
    System.out.println("Objeto será destruído.");
}
```

## Getters e Setters
Métodos usados para acessar e modificar atributos privados.

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

## Método toString()
Retorna uma representação textual do objeto.

```java
@Override
public String toString() {
    return "Pessoa{nome=" + nome + "}";
}
```

## Método equals()
Compara se dois objetos são iguais.

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoa pessoa = (Pessoa) obj;
    return nome.equals(pessoa.nome);
}
```

## Método hashCode()
Retorna um número inteiro usado em coleções hash.

```java
@Override
public int hashCode() {
    return nome.hashCode();
}
```

## Método clone()
Cria uma cópia do objeto.

```java
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}
```
[[0 - Roadmap Java Learning]]
[[Java content]]
[[Configurando Visibilidade de Atributos e Métodos em Java]]
[[4 - Programação Orientada a Objetos (POO) em Java]]
[[Encapsulamento na Programacao Orientada a Objetos (POO)]]
[[4 - Programação Orientada a Objetos (POO) em Java]]
[[]]