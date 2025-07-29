Pra executarmos comandos como onclick, precisamos indicar ao js onde procurar o tal elemento, isso será feito dentro do código js com querySelector, o ideal é que o código esteja assim:
```js
document.querySelector('nomedoelementooualgoqueoremeta')
```
o resultado esperado é:![[Pasted image 20250725142055.png]]

nota: *os elementos quotado devem estar destacados e classes quotadas devem ser especificadas como classes com o prefixo '.'.*

Para buscar tipos em js:
```jsx
document.querySelector('input[type=tel]');
```

#javascript 