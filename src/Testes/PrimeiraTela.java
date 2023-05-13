package Testes;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class PrimeiraTela {

    public static void main(String[] args) {

 JFrame tela = new JFrame("Radios!");
tela.setBounds(10,10,400,250);
tela.setLayout(null);
JRadioButton designer = new JRadioButton("Eu sou WebDesigner!");
JRadioButton programador = new JRadioButton("Eu sou programador!");
designer.setBounds(20,20,250,35);
programador.setBounds(20,60,250,35);
ButtonGroup grupo = new ButtonGroup();
grupo.add(designer);
grupo.add(programador);
tela.add(designer);
tela.add(programador);
tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
tela.setVisible(true);





        /*  
         JFrame tela = new JFrame("Primeira Tela");
         tela.setBounds(400, 300, 300, 300);
         tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         tela.getContentPane().setBackground(Color.lightGray);
         tela.setLayout(null);

         //TEXTO - JLabel
         JLabel lblnome = new JLabel("Nome:");
         lblnome.setBounds(15, 0, 50, 50);
         tela.add(lblnome);

         JLabel lblidade = new JLabel("Idade:");
         lblidade.setBounds(15, 60, 50, 50);
         tela.add(lblidade);
        
         //BOTAO - JButton        
         JButton botao = new JButton("Ok");
         botao.setBounds(200, 230, 50, 20);
         botao.setBackground(Color.GRAY);
         botao.setForeground(Color.DARK_GRAY);
         botao.setToolTipText("Enviar");
         tela.add(botao);

         //CAMPO DE TEXTO - JTextField
         JTextField txtNome = new JTextField();
         txtNome.setBounds(5, 40, 270, 20);
         tela.add(txtNome);
        
         //CAMPO PERSONALISADO - JFormattedTextField
         JFormattedTextField txtData = new JFormattedTextField();
        
         try {
         txtData = new JFormattedTextField(new MaskFormatter("## / ## / ####"));
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Formato incorrecto");
         }
        
         txtData.setBounds(5, 100, 100, 20);
         tela.add(txtData);
        
         //TUGLEBUTTON
         JToggleButton toglebotao = new JToggleButton("Toggle Button");
         toglebotao.setBounds(10,230,100,20);
         toglebotao.setBackground(Color.GREEN);
         toglebotao.setForeground(Color.BLUE);
         toglebotao.setToolTipText("Um exemplo de ToolTip");
         tela.add(toglebotao);

         tela.setVisible(true);*/
    }
}
