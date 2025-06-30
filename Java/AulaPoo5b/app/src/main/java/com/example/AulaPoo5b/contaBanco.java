package com.example.AulaPoo5b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author math
 */
public class contaBanco {
    public int numConta; //numero da conta
    protected String tipoConta; /*cc (conta corrente, acrescimo de 50 reais) 
    ou cp(conta poupança, acrescimo de 150 reais) definido em abriConta()*/
    private String donoConta; //nome
    private int saldoConta;
    private boolean statusConta; //ativo (1) ou inativo (0)
    private int deposito;
    private int saque;
    private int mensalidadeCC = 12;
    private int mensalidadeCP = 20;

    public int getNumConta() {
        return numConta;
    }
    
    public boolean getStatus(){
        return statusConta;
    }
    
    public void setStatusConta(boolean statusConta){
        this.statusConta = statusConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public int getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(int saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getSaque() {
        return saque;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }

//metodo construtor
public contaBanco(){
    this.statusConta = false;
    this.saldoConta = 0;
}
//metodos de abertura e fechamento de contas    
public void abrirConta(String tipoDeConta, String nomeDono){
    this.setTipoConta(tipoDeConta);
    this.setDonoConta(nomeDono);
    switch (tipoDeConta){
            case "cc":
                this.setSaldoConta(50);
                break;
            case "cp":
                this.setSaldoConta(150);
                break;
            default:
                System.out.println("Opção de tipo de conta inválida."
                        + " Escolha entre conta corrente e conta poupança");
                break;
    }
    if (this.getTipoConta() == "cc"|| this.getTipoConta() == "cp"){
        this.setStatusConta(true);
    } else {
        this.setStatusConta(false);
    }
    }
        
    /*if (tipoConta == "cc"){       Essa pequena linha de codigo expressa a mesma 
    funçao da de cima, no entanto sem o puilar de encapsulamento da poo
        this.saldoConta = this.saldoConta + 50;
    } else if (tipoConta == "cp"){
        this.saldoConta = this.saldoConta + 150;
    }*/

public void fecharConta(){
    if (this.saldoConta > 0){
        System.out.println("Você ainda possui saldo e deve retirá-lo para fechar sua conta.");
    }else if (this.saldoConta < 0){
        System.out.println("Você possui debitos e atualmente não pode fechar sua conta");
    }else
        this.statusConta = false;
}


//metodos de saldo
public void depositarSaldo(){
    if (this.statusConta = true){
    this.saldoConta = this.saldoConta + deposito;
    }
}
public void sacarSaldo(){
    if (this.statusConta = true){
    this.saldoConta = this.saldoConta - saque;
    }
}

//metodo da mensalidade da conta
public void pagarMensalidade(){
    if (tipoConta == "cc"){
        this.saldoConta = this.saldoConta - mensalidadeCC;
    }else if (tipoConta == "cp"){
        this.saldoConta = this.saldoConta - mensalidadeCP;
    }
}

//metodo de visão geral da conta
public void verConta(){
    System.out.println("|  -----Visão geral da conta-----  |");
    System.out.println("|  Estado da conta: " + this.getStatus() + "          |");
    System.out.println("|  Número da conta: " + this.getNumConta()+ "              |");
    if (this.getTipoConta() != "cp" && this.getTipoConta() != "cc"){
        System.out.println("|  **Tipo de conta inválida**      |");
    }else {
        System.out.println("|  Tipo de conta: " + this.getTipoConta() + "               |");
    }
    System.out.println("|  Dono da conta: " + this.getDonoConta() + "    |");
    System.out.println("|  Saldo da conta: R$:" + this.getSaldoConta() + "           |");
    System.out.println("------------------------------------");
}
}