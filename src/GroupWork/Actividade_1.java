package GroupWork;

import java.awt.event.*;
import javax.swing.*;

public class Actividade_1 extends JFrame {

    public static double totalP, depositoI, anosI, jurosI;

    public static void main(String args[]) {

        JFrame tela = new JFrame("POUPANCA");
        tela.setBounds(500, 300, 340, 300);
        tela.setLayout(null);

        JLabel juros = new JLabel("Juros ao mês: ");
        juros.setBounds(40, 20, 140, 25);

        JLabel anos = new JLabel("Num de anos: ");
        anos.setBounds(40, 60, 140, 25);

        JTextField campojuros = new JTextField();
        campojuros.setText(null);
        campojuros.setBounds(170, 20, 110, 25);
        campojuros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        JTextField campoanos = new JTextField();
        campoanos.setText(null);
        campoanos.setBounds(170, 60, 110, 25);
        campoanos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        JLabel deposito = new JLabel("Depósito Mensal(MZn): ");
        deposito.setBounds(20, 120, 140, 25);

        JLabel total = new JLabel("      Total Poupado: ");
        total.setBounds(20, 150, 140, 25);

        JTextField campodeposito = new JTextField();
        campodeposito.setText(null);
        campodeposito.setBounds(170, 120, 110, 25);
        campodeposito.setHorizontalAlignment(javax.swing.JTextField.CENTER);    
        
        JLabel totalPoupado = new JLabel();
        totalPoupado.setBounds(150, 150, 110, 25);
        totalPoupado.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        JLabel totalMzn = new JLabel("MZn");
        totalMzn.setBounds(230, 150, 30, 25);
        totalMzn.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        
        JButton ok = new JButton("Ok");
        ok.setBounds(120, 210, 80, 25);

        
        ActionListener ac = new ActionListener(){
        
            public  void actionPerformed(ActionEvent e) {
        
                if("ok1".equals(e.getActionCommand())){
                    
                    if(campodeposito.getText().isEmpty() || campoanos.getText().isEmpty() || campojuros.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos! ");
                    }
                    else{
                        depositoI = Double.parseDouble(campodeposito.getText());
                        anosI = Integer.parseInt(campoanos.getText());
                        jurosI = Double.parseDouble(campojuros.getText());
                    
                        totalP = 12 * anosI * depositoI * (jurosI/100) ;
                    
                        totalPoupado.setText(String.valueOf(totalP));
                
                    }
                }

            }
        };
        ok.setActionCommand("ok1");
        ok.addActionListener(ac);
         
         
        tela.add(juros);
        tela.add(anos);
        tela.add(campojuros);
        tela.add(campoanos);
        tela.add(deposito);
        tela.add(total);
        tela.add(campodeposito);
        tela.add(totalPoupado);
        tela.add(ok);
        tela.add(totalMzn);
        
        tela.setVisible(true);

        
    }
    
}
