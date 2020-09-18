package com.company.math;

import javax.swing.*;

public class exerc05 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        frase.toLowerCase();
        if ((frase.contains("sexo")) || (frase.contains("sexual"))){
            JOptionPane.showMessageDialog(null, "Frase contém palavras impróprias");
        } else {
            JOptionPane.showMessageDialog(null, "Frase válida!");
        }
    }
}

/*5 - Elabore uma classe que receba uma frase e verifique que se essa frase possui
palavras impróprias. As palavrasi mpróprias são: sexo e sexual. Caso encontre uma dessas palavras,
 emita em tela a mensagem “conteúdo impróprio”, caso contrário “conteúdo liberado”, */
