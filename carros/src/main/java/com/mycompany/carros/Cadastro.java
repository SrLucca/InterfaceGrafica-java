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
    private String ano;
    private String marca;
    private String placa;
    private String kilometragem;
    private String tipo;
    private String consignado;
    private String valor;

    public static int codigoStatic = 1;
    
    public Cadastro(String modelo, String ano, String marca, String placa, String kilometragem, String tipo, String consignado, String valor){
        
    
        this.codigo = codigoStatic++;
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.kilometragem = kilometragem;
        this.consignado = consignado;
        this.valor = valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
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
    
     public void setValor(String valor) {
        this.valor = valor;
    }
    
    public static void setCodigoStatic(int codigoStatic) {
        Cadastro.codigoStatic = codigoStatic;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getKilometragem() {
        return kilometragem;
    }

    public String getTipo() {
        return tipo;
    }

    public String getConsignado() {
        return consignado;
    }
    
    public String getValor() {
        return valor;
    }

    public static int getCodigoStatic() {
        return codigoStatic;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "codigo=" + codigo + ", modelo=" + modelo + ", ano=" + ano + ", marca=" + marca + ", placa=" + placa + ", kilometragem=" + kilometragem + ", tipo=" + tipo + ", consignado=" + consignado + ", valor=" + valor + '}';
    }
    
}

