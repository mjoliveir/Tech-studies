o git restore restaura a versão do codigo. o restore serve para "viajar no tempo", podendo ser usado para desfazer alterações e visualizar o projeto no estado de algum commit em especifico. Um exemplo é o git restore --staged que pega tudo oque está na staged area e realoca em changes not staged

```
git restore --staged .
```
*detalhe: esse restore vai restaurar toda a area staged, mas também pdoeriamso executar o comando especificando o arquivo a ser restaurado*

depois disso executamos:
```
git restore
```
todas as alterações são redefinidas para o estado inalterado

## Voltando o estado da aplicação atraves de um commmit
Para restaurarmos a versão de algum projeto de acordo com determinado commit, podemos realizá-lo atraves do comando:
```
git restore source=hashcodedocommit
```
Antes disso, o hashcode do commit precisa ser capturado via git log:
```
git log --oneline
```
#git 