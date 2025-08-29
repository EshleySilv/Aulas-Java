/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2108;

/**
 *
 * @author ebisposilva_faeterj-
 */
public class Automovel {
    private String placa;
    private int ano;
    private double preco;
    private double quilometragem;
    
    public Automovel(String placa, int ano, double preco, double quilometragem){
        this.placa=placa;
        this.ano=ano;
        this.preco=preco;
        this.quilometragem=quilometragem;
    }
    public String obterPlaca(){
        return placa;
    }
    public int obterAno(){
        return ano;
    }
    public double obterPreco(){
        return preco;
    }
    public double obterQuilometragem(){
        return quilometragem;
    }
    public void atualizarPlaca(String placa){
       this.placa= placa;
    }
    public void atualizarAno(int ano){
       this.ano= ano;
    }
    public void atualizarPreco(double preco){
       this.preco= preco;
    }
    public void atualizarQuilometragem(double quilometragem){
       this.quilometragem= quilometragem;
    }
}

