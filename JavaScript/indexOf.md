o indexOf serve para procurar um elemento em especifico num vetor do javascript
abaixo uma pequna amostra da sua sintaxe:
```js
const livros = ['Dom Casmurro', 'O Cortiço', 'Capitães da Areia', 'Iracema'];
const livroProcurado = 'O Cortiço';

if (livros.indexOf(livroProcurado) !== -1) {
  console.log(`O livro "${livroProcurado}" está disponível.`);
} else {
  console.log(`O livro "${livroProcurado}" não foi encontrado.`);
}
```

Minha solução para o mesmo problema, isso antes de conhecer o comando indexOf:
![[Pasted image 20250801133824.png]]