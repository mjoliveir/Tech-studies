Para impotar as fontes usei o site recomendado pela alura:
[Browse Fonts - Google Fonts](https://fonts.google.com/)
## No html
nele há instruções sobre como importar as fontes, em html seguimos com:
Modelo do codigo para importar fonte, nesse caso a ''Boldonse":
```html
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Boldonse&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
```
Aplicando:
```css
.boldonse-regular {
  font-family: "Boldonse", system-ui;
  font-weight: 400;
  font-style: normal;
}
```

## No css
Importando
```css
<style>
@import url('https://fonts.googleapis.com/css2?family=Boldonse&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap');
</style>
```
Aplicando:
```css
.boldonse-regular {
  font-family: "Boldonse", system-ui;
  font-weight: 400;
  font-style: normal;
}
```
#css #html 