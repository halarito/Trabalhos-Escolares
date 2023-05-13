package Testes;
import java.awt.event.*;
import javax.swing.*;

public class ActionList {
    public static void main(String[] args){
        
        JFrame tela = new JFrame("Action");
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setBounds(200, 150, 400, 200);
        
        JButton botao = new JButton("Fechar");
        botao.setBounds(150, 35, 90, 30);
        
        ActionListener action = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if("ok".equals(e.getActionCommand())){
                    tela.dispose();
                }
            }
        };
        
        botao.setActionCommand("ok");
        botao.addActionListener(action);
        
        tela.add(botao);
        tela.setVisible(true);
        
    }
}
