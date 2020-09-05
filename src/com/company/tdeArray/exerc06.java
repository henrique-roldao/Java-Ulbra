package com.company.tdeArray;

import java.util.Random;

public class exerc06 {
    public static void main(String[] args) {
        /*Crie uma classe que armazena os 12 meses do ano em um array. A seguir, gere um valor randômico
    entre 0 e 11 e apresente o mês correspondente ao valor sorteado. Considere que o
    valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro. */


        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};

        Random sorteio = new Random();
        System.out.println(meses[sorteio.nextInt(11)]);
    }
}
