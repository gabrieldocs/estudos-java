package com.santosworkers;

import java.io.BufferedReader;
// import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = new String();        
        int age = 0; 
        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==================================");        
        System.out.println("\tBienvenue, amie! ");
        System.out.println("==================================");
        System.out.println("Quel est ton nom? ");
        name = stream.readLine();
        System.out.println("Quel âge as-tu? ");
        try {
            age = Integer.parseInt(stream.readLine());
        }catch(NumberFormatException nfe) {
            System.err.println("Invalid format!");
        }
        salutation(name, age);
        System.exit(0);
    }
    public static void salutation(String name) {
        JOptionPane.showMessageDialog(null,"Salut " + name + "! Ça va?");        
    }    
    public static void salutation(String name, int age) {
        JOptionPane.showMessageDialog(null,"Tu s'appele " + name + ", a "+ age  +"! Ça va?");
    }    
}
