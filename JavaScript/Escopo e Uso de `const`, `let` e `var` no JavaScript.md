



### `const`

- Escopo de **bloco** (`{}`).
    
- Usado quando o valor **não será reatribuído**.
    
- Mesmo com objetos e arrays, o conteúdo pode ser alterado, mas não é possível reatribuir outro objeto/array.
    
- Se declarado fora de qualquer bloco ou função, está no escopo global do script, mas **não** é acessível via `window`.
    

### `let`

- Escopo de **bloco**.
    
- Usado quando o valor **pode ser reatribuído**.
    
- Não "vaza" para fora do bloco como o `var`.
    

### `var`

- Escopo de **função** ou **global**.
    
- **Não** possui escopo de bloco.
    
- Declarações com `var` são **elevadas (hoisting)** e podem causar comportamentos inesperados.
    
- Quando declarado no escopo global, **fica disponível em `window`** (no navegador).
    

### Resumo do escopo

|Palavra|Escopo de bloco|Escopo de função|Escopo global|Visível no `window`|
|---|---|---|---|---|
|`const`|Sim|Sim|Sim|Não|
|`let`|Sim|Sim|Sim|Não|
|`var`|Não|Sim|Sim|Sim|

**Boa prática:** usar `const` por padrão. Usar `let` apenas quando o valor realmente precisar mudar. Evitar o uso de `var`.
#javascript 