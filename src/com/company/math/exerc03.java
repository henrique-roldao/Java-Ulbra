package com.company.math;

import java.util.Random;

public class exerc03 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valorAleatorio = aleatorio.nextInt((10 - 5) + 1) + 5;
        System.out.println("A quantidade de números na senha é: " + valorAleatorio);

        for (int i = 0; i < valorAleatorio; i++) {
            int senha = (int)(Math.random()*10);
            System.out.print(senha);
        }
    }
}

        /* 3 - Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random.
        Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma quantidade de
        dígitos correspondentes ao valor aleatório gerado. Apresente em tela o número sorteado e a senha. */