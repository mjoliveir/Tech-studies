Ao realizar git log, teremos resultados que traram à tona todo o historico de commits recentes ao como:
![[Pasted image 20250711143601.png]]
## Git log --oneline
para algo mais resumido poderiamos rodar o comando git log --oneline:
![[Pasted image 20250711143742.png]]
## git log -p
o git log -p exibe tudo oque o git log exibe mais diferenças realizadas nos commits isso trará algo como:
![[Pasted image 20250711144143.png]]
repare que, as linhas que começam menos são as linhas de remoção, enquanto as linhas com + são as linhas de adição, as linhas que possuem o codigo atual.

## git log --graph
esse parâmetro graph vai o git log com suas trees, vai deixar mais visual, deixando o log com as merges e etc:
![[Pasted image 20250711144922.png]]

## git log --format e git log --pretty
Esses são parametros git log que exibem informações específicas de log na qual podemos também passar parâmetros, utilizando git log --format="%H %an" exibe o hashcode e o nome do autor do commit, veja a mídia:
![[Pasted image 20250711145542.png]]
