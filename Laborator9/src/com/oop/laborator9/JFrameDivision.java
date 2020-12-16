package com.oop.laborator9;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.math.BigDecimal;

import javax.swing.BoxLayout;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameDivision {
    public static void main(String s[]) {
        JFrame frame = new JFrame("Lab9 Divider");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button = new JButton();
        JTextField variable1 = new JTextField();
        JTextField variable2 = new JTextField();
        variable2.setInputVerifier(new UnluckyVerifier());
        JTextField result = new JTextField();
        result.setEnabled(false);
        button.setText("Divide");
        panel.add(new JLabel("Var1"));
        panel.add(variable1);
        panel.add(new JLabel("Var2"));
        panel.add(variable2);
        panel.add(new JLabel("Result"));
        panel.add(result);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float var = 0;
                float var1 = 0;
                float var2 = 0;
                try {
                    var1 = Float.parseFloat(variable1.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error number " + variable1.getText(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    var2 = Float.parseFloat(variable2.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error number " + variable2.getText(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                try{
                    var = var1 / var2;
                 }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error dividing: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                result.setText(String.valueOf(var));
            }
        });
    }

}
class UnluckyException extends Exception{
    public String getMessage(){
        return "Entered unlucky number 13";
    }
}

class UnluckyVerifier extends InputVerifier {
    public boolean verify(JComponent input) {
        try{
            String text = ((JTextField) input).getText();
            if (text.equals("13")){
                throw new UnluckyException();
            }
        }catch(UnluckyException ex){
            JOptionPane.showMessageDialog(null, "Error input: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
