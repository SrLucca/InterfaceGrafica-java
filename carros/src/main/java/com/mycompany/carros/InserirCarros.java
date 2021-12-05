/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

/**
 *
 * @author lukss
 */
public class InserirCarros {
    
    public static void main(String[] args){
        
    
        Cadastro c1 = new Cadastro("Carro","Honda",false);
        Cadastro c2 = new Cadastro("moto","hornet",true);
        
        System.out.println("AQUI "+c1.toString());
        System.out.println("AQUI "+c2.toString());
        
        new Interface();
    }
}
