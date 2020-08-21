package com.company;

import javax.swing.*;

public class MediaAluno {
    public static void main(String[] args) {

        double prova1, prova2, trabalho, media;

        prova1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova1"));
        prova2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova2"));
        trabalho = Double.parseDouble(JOptionPane.showInputDialog("Nota do trabalho"));

        media = ( prova1 + prova2 + trabalho) / 3;

        if ( media >= 7) {
            System.out.println("APROVADOOOOOOO !");
        } else {
            System.out.println("Reprovado :)");
        }
    }
}
