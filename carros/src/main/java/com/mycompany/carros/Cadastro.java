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
    private int ano;
    private String marca;
    private String placa;
    private int kilometragem;
    private String tipo;
    private String consignado;
    
    

    public static int codigoStatic = 1;
    
    public Cadastro(String modelo, String tipo, int ano, String marca, String placa, int kilometragem, String consignado){
        
    
        this.codigo = codigoStatic++;
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.kilometragem = kilometragem;
        this.consignado = consignado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setConsignado(String consignado) {
        this.consignado = consignado;
    }

    public static void setCodigoStatic(int codigoStatic) {
        Cadastro.codigoStatic = codigoStatic;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public String getTipo() {
        return tipo;
    }

    public String getConsignado() {
        return consignado;
    }

    public static int getCodigoStatic() {
        return codigoStatic;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "codigo=" + codigo + ", modelo=" + modelo + ", ano=" + ano + ", marca=" + marca + ", placa=" + placa + ", kilometragem=" + kilometragem + ", tipo=" + tipo + ", consignado=" + consignado + '}';
    }
    
    

    
    
}

