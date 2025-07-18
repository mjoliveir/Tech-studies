o git rebase basicamente reescreve o log de commits entre diferentes branches, ele mescla (vide [[Git merge]]) e mantém o historico de alterações:

```
git pull
git switch branchasermesclada
git rebase main
```
nesse ponto, todos os elementos da branch exemplo (commits, alterações e etc) estão também presentes na branch principal (main)

É interessante dar rebase sempre antes de merge, pois garante que as branches estão caminhando juntas, abaixo um exemplo de merge pós rebase

```
git pull
git switch exemplo
git rebase main
git push origin main
git push origin exemplo
git merge exemplo
git push origin main
```

#git 