/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.mycompany.carros.telaCadastro;
import com.mycompany.carros.telaVender;

/**
 *
 * @author lukss
 */
public class Interface extends JFrame implements ActionListener{
    
    
    private JPanel pnDados, pnBotoes;
    private JLabel lbCodigo, lbNome;
    private JTextField tfCodigo, tfModelo;
    private JButton btCadastrar, btVender, btSair;
    private Container tela;
    private Cadastro automovel;
    
    //construtor
    Interface(){
        
        //container
        tela = this.getContentPane();
        tela.setLayout(new BorderLayout());
        
        //configurar paineis
        pnDados = new JPanel();
        pnBotoes = new JPanel();
        
        //coloca-los dentro da tela
        tela.add(pnDados, BorderLayout.CENTER);
        tela.add(pnDados, BorderLayout.NORTH);
        pnDados.setBackground(Color.black);
        pnBotoes.setBackground(Color.white);
        
        //configurando componentes
        //lbCodigo = new JLabel("Código do automovel");
        //lbNome = new JLabel("Modelo do automovel");
        //tfCodigo = new JTextField(10);
        //tfModelo = new JTextField(30);
        btCadastrar = new JButton("Cadastrar Automovel");
        btVender = new JButton("Vender Automovel");
        btSair = new JButton("Sair");
        
        //labels
        //pnDados.setLayout(new GridLayout(2,2));
        //pnDados.add(lbCodigo); pnDados.add(tfCodigo);
        //pnDados.add(lbNome); pnDados.add(tfModelo);
        
        //botoes
        pnBotoes.setLayout(new GridLayout(3,1));
        pnBotoes.add(btCadastrar); pnBotoes.add(btVender); pnBotoes.add(btSair);
        
        //eventos dos botoes
        btSair.addActionListener(this);
        btCadastrar.addActionListener(this);
        btVender.addActionListener(this);
        
        
        //adicionar botoes na tela
        tela.add(pnBotoes, BorderLayout.CENTER);
        
        this.setTitle("Registro e Venda de automoveis");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btSair){
            System.exit(0);
        }
        
        if(e.getSource() == btCadastrar){
            new telaCadastro();
        }
        
        if(e.getSource() == btVender){
            new telaVender();
        }
        
    }
}
