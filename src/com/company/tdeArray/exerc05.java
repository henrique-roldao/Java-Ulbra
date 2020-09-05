package com.company.tdeArray;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        /* Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas em um array
        de cinco elementos, apresente em tela as cinco notas em ordem decrescente
        (da maior para a menor) e a média aritmética das notas. */

        float notas [] = new float [5];
        Scanner input = new Scanner(System.in);

        for (int i=0; i< notas.length; i++) {
            System.out.print("Digite a nota ("+(i+1)+"):");
            notas[i] = input.nextFloat();
        }

        Arrays.sort(notas);

        for (int x = notas.length-1; x>=0; x--)
            System.out.println(notas[x]);

    }
}
