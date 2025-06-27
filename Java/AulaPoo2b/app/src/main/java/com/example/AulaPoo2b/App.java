package com.example.AulaPoo2b;
public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "BIC";
        c1.tamanho = 0.7f;
        c1.carga = 100.0f;
        c1.destampar();
        c1.verStatus();
        c1.rabiscar();

    }
}

