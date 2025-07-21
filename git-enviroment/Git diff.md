Esse comando desmonstra a diferença do arquivo em repositorio remoto e do arquivo em seu repositorio local. Veja abaixo um exemplo do git diff
![[Pasted image 20250712172635.png]]
Nesse exemplo acima temos uma diferença no "show tags", que por sua vez recebe um valor positivo.
Resumindo, ele mostra a diferença entre o staged (*arquivos "quase prontos" para commit*) e o HEAD (*ultimo commit*)

## Visualizando a diff entre commits antigos
Quando quisermos ver a diff não só do staged e head, mas também de commits anteriores entre si, podemos executar o comando git diff hashdomaisantigo..hashdomaisrecente, abaixo uma demonstração:
![[Pasted image 20250712173508.png]]

# Versão em pdf:
![[Git diff.pdf]]
#git