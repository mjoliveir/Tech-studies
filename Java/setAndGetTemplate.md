```java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ex22;

/**
 *
 * @author math
 */
public class Pessoa {
    
    //atributos da classe
    private float peso;
    private float altura;
 //mod acesso ("public") tipo (float) nomeMetodo("calcularIMC)
 //é interessante que todo metodo tenho o nome no infinitivo
    public float calcularIMC() {
    float imc = peso / (altura * altura);
    return imc;
    }
    
//metodos acessores
public void setPeso (float peso){
    this.peso = peso;
}
public float getPeso (){
    return peso;
}

public void setAltura (float altura){
    this.altura = altura;
}
public float getAltura (){
    return altura;
}
}
```
[[Java content]]
[[4 - Programação Orientada a Objetos (POO) em Java]]
