Convém usar o cherry-pick quando quisermos pegar apenas um commit especifico de branch1 e implantar na branch2
```
git cherry-pick hashdocommit
```
## Git blame
O git blame é útil em projetos grandes no qual múltiplas pessoas modificam o arquivo, quando executamos esse comando ele nos revela, linha por linha, os autores do codigo, achando os responsáveis por boas ou más alterações do projeto
```
git blame nomearquivo
```