package com.example.AulaPoo5b;

public class App {
    public static void main(String[] args) {
        contaBanco c1 = new contaBanco();
        c1.verConta();//visualizaçãp da conta zerada e fechada
        c1.abrirConta("cc", "Matheus Jesus");
        c1.verConta();//visualição da conta aberta e funcional
        c1.pagarMensalidade();
        c1.verConta();//visualização após pagar a mensalidade
    }
}
