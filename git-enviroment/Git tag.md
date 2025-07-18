O comando git tag serve para marcar pontos quando falamos do historico de commits, elas são uteis para melhor localização dos arquivos e pontos do projeto.
O comando git tag sem parâmetros (sem hashcode de algum commit) vai criar uma tag em HEAD (ultimo commit da branch atual)
```
git tag nomedatag hashdocommit
```
## Visualizando tags existentes
Visualizar tags requerem o comando:
```
git tags
```
## Enviando tags para o repositório remoto
para enviar uma tag especifica, o processo é semelhante a enviar um commit:
```
git push origin nomedatag
```
já se tratando de todas tags:
```
git push origin --tags
```
## Criando tags anotadas
Anotar uma tag é uma boa prática, podemos realizar com:
```
git tag -a nomedatag -m ''mensagem da tag''
```
#git 