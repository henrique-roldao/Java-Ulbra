package com.company.math;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        double valorProduto, valorFinal;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println("Para encerrar o programa digite 0");
        do {
            System.out.println("Informe o valor do produto: ");
            valorProduto = lerValor.nextDouble();
            valorFinal = valorProduto * 1.12;

            System.out.println("O valor do produto reajustado é: "
                    + df.format(valorFinal));
        } while (valorProduto != 0);
    }
}