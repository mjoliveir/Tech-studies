O primeiro passo é definir `display: flex` no elemento "pai" (container) dos itens que você deseja posicionar. Isso habilita o Flexbox para esse container. Por padrão, o Flexbox organiza os itens em linha (row), mas isso pode ser alterado com a propriedade `flex-direction`.

Para alinhar os itens dentro do container, você pode usar a propriedade `align-items`. Por exemplo, `align-items: center` centraliza os itens verticalmente em relação ao maior elemento do container.

Eles usam o elemento `<main>` como exemplo, aplicando a classe "apresentacao" e definindo `display: flex` e `align-items: center` para posicionar o texto e a imagem lado a lado e centralizados verticalmente.

Além disso, eles recomendam a documentação do "A Complete Guide to Flexbox" para aprender mais sobre as propriedades e opções do Flexbox.

## Aplicando flexbox na prática
primeiro declaramos a classe na tag, depois no arquivo .css vamos colocar:
``` css
.nomedaclasse{
	display: flex; <<isso aplica o flexbox na tag com a classe atual
	align-itens: posição << podendo ser as descritas na imagem abaixo
}
```
![[Pasted image 20250718165051.png]]
#css #html 