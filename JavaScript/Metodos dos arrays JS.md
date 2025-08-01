
## Métodos que Modificam o Array Original

**push()** – adiciona elemento(s) ao final  
`arr.push(4)`

**pop()** – remove o último elemento  
`arr.pop()`

**shift()** – remove o primeiro elemento  
`arr.shift()`

**unshift()** – adiciona elemento(s) no início  
`arr.unshift(1)`

**splice(início, quantos, ...itens)** – remove ou adiciona itens em qualquer posição  
`arr.splice(1, 2)` → remove 2 itens a partir do índice 1  
`arr.splice(1, 0, 'a')` → insere 'a' no índice 1

**reverse()** – inverte a ordem dos elementos  
`arr.reverse()`

**sort()** – ordena os elementos (alfabética por padrão)  
`arr.sort((a, b) => a - b)` → ordem crescente

---

## Métodos que Retornam um Novo Array (não modificam o original)

**slice(início, fim)** – copia parte do array  
`arr.slice(1, 3)` → do índice 1 até antes do 3

**map(callback)** – aplica uma função em cada item  
`arr.map(x => x * 2)`

**filter(callback)** – filtra itens com base em uma condição  
`arr.filter(x => x > 10)`

**concat(outroArray)** – junta arrays  
`arr.concat([4, 5])`

**flat(profundidade)** – achata arrays aninhados  
`[1, [2, 3]].flat()` → `[1, 2, 3]`

---

## Métodos de Busca

**find(callback)** – retorna o primeiro item que satisfaz a condição  
`arr.find(x => x > 10)`

**findIndex(callback)** – retorna o índice do primeiro item que satisfaz  
`arr.findIndex(x => x > 10)`

**indexOf(valor)** – retorna o índice da primeira ocorrência  
`arr.indexOf(3)`

**includes(valor)** – verifica se o valor existe no array  
`arr.includes(2)` → retorna true ou false

---

## Métodos de Redução

**reduce(callback, valorInicial)** – acumula valores  
`arr.reduce((acc, val) => acc + val, 0)`

---

## Iteração

**forEach(callback)** – executa uma função para cada item (sem retorno)  
`arr.forEach(x => console.log(x))`

---

#javascript 