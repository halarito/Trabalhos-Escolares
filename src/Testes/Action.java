/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Arlindo Halar
 */
public class Action extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame tela = new JFrame("Botão");
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setBounds(400, 300, 400, 150);
        
        JButton botao = new JButton("OK");
        botao.setBounds(150, 45, 80, 30);
        
        tela.add(botao);
        tela.setVisible(true);
        
        ActionListener ac = new ActionListener(){
        
                public void actionPerformed(ActionEvent e){
                    if("botaook".equals(e.getActionCommand())){
                        JOptionPane.showMessageDialog(null, "Saudações!");
                    }
                }
        };
        botao.setActionCommand("botaook");
        botao.addActionListener(ac);
        
        
        
    }
    
}
