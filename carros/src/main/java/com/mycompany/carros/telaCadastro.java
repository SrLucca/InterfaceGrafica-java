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
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lukss
 */
class telaCadastro extends JFrame implements ActionListener{

    
    private Container tela;
    private JTextField modelo, marca, placa;
    private JPanel pnDados, pnBotoes;
    private JLabel lbModelo, lbMarca, lbPlaca;
    private JTextField tfModelo, tfMarca, tfPlaca;
    private JButton btSair, btFinalizarCadastro;
    
    telaCadastro(){
    tela = this.getContentPane();
    tela.setLayout(new BorderLayout());
    
    //configurar paineis
    pnDados = new JPanel();
    pnBotoes = new JPanel();
    

    lbModelo = new JLabel("Modelo do automovel");
    tfModelo = new JTextField(30);
    
    lbPlaca = new JLabel("Placa do automovel");
    tfPlaca = new JTextField(30);
    
    lbMarca = new JLabel("Marca do automovel");
    tfMarca = new JTextField(30);
    
    //labels
    pnDados.setLayout(new GridLayout(3,1));
    pnDados.add(lbModelo); pnDados.add(tfModelo);
    pnDados.add(lbPlaca); pnDados.add(tfPlaca);
    pnDados.add(lbMarca); pnDados.add(tfMarca);
    
    //botoes
    btSair = new JButton("Sair");
    btFinalizarCadastro = new JButton("Finalizar Cadastro");
    pnBotoes.setLayout(new GridLayout(1,2));
    pnBotoes.add(btFinalizarCadastro); pnBotoes.add(btSair);
    
    
    //adicionar componentes na tela
    tela.add(pnDados);
    tela.add(pnBotoes, BorderLayout.SOUTH);
    
    
    this.setTitle("Cadastrar Automovel");
    this.setSize(400,200);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btSair){
           System.out.println("chegou");
        }
    }
    
}
