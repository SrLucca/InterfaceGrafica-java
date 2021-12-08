/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author lukss
 */
public class telaVender extends JFrame implements ActionListener{
    private Container tela;
    private JPanel pnDados, pnBotoes;
    private JLabel lbnomeComprador, lbCPF, lbTel, lbDocumento, lbnomeVendedor, lbValor, lbformaPagamento, lbautomovel;
    private JTextField tfnomeComprador, tfCPF, tfTel, tfDocumento, tfnomeVendedor, tfValor;
    private JButton btSair, btFinalizarVenda;
    private Venda automovel;
    File diretorio = new File("C:\\Users\\lukss\\Documents\\NetBeansProjects\\interface-grafica-java\\carros\\Garagem");

    
    JComboBox<String> combo = new JComboBox <String>();
    JComboBox<String> combo2 = new JComboBox <String>();
    
    telaVender(){
    
    for(File file:diretorio.listFiles()){
    
        combo2.addItem(file.getName());
    }
        
    tela = this.getContentPane();
    tela.setLayout(new BorderLayout());
    
    //combo box CONSIGNADO
    combo.addItem("Financiamento");
    combo.addItem("Á vista");
    combo.addItem("Consórcio");
    
    //combo box TIPO DE AUTOMOVEL
    //combo2.addItem("Carro");
    //combo2.addItem("Moto");
    //combo2.addItem("Caminhão");
    
    
    //configurar paineis
    pnDados = new JPanel();
    pnBotoes = new JPanel();
    

    lbnomeComprador = new JLabel("Nome Comprador");
    tfnomeComprador = new JTextField(30);
    
    lbCPF = new JLabel("CPF Comprador");
    tfCPF = new JTextField(30);
    
    lbTel = new JLabel("Telefone Comprador");
    tfTel = new JTextField(30);
    
    lbDocumento = new JLabel("Documento do automovel");
    tfDocumento = new JTextField(30);
    
    lbnomeVendedor = new JLabel("Nome Vendedor");
    tfnomeVendedor = new JTextField(30);
    
    lbformaPagamento = new JLabel("Forma de Pagamento");
    
    lbautomovel = new JLabel("Automovel");
    
    lbValor = new JLabel("Valor do automovel");
    tfValor = new JTextField(30);
    
    //labels
    pnDados.setLayout(new GridLayout(8,1));
    pnDados.add(lbautomovel); pnDados.add(combo2);
    pnDados.add(lbnomeComprador); pnDados.add(tfnomeComprador);
    pnDados.add(lbCPF); pnDados.add(tfCPF);
    pnDados.add(lbTel); pnDados.add(tfTel);
    pnDados.add(lbDocumento); pnDados.add(tfDocumento);
    pnDados.add(lbnomeVendedor); pnDados.add(tfnomeVendedor);
    pnDados.add(lbformaPagamento); pnDados.add(combo);
    pnDados.add(lbValor); pnDados.add(tfValor);
    
    
    //botoes
    btSair = new JButton("Sair");
    btFinalizarVenda = new JButton("Finalizar Venda");
    pnBotoes.setLayout(new GridLayout(1,2));
    pnBotoes.add(btFinalizarVenda); pnBotoes.add(btSair);
    
    //acao botoes
    btSair.addActionListener(this);
    btFinalizarVenda.addActionListener(this);
    
    //adicionar componentes na tela
    tela.add(pnDados);
    tela.add(pnBotoes, BorderLayout.SOUTH);
    
    this.setTitle("Vender Automovel");
    this.setSize(400,200);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setVisible(true);
    }
    
    
    public static void main(String[] args){
        
        new ComboBox();
        new ComboBox();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btSair){
           this.dispose();
        }
       
       if(e.getSource() == btFinalizarVenda){
           
           automovel = new Venda(combo2.getSelectedItem().toString(),tfnomeComprador.getText(),tfCPF.getText(),
                   tfTel.getText(),tfDocumento.getText(),tfnomeVendedor.getText(),
                   combo.getSelectedItem().toString(), tfValor.getText());
           
           diretorio = new File("C:\\Users\\lukss\\Documents\\NetBeansProjects\\interface-grafica-java\\carros\\Garagem"+"\\"+combo2.getSelectedItem().toString());
           diretorio.delete();
           setVisible(false);
           JOptionPane.showMessageDialog(null, "Automovel Vendido!");
           
           
        }
    }
}
