
### O que é um método?
É simplesmente uma **função armazenada como uma propriedade** de um objeto.

```js
const pessoa = {
  nome: 'Matheus',
  falar: function() {
    console.log(`Oi, meu nome é ${this.nome}`);
  }
};

pessoa.falar(); // Saída: Oi, meu nome é Matheus
```

> Aqui, `falar` é um **método do objeto `pessoa`**.

---

### `this` nos métodos
Dentro de um método, o `this` se refere ao próprio objeto onde o método foi chamado.

---

### Criando métodos de forma mais limpa (ES6)
```js
const gato = {
  nome: 'Felix',
  miar() {
    console.log(`${this.nome} está miando...`);
  }
};

gato.miar(); // Felix está miando...
```

---

### Métodos nativos de objeto (`Object`)
Além dos métodos que você cria, o JS já tem vários métodos nativos para lidar com objetos:

| Método                     | O que faz                                       |
| -------------------------- | ----------------------------------------------- |
| `Object.keys(obj)`         | Retorna as **chaves** do objeto como array      |
| `Object.values(obj)`       | Retorna os **valores** do objeto como array     |
| `Object.entries(obj)`      | Retorna um array com pares `[chave, valor]`     |
| `Object.assign(dest, src)` | Copia propriedades de um objeto para outro      |
| `Object.freeze(obj)`       | Congela o objeto (não pode mais ser alterado)   |
| `Object.hasOwnProperty()`  | Verifica se uma propriedade é do próprio objeto |
|                            |                                                 |

Exemplo:
```js
const livro = {
  titulo: '1984',
  autor: 'George Orwell'
};

console.log(Object.keys(livro)); // ['titulo', 'autor']
console.log(Object.values(livro)); // ['1984', 'George Orwell']
```
#javascript [[Objetos JS]]