/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2108;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ebisposilva_faeterj-
 */
public class InterfaceAutomovel {
    private Scanner scanner;
    private ControladorAutomovel controladorAutomovel;
    
    public InterfaceAutomovel(){
        scanner = new Scanner(System.in);
        controladorAutomovel = new ControladorAutomovel();
    }
    private int obterOpcao(){
        System.out.println("1. Incluir Automóvel");
        System.out.println("2. Localizar Automóvel");
        System.out.println("3. Excluir Automóvel");
        System.out.println("4. Listar Automóvel");
        System.out.println("0. Sair");
        System.out.println("Opção");
        return scanner.nextInt();
    }
    
    public void incluirAutomovel(){
        String placa;
        int ano;
        double preco;
        double quilometragem;
        
        System.out.println("Placa: ");
        placa=scanner.next();
        System.out.println("ano: ");
        ano=scanner.nextInt();
        System.out.println("preco: ");
        preco=scanner.nextDouble();
        System.out.println("quilometragem: ");
        quilometragem=scanner.nextDouble();
        
        
        Automovel automovel= new Automovel(placa, ano, preco,quilometragem);
        controladorAutomovel.incluirAutomovel(automovel);
    }
    private void localizarAutomovel(){
        String placa;
        
        System.out.print("Informe a placa: ");
        placa= scanner.next();
        
        Automovel automovel = controladorAutomovel.selecionarAutomovelpelaPlaca(placa);
        if(automovel != null){
            System.out.println("Automovel\n"+
                    "Placa: "+automovel.obterPlaca()+"\n"+
                    "Ano: "+automovel.obterAno()+"\n"+
                    "Quilometragem: "+automovel.obterQuilometragem());
        }else{
            System.out.println("Automovel não encontrado ");
        }
    }
    private void excluirAutomovel(){
        String placa;
        System.out.print("Informe a placa: ");
        placa = scanner.next();
        Automovel automovel = controladorAutomovel.selecionarAutomovelpelaPlaca(placa);
        if (automovel != null){
            controladorAutomovel.excluirAutomovel(automovel);
            System.out.println("Automovel excluido");
        } else {
            System.out.println("Automovel nao encontrado");
        }
    }
    private void listarAutomoveis(){
        ArrayList<Automovel> automoveis = controladorAutomovel.obterAutomoveis();
        Automovel automovel = null;
        for (int i = 0; i < automoveis.size(); i++){
            automovel = automoveis.get(i);
            System.out.println("Placa: "+automovel.obterPlaca()+
                    "Ano: "+automovel.obterAno()+
                    " Preco: "+automovel.obterPreco()+
                    " Quilometragem: "+ automovel.obterQuilometragem());
        }
    }
    public void executar() {
        int opcao = 0;
        do{
            opcao = obterOpcao();
            switch (opcao){
                case 1: incluirAutomovel();
                break;
                case 2: localizarAutomovel();
                break;
                case 3: excluirAutomovel();
                break;
                case 4: listarAutomoveis();
            }
        } while (opcao != 0);
    } 
}
