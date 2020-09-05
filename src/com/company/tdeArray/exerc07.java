package com.company.tdeArray;

import java.util.Random;

public class exerc07 {
    public static void main(String[] args) {
       /* Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40 e faça uma
        classe que contenha um array bidimensional com essas dimensões. A seguir, para cada
        posição desse array bidimensional armazene um valor aleatório entre 0 e 255*/

        int[][] pixels = new int[40][40];
        Random cor = new Random(256);
            for (int l=0; l < 40; l++){
                for (int c = 0; c < 40; c++) {
                    pixels[l][c] = cor.nextInt(256);
                }
            }

        for (int l=0; l < 40; l++){
            for (int c = 0; c < 40; c++) {
                System.out.print(pixels[l][c]+" ");
            }
            System.out.println(" ");
        }

    }
}
