Uma referencia serve para que nós tenhamos uma maneira mais rapida de executar um comando, sem precisar escreve-lo integralmente todas as vezes abaixo um exemplo de comando otimizado com uma referencia:
![[Pasted image 20250728103341.png]]

Esse const é porque é uma referencia que se mantem constante, oque significa que ela não alterará seu valor ao longo do processamento da aplicação.

A partir do momento que declaramos uma referencia, podemos executar comandos atraves dela ao inves de fazer todo aquele trabalho de document.querySelector.....
Para começar, vamos declarar a ref:
```js
'ListaDeTeclas'
```
depois passar o endereço do objeto a ser inspecionado:
```js
ListaDeTeclas[0]
```
E por fim a função:
```js
ListaDeTeclas[0]onclick = tocaSomPom
```

#javascript 