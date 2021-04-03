package com.santosworkers;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String nome = "Lucas Gabriel";
        for(int i=0; i<10; i++) { 
            salutation(nome);
        }
    }
    public static void salutation(String name) {
        JOptionPane.showMessageDialog(null,"Salut, " + name + "! Ça va?");
    }    
}
