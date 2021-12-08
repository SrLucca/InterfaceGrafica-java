/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

/**
 *
 * @author lukss
 */
public class Venda {
    
    private String nomeComprador;
    private String CPF;
    private String Tel;
    private String Documento;
    private String nomeVendedor;
    private String Valor;
    private String formaPagamento;
    private String Automovel;
    
    public Venda(String Automovel, String nomeComprador, String CPF, String Tel, String Documento, String nomeVendedor, String formaPagamento, String Valor){
    
        this.nomeComprador = nomeComprador;
        this.CPF = CPF;
        this.Tel = Tel;
        this.Documento = Documento;
        this.nomeVendedor = nomeVendedor;
        this.Valor = Valor;
        this.formaPagamento = formaPagamento;
        this.Automovel = Automovel;
             
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setAutomovel(String Automovel) {
        this.Automovel = Automovel;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTel() {
        return Tel;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public String getValor() {
        return Valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getAutomovel() {
        return Automovel;
    }

    @Override
    public String toString() {
        return "Venda{" + "nomeComprador=" + nomeComprador + ", CPF=" + CPF + ", Tel=" + Tel + ", Documento=" + Documento + ", nomeVendedor=" + nomeVendedor + ", Valor=" + Valor + ", formaPagamento=" + formaPagamento + ", Automovel=" + Automovel + '}';
    }
    
    
}
