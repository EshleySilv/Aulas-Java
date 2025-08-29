/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2108;

import java.util.ArrayList;
/**
 *
 * @author ebisposilva_faeterj-
 */
public class ControladorAutomovel {
    private ArrayList<Automovel>automoveis;
    
    public ControladorAutomovel(){
        automoveis=new ArrayList<Automovel>();
    }
    public void incluirAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    public void excluirAutomovel(Automovel automovel){
        automoveis.remove(automovel);
    }
    public Automovel selecionarAutomovelpelaPlaca(String placa){
        Automovel automovel = null;
        for (int i=0; i<automoveis.size();i++){
            if(automoveis.get(i).obterPlaca().equals(placa)){
                automovel =automoveis.get(i);
                break;
            }
        }
        return automovel;
    }
    public ArrayList<Automovel> obterAutomoveis(){
        return automoveis;
    }
}
