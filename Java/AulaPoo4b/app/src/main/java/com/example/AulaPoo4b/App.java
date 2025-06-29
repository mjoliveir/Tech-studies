package com.example.AulaPoo4b;

public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIc" , "AZUL", 0.06f);
        c1.verStatus();
        /*c1.setPonta() da erro pq eu defini como um metodo privado
        só podemos acessar e setar ponta na diretamente na classe caneta*/
        //só consegui tampar e destampar a caneta dentro do metodo construtor
 
        Caneta c2 = new Caneta("IDK", "AMARELA", 0.07f);
        c2.verStatus();
    
    
    
    
    }
}
    