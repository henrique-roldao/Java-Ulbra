package com.company.math;

import javax.swing.*;

public class exerc04 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        System.out.println("Sua frase: " + frase);
        char[] fraseArray = frase.toCharArray();

        System.out.print("Frase invertida: ");
        for (int i = fraseArray.length - 1; i >= 0; i--){
            System.out.print(fraseArray[i]);
        }
    }
}

/* 4 - Construa uma classe que receba uma frase qualquer e mostre essa
frase de trás para a frente e sem espaços em branco, */
