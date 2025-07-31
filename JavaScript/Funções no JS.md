 
---

### 1. Função declarada (function declaration)

```javascript
function saudacao() {
    console.log("Olá, mundo!");
}

saudacao(); // Chamada da função
```

- Pode ser chamada antes da sua declaração, devido ao hoisting.
    

---

### 2. [[Função anônima]] (function expression)

```javascript
const saudacao = function() {
    console.log("Olá, mundo!");
};

saudacao();
```

- Não tem nome e geralmente é atribuída a uma variável.
    
- Não é içada (hoisting) como a declaração de função.
    

---

### 3. Arrow function (função seta)

```javascript
const saudacao = () => {
    console.log("Olá, mundo!");
};

saudacao();
```

- Sintaxe mais curta.
    
- Não possui seu próprio `this`, o que muda o comportamento em objetos.
    

---

### 4. Função com parâmetros

```javascript
function soma(a, b) {
    return a + b;
}

console.log(soma(2, 3)); // 5
```

---

### 5. Função com valor padrão

```javascript
function saudacao(nome = "Visitante") {
    console.log(`Olá, ${nome}!`);
}

saudacao(); // Olá, Visitante!
```

---

### 6. Função dentro de objeto (método)

```javascript
const pessoa = {
    nome: "Maria",
    falar: function() {
        console.log("Oi!");
    }
};

pessoa.falar();
```

Versão com arrow function:

```javascript
const pessoa = {
    nome: "João",
    falar: () => {
        console.log("Oi!");
    }
};
```

Obs: Arrow functions não são recomendadas quando se precisa usar `this` dentro do objeto.

---
#javascript 