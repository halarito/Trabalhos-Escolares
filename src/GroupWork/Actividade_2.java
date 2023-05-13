package GroupWork;

import java.text.DecimalFormat;
import java.awt.event.*;
import javax.swing.*;

public class Actividade_2 extends JFrame {

    private static final JComboBox EscMoeda = new JComboBox();
    private static final JLabel moed = new JLabel();
    private static Double valorMzn;
    private static Double valorConv;

    public static void main(String args[]) {

        JFrame tela = new JFrame("Câmbio");
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setBounds(500, 300, 300, 250);
        tela.setLayout(null);

        JLabel mzn = new JLabel("Valor:");
        mzn.setBounds(20, 20, 80, 25);
        mzn.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        JLabel moeda = new JLabel("Moeda:");
        moeda.setBounds(20, 50, 80, 25);
        moeda.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        JTextField valormzn = new JTextField();
        valormzn.setText(null);
        valormzn.setBounds(140, 20, 80, 25);
        valormzn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JLabel MoedaMzn = new JLabel("MZn");
        MoedaMzn.setBounds(220, 20, 50, 25);
        MoedaMzn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        //JComboBox EscMoeda = new JComboBox();
        EscMoeda.setBounds(140, 50, 120, 25);
        EscMoeda.addItem("Dolar (USA)");
        EscMoeda.addItem("Rand (SA)");
        EscMoeda.addItem("EUR (UE)");
        EscMoeda.addItem("Real (BR)");
        EscMoeda.setEditable(false);
        EscMoeda.setSelectedIndex(0);

        //EscMoeda.setAlignmentX(javax.swing.JComboBox.CENTER_ALIGNMENT);
        JLabel valor = new JLabel("Valor:");
        valor.setBounds(20, 100, 80, 25);
        valor.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        JLabel valorResult = new JLabel();
        valorResult.setBounds(140, 100, 70, 25);
        valorResult.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        //JLabel moed = new JLabel();
        moed.setBounds(210, 100, 50, 25);

        JButton conv = new JButton("Converter");
        conv.setBounds(100, 150, 100, 25);

        JLabel Moeda = new JLabel();
        Moeda.setBounds(200, 100, 50, 25);
        Moeda.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        ActionListener ac = new ActionListener() {

            DecimalFormat df = new DecimalFormat("#,###.###");

            public void actionPerformed(ActionEvent e) {

                if ("converter".equals(e.getActionCommand())) {

                    if (valormzn.getText().isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null, "Digite o valor por cambiar");
                    
                    } else {
                        
                        valorMzn = Double.parseDouble(valormzn.getText());
                        
                        if (EscMoeda.getSelectedIndex() == 0) {

                            valorConv = (valorMzn / 63.78);

                        //System.out.printf("%.2f", valorConv);
                            valorResult.setText(String.valueOf(df.format(valorConv)));

                            moed.setText(null);
                            moed.setText("Dolares");

                        } else if (EscMoeda.getSelectedIndex() == 1) {

                            valorConv = (valorMzn / 4.51);

                        //System.out.printf("%.2f", valorConv);
                            valorResult.setText(String.valueOf(df.format(valorConv)));

                            moed.setText(null);
                            moed.setText("Randes");

                        } else if (EscMoeda.getSelectedIndex() == 2) {

                            valorConv = (valorMzn / 75.40);

                        //System.out.printf("%.2f", valorConv);
                            valorResult.setText(String.valueOf(df.format(valorConv)));

                            moed.setText(null);
                            moed.setText("Euros");

                        } else if (EscMoeda.getSelectedIndex() == 3) {

                            valorConv = (valorMzn / 12.02);

                        //System.out.printf("%.2f", valorConv);
                            valorResult.setText(String.valueOf(df.format(valorConv)));

                            moed.setText(null);
                            moed.setText("Reais");

                        }
                    }
                }
            }
        };

        conv.setActionCommand("converter");
        conv.addActionListener(ac);

        tela.add(valormzn);
        tela.add(mzn);
        tela.add(moeda);
        tela.add(EscMoeda);
        tela.add(valor);
        tela.add(valorResult);
        tela.add(moed);
        tela.add(conv);
        tela.add(Moeda);
        tela.add(MoedaMzn);

        tela.setVisible(true);
    }

}
