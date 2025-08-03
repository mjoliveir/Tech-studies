
### Como criar um objeto

**1. Notação literal:**

```js
const pessoa = {
  nome: "Lucas",
  idade: 21,
  falar: function() {
    console.log("Oi, eu sou o " + this.nome);
  }
};
```

**2. Usando `new Object()`:**

```js
const carro = new Object();
carro.modelo = "Fusca";
carro.ano = 1976;
```

---

### Acessar propriedades

```js
pessoa.nome         // "Lucas"
pessoa["idade"]     // 21
```

---

### Adicionar ou modificar propriedades

```js
pessoa.altura = 1.75;        // adiciona
pessoa.nome = "Matheus";     // modifica
```

---

### Remover propriedades

```js
delete pessoa.idade;
```

---

### Métodos (funções dentro do objeto)

```js
const cachorro = {
  nome: "Bob",
  latir() {
    console.log("Au au");
  }
};

cachorro.latir();  // "Au au"
```

---

### Percorrer um objeto

```js
for (let chave in pessoa) {
  console.log(chave + ": " + pessoa[chave]);
}
```

---

### Objetos dentro de objetos

```js
const aluno = {
  nome: "Ana",
  endereco: {
    rua: "Rua A",
    numero: 123
  }
};

console.log(aluno.endereco.rua);  // "Rua A"
```

#javascript [[Funções no JS]] [[Metodos de objeto]] [[Metodos dos arrays JS]]