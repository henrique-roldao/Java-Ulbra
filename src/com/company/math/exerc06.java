package com.company.math;

import javax.swing.*;

public class exerc06 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase");
        int qntFrase = frase.length();

        JOptionPane.showMessageDialog(null, frase.substring(0, qntFrase-1));
    }
}

/* 6 - Crie uma classe que exiba o substring de uma string FRASE composto
 por todos os caracteres de FRASE exceto o último caracter. */