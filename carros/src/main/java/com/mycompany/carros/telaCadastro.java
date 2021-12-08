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
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.FileWriter;


/**
 *
 * @author lukss
 */
class telaCadastro extends JFrame implements ActionListener{

    
    private Container tela;
    private JPanel pnDados, pnBotoes;
    private JLabel lbModelo, lbMarca, lbPlaca, lbConsignado, lbTipo, lbAno, lbKilometragem, lbValor;
    private JTextField tfModelo, tfMarca, tfPlaca, tfAno, tfKilometragem, tfValor;
    private JButton btSair, btFinalizarCadastro;
    private Cadastro automovel;
    
    JComboBox<String> combo = new JComboBox <String>();
    JComboBox<String> combo2 = new JComboBox <String>();
    
    telaCadastro(){
    tela = this.getContentPane();
    tela.setLayout(new BorderLayout());
    
    //combo box CONSIGNADO
    combo.addItem("Sim");
    combo.addItem("Não");
    
    //combo box TIPO DE AUTOMOVEL
    combo2.addItem("Carro");
    combo2.addItem("Moto");
    combo2.addItem("Caminhão");
    
    
    //configurar paineis
    pnDados = new JPanel();
    pnBotoes = new JPanel();
    

    lbModelo = new JLabel("Modelo do automovel");
    tfModelo = new JTextField(30);
    
    lbPlaca = new JLabel("Placa do automovel");
    tfPlaca = new JTextField(30);
    
    lbMarca = new JLabel("Marca do automovel");
    tfMarca = new JTextField(30);
    
    lbAno = new JLabel("Ano do automovel");
    tfAno = new JTextField(30);
    
    lbKilometragem = new JLabel("Kilometragem do automovel");
    tfKilometragem = new JTextField(30);
    
    lbConsignado = new JLabel("Consignado");
    
    lbTipo = new JLabel("Tipo de automovel");
    
    lbValor = new JLabel("Valor do automovel");
    tfValor = new JTextField(30);
    
    //labels
    pnDados.setLayout(new GridLayout(8,1));
    pnDados.add(lbModelo); pnDados.add(tfModelo);
    pnDados.add(lbPlaca); pnDados.add(tfPlaca);
    pnDados.add(lbMarca); pnDados.add(tfMarca);
    pnDados.add(lbAno); pnDados.add(tfAno);
    pnDados.add(lbKilometragem); pnDados.add(tfKilometragem);
    pnDados.add(lbConsignado); pnDados.add(combo);
    pnDados.add(lbTipo); pnDados.add(combo2);
    pnDados.add(lbValor); pnDados.add(tfValor);
    
    
    //botoes
    btSair = new JButton("Sair");
    btFinalizarCadastro = new JButton("Finalizar Cadastro");
    pnBotoes.setLayout(new GridLayout(1,2));
    pnBotoes.add(btFinalizarCadastro); pnBotoes.add(btSair);
    
    //acao botoes
    btSair.addActionListener(this);
    btFinalizarCadastro.addActionListener(this);
    
    //adicionar componentes na tela
    tela.add(pnDados);
    tela.add(pnBotoes, BorderLayout.SOUTH);
    
    this.setTitle("Cadastrar Automovel");
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
       
       if(e.getSource() == btFinalizarCadastro){
           automovel = new Cadastro(tfModelo.getText(),tfAno.getText(),tfMarca.getText(),
                   tfPlaca.getText(),tfKilometragem.getText(),combo2.getSelectedItem().toString(),
                   combo.getSelectedItem().toString(), tfValor.getText());
           
            String modelo = tfModelo.getText();
            String ano = tfAno.getText();
            String marca = tfMarca.getText();
            String placa = tfPlaca.getText();
            String kilometragem = tfKilometragem.getText();
            String tipo = combo2.getSelectedItem().toString();
            String consignado = combo.getSelectedItem().toString();
            String valor = tfValor.getText();
            
            String nome_arquivo = "C:\\Users\\lukss\\Documents\\NetBeansProjects\\interface-grafica-java\\carros\\Garagem\\"+modelo+".txt";
            try {
                FileWriter gravarArquivo = new FileWriter(nome_arquivo, true);
                gravarArquivo.write("\nModelo:"+modelo+"\nAno:"+ano+"\nMarca:"+marca+"\nPlaca:"+placa+"\nKilometragem:"+kilometragem+
                        "\nTipo:"+tipo+"\nConsignado:"+consignado+"\nValor:"+valor);
                
                gravarArquivo.write(System.getProperty("line.separator"));
                gravarArquivo.close();
                setVisible(false);
            }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no cadastro!");
            }
            
           JOptionPane.showMessageDialog(null, "Automovel Cadastrado!");
           
           
        }
    }
    
}
