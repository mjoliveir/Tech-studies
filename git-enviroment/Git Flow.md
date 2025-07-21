O Git Flow é um modelo, uma estratégia ou, ainda, um fluxo de trabalho muito utilizado por equipes de desenvolvimento de software. **Ele se destaca por auxiliar na organização do versionamento de códigos.**

Publicado em 2010, pelo engenheiro de software holandês, [Vincent Driessen](https://twitter.com/nvie), o objetivo do Git Flow era melhorar as organizações das _Branches_ (ramificações) dentro de repositórios e, desta forma, dar mais fluidez ao processo de desenvolvimento de novas funcionalidades, correções de bugs e lançamentos de versões.

A solução do gitflow é apresentar grupos de [[Git branch]]. essas são
## Branches principais
Main
	A branch main carrega consigo o cerne do projeto e é a branch de produção
Develop
	A branch develop é a branch na qual as atualização são direcionadas e testadas antes de irem para a branch main a branch develop é como um sandbox ou beta testing, é um release funcional.

## Branches de suporte
 Release
	 Onde as demais branches de suporte tem seus commits testados e aprovados ou não para a branch dev
 Hotfix
	 Branch de correção de bugs ao longo do desenvolvimento
 Feature
	 Branch de adição de funcionalidades, essas posteriormente serão adicionadas a branch dev e brnach main

#git 