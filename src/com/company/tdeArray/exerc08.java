package com.company.tdeArray;

import java.sql.SQLOutput;
import java.util.Random;

public class exerc08 {
    public static void main(String[] args) {
        /*Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado ímpar.
         Cada array deve conter 10 elementos. A seguir, faça um laço de repetição com 10 iterações e
          que contenha internamente a geração randômica de números entre 1 e 20. Se o valor gerado for
          par, armazene no array chamado par, caso contrário, no array chamado impar.
          Ao  final, apresente o conteúdo de cada um dos arrays.*/

        int par[] = new int[10];
        int impar[] = new int[10];
        Random aleatorio = new Random();
        int numeroGerado;

        int ip=0;
        int ii=0;
        for (int i=0; i<par.length; i++) {
            numeroGerado = aleatorio.nextInt(1000);
            if ( numeroGerado %2 == 0) {
                par[ip] = numeroGerado;
                ip++;
            } else {
                impar[ii] = numeroGerado;
                ii++;
            }
        }

        System.out.println("PAR");
        for (int i=0; i<ip; i++){
            System.out.println(par[i]);
        }

        System.out.println("IMPAR");
        for (int i=0; i<ii; i++){
            System.out.println(impar[i]);
        }
    }
}
