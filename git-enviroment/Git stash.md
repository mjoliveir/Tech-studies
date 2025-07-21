Esse comando impede que você dê push de uma alteração incompleta e/ou nao testada, desfuncional e afins
```
git stash push -m ''mensagem descritiva da sua stash''
```
---
## Visualizando a stash
semelhante a um git log --oneline, para visualizar nossa stash (gaveta de alterações não staged) podemos utilizar o git stash list
```
git stash list
```

Para utilizar o estado salvo com git stash vamos utilizar o git stash pop
```
git stash pop
``` 
as stashes sempre declaram um indice quando salvas como descrito abaixo :
![[Pasted image 20250714132944.png]]
o git stash sempre pega a ultima stash salva,
para pegar uma stash especifica execute:
```
git stash apply indicedastash
```
Isso retorna algo como:
![[Pasted image 20250714133246.png]]
*também é possivel dar git stash apply em mais de um indice, isso se os dois não conflitarem*

---
### Drop

O `git stash drop` funciona exatamente como o `pop`, mas com uma simples diferença: ele apenas remove o item da _stash_, sem aplicá-lo em nosso repositório. Dessa forma, `git stash drop` remove o último item adicionado à _stash_, enquanto o `git stash drop 1` remove da _stash_ o item com índice 1.
#git 