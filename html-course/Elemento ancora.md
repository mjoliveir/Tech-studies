no html podemos redirecionar o usuario por meio de elementos ancora, esses são dados pela tag ancora + href:
```html
<a class="botaoDoLink" href="instagram.com/joanasantosdev">Meu instagram</a>
<a class="botaoDoLink" href="github.com">Meu github</a>
```
acima temos duas tags a, e nelas uma classe chamada "botaoDoLink" onde personalizei com o codigo css a seguir:

```css
.botaoDoLink {
    background-color: rgb(89, 88, 192);
    color: white;
    border-radius: 15%;
    padding: 15px;
    text-decoration: none;
    font-family: "Open Sans", sans-serif;
    text-align: center;
    transition: 1.3s;
}
```

Quando quisermos redirecionar o usuario para determinado ambiente web atraves de um hiperlink, podemos utilizar a tag html a href
```html
<a href="linkderedirecionamento">nome do site</a>
```
#html 