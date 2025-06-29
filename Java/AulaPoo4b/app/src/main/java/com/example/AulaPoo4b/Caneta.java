/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AulaPoo4b;

/**
 *
 * @author math
 */
public class Caneta {
    public String modelo;
    public float ponta;
    public boolean tampada;
    public String cor;
    
    public Caneta(String m, String c, float p){
        this.modelo = m; 
        this.tamparCaneta();
        this.cor = c;
        this.setPonta(p);
    }
    
    //get e set do modelo
    public String getModelo(){ //lembre-se metodos do tipo "void" nao retornam nada
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    //get e set da ponta
    public float getPonta(){
        return this.ponta;
    }
    private void setPonta(float p){
        this.ponta = p;
    }
    //get and set da cor da caneta
    public String getCor(){
         return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    //metodos da tampa da caneta
    public void tamparCaneta(){
        this.tampada = true;
    }
    public void destamparCaneta(){
        this.tampada = false;
    }
    //metodo pra ver os status gerais da caneta
    public void verStatus(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada? : " + this.tampada);
    }
}



