package com.company;

import javax.swing.*;

public class ITBI {
    public static void main(String[] args) {

        double valorN, valorV, percentual, valorImposto;

        String input;
        input = JOptionPane.showInputDialog("Digite o valor da venal");
        valorV = Float.parseFloat(input);
        valorN = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transação"));
        percentual = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do percentual"));

        if ( valorV >= valorN) {
            valorImposto = valorV * percentual / 100;
        } else {
            valorImposto = valorN * percentual / 100;
        }

        JOptionPane.showMessageDialog(null, "O valor a ser pago é "+valorImposto);
    }
}
