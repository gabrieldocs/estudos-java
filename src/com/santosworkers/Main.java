package com.santosworkers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) throws Exception {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        String nome = "Lucas Gabriel";
        //  
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100,50,165,25);
        panel.add(passText);

        JButton button = new JButton();
        button.setBounds(100,80,80,25);
        button.setText("Login");
        panel.add(button);
        

        JLabel success = new JLabel("");
        passwordLabel.setBounds(10, 110, 300, 25);
        
        panel.add(success);


        frame.setVisible(true);
    }
    public static void salutation(String name) {
        JOptionPane.showMessageDialog(null,"Salut, " + name + "! Ça va?");
    }    
}
