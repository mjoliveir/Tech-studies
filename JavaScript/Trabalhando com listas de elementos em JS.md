É comum termos diversos elementos para operar em js, no exemplo do curso foi passado uma task de inputar som nos botões de um website e inicialmente fizemos dessa forma:
![[Pasted image 20250728100144.png]]
No entanto isso não escala muito bem, uma vez que o programa requerisse um pouco mais de funções para as infinitas teclas que ele poderia vir a ter, com isso em mente procuramos uma solução e a encontramos em travbalkhar com listas de elementos no JS. Para começar devemos inicialmente escrever o comando:
```js
document.querySelectorAll(nomedoatributocomumatodos);
```
recebendo um resultado como:
![[Pasted image 20250728100552.png]]

#javascript 