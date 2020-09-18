package com.company.math;

import java.util.Random;

public class exerc01 {
    public static void main(String[] args) {
        /*1 - Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6) por três vezes.
         Ao  final some seus valores e apresente o resultado das três jogadas.*/

        Random rolagemDado = new Random();
        int d1 = rolagemDado.nextInt((6 - 1) + 1) + 1;
        int d2 = rolagemDado.nextInt((6 - 1) + 1) + 1;
        int d3 = rolagemDado.nextInt((6 - 1) + 1) + 1;


        System.out.println("Rolando dados ...");
        System.out.println("A soma de todas jogadas foi " +
                (d1 +  d2 + d3));

    }
}
