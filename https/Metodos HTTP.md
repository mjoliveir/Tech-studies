Usando o postman podemos observar a lista extensa de métodos que o protocolo http possui, disponivel na imagem abaixo:
![[Pasted image 20250715142055.png]]

## Get
O get serve pra requerir informações, esse método é usado, por exemplo, para visualizar o html de um site por meio de GET / site/versão
Exemplo do uso de GET no postman:
![[Pasted image 20250715143442.png]]
## Post
O metodo post é usado para incrementar informações no sistem (como criar tokens de acesso e etc), ele é muito usado em preenchimento de cadastros e etc
Abaixo uma demosntração de post em postman:
![[Pasted image 20250715143718.png]]
## Tokens
Servidores http são stateless, oque significa que eles não guardam estados na memória, oque ocasiona a perda de dados se um token de usuario não for gerado ao concluir login. O token de usuario é vísivel quando utilizamos o metodo get junto ao protocolo://dominio:porta/localdologin.
Abaixo a imagem de um token de usuario:
![[Pasted image 20250715144834.png]]

#http 