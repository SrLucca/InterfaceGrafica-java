/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

/**
 *
 * @author lukss
 */
public class Cadastro {
    
    //atributos
    private int codigo;
    private String modelo;
    private String tipo;
    private boolean consignado;
    private String var;
    
    

    public static int codigoStatic = 1;
    
    public Cadastro(String tipo, String modelo, boolean consignado){
        
    
        this.codigo = codigoStatic++;
        this.tipo = tipo;
        this.modelo = modelo;
        this.consignado = consignado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setConsignado(boolean consignado) {
        this.consignado = consignado;
    }

    public boolean isConsignado() {
        return consignado;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        
        if(consignado == true){
            var = "consignado";
        }else{
            var = "nao e consignado";
        }
        return "Cadastro{" + "codigo=" + codigo + ", modelo=" + modelo + ", tipo=" + tipo + ", consignado= " + var + '}';
    }

    
    
}

