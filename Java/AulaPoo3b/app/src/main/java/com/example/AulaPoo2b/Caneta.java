package com.example.AulaPoo2b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author math
 */
public class Caneta { //atributos da classe caneta
    public String cor;
    public String modelo;
    private float tamanho;
    protected float carga;
    protected boolean tampada;
    
    protected void tampar(){
        this.tampada = true;  //metodo para tampar a caneta
    }
    protected void destampar(){
        this.tampada = false; //metodo para destampar a caneta
    }
    
    public void verStatus(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Carga: " + this.carga);
        /*if (this.tampada == true){ //fiz esse if só pra não aparecer 0 ou 1 para o usuário
            System.out.println("Está tampada");
        } else {
            System.out.println("Está destampada");
        }*/
    
        System.out.println("Está tampada? " + this.tampada);
    }
   
    public void rabiscar() { //metodo para escrever com a caneta
        if (this.tampada == true) {
            System.out.println ("Não posso rabiscar, a caneta está tampada.");
        } else {
            System.out.println("Rabiscando....");
        }
    }
}
