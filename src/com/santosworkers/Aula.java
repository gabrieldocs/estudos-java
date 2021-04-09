package com.santosworkers;


import java.io.BufferedReader;
import java.io.IOException;
// import java.io.IOException;
import java.io.InputStreamReader;

public class Aula {
    public static void main(String [] args) throws IOException {
        String op, num1, num2;
        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("==================================");        
        System.out.println("\t Calculadora ");
        System.out.println("==================================");
        System.out.println("Selecione uma operação: ");
        System.out.println("1 Adição 2 - Subtração 3 - Multiplicação 4 - Divisão ");
        try {
            op = stream.readLine();
        }catch(NumberFormatException nfe) {
            System.out.println("Número mal formatado");
        }
        
        System.out.println("insira o primeiro valor: ");
        
        try {
            num1 = stream.readLine();
        }catch(NumberFormatException nfe) {
            System.out.println("Número mal formatado");
        }
        
        System.out.println("insira o segundo valor: ");
        
        try {
            num2 = stream.readLine();
        }catch(NumberFormatException nfe) {
            System.out.println("Número mal formatado");
        }


        switch((Integer.valueOf(op))){
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (Integer.valueOf(num1) + Integer.valueOf(num2)));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (Integer.valueOf(num1) - Integer.valueOf(num2)));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (Integer.valueOf(num1) * Integer.valueOf(num2)));
                break;
            case 4:
                if(Integer.valueOf(num2) != 0) {
                    System.out.println(num1 + "/" + num2 + "=" + (Integer.valueOf(num1) / Integer.valueOf(num2)));
                } else {
                    System.out.println("Você inseriu um valor inválido como dividendo!");
                    System.exit(0);
                }
                break;
            default:
                break;
        }
        System.exit(0);
    }    
}
