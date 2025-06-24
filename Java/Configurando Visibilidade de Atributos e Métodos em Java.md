

---

## 📝 1. O que é Visibilidade?
Define quem pode acessar os **atributos** e **métodos** de uma classe.  
Permite **encapsular dados** e **proteger a lógica interna**.

---

## 🔑 2. Tipos de Modificadores de Acesso

| Modificador   | Quem Pode Acessar?                             |
|---------------|-------------------------------------------------|
| **public**    | Qualquer classe em qualquer pacote             |
| **protected** | Mesma classe, subclasses e classes do pacote   |
| **(default)** | Classes no mesmo pacote (*package-private*)    |
| **private**   | Somente a própria classe                       |

---

## 🧹 3. Exemplos Práticos

### ✅ public
```java
public void mostrarMensagem() {
    System.out.println("Olá!");
}
```
_Acessível de qualquer lugar._

---

### ✅ private
```java
private double saldo;
```
_Acessível apenas dentro da classe._

---

### ✅ protected
```java
protected void calcularImposto() {
    // lógica
}
```
_Acessível em subclasses e classes do mesmo pacote._

---

### ✅ default
```java
void processarPedido() {
    // lógica
}
```
_Acessível somente no mesmo pacote._

---

## 🛡️ 4. Boas Práticas

- ✅ Use **private** para atributos.
- ✅ Exponha apenas métodos realmente necessários como **public**.
- ✅ Utilize **getters** e **setters** para controlar acesso.
- ✅ Sempre comece com o nível mais restrito e só abra se necessário.

---

## 🧱 5. Comparativo Visual

| Modificador   | Mesma Classe | Mesmo Pacote | Subclasse | Outro Pacote |
|---------------|--------------|--------------|-----------|--------------|
| public        | ✅           | ✅           | ✅        | ✅           |
| protected     | ✅           | ✅           | ✅        | ❌           |
| (default)     | ✅           | ✅           | ❌        | ❌           |
| private       | ✅           | ❌           | ❌        | ❌           |

---
[[Java content]]
[[4 - Programação Orientada a Objetos (POO) em Java]]