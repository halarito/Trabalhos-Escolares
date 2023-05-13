package Testes;

import java.awt.event.*;
import javax.swing.*;

public class ViceVersa {
    
    public static String Texto; 
    
    public static void main(String[] args) {

        JFrame tela = new JFrame("Conversão de Texto");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setBounds(500, 300, 350, 250);

        //lblTexto - Label Texto
        JLabel lblTexto = new JLabel("Texto a converter: ");
        lblTexto.setBounds(20, 20, 130, 30);
        lblTexto.setHorizontalAlignment(JLabel.CENTER);

        //lblTextoConv - Label Texto Convertido
        JLabel lblTextoConv = new JLabel("Texto convertido: ");
        lblTextoConv.setBounds(20, 70, 130, 30);
        lblTextoConv.setHorizontalAlignment(JLabel.CENTER);

        //txtTexto - Compo de Texto 
        JTextField txtTexto = new JTextField();
        txtTexto.setBounds(170, 20, 130, 30);
        txtTexto.setHorizontalAlignment(JTextField.CENTER);

        //txtTextoConv - Compo de Texto Convertido
        JTextField txtTextoConv = new JTextField();
        txtTextoConv.setBounds(170, 70, 130, 30);
        txtTextoConv.setHorizontalAlignment(JTextField.CENTER);

        JButton botao = new JButton("Converter");
        botao.setBounds(100, 150, 100, 30);
      
        

        ActionListener ac = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if ("converter".equals(e.getActionCommand())) {
                    Texto = txtTexto.getText();
                    StringBuffer newStr = new StringBuffer(Texto);
                    
                    for (int i = 0; i < Texto.length(); i++) {
                    
                        if (Character.isLowerCase(Texto.charAt(i))) {
                            newStr.setCharAt(i, Character.toUpperCase(Texto.charAt(i)));
                        }
                        if (Character.isUpperCase(Texto.charAt(i))) {
                            newStr.setCharAt(i, Character.toLowerCase(Texto.charAt(i)));
                        }
                    }
                    
                    txtTextoConv.setText(newStr.toString());
                }
            }

        };

        botao.setActionCommand("converter");
        botao.addActionListener(ac);

        tela.add(txtTexto);
        tela.add(txtTextoConv);
        tela.add(lblTexto);
        tela.add(lblTextoConv);
        tela.add(botao);
        tela.setVisible(true);
     
    }

}
