As branches são ramificaões do seu repositorio git, elas permitem a colaboração evitando conflitos entre commits.
## Visualizando branches
Para visualizar as branches existentes num repositorio podemos rodar o comando git branch, isso sem passar nenhum parâmetro, assim como descrito abaixo:

```
git branch
```
---
## Criando branches
Quando quisermos criar branches apenas executamos o comando git branch -D nomedabranch.
Detalhe: o nome da branch por padrao sempre começa em minusculo e permanece sem acento. abaixo um exemplo de criação de uma branch:

```
git branch -D Refatoração
```
para criar e já se mover para a branch utilizamos o comando:
```
git switch -c nomedabranch
```
---
## Nos movendo entre as branches
Para nos movermos de branch em branch precisamos executar o comando abaixo

```
git checkout nomedabranch
```
obs: podemos também utilizar o git switch (sem parâmetro) para alternar entre branches.

---
## Removendo branches

```
git branch -d nomedabranch
```
---

#git