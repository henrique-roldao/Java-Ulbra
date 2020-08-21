package com.company;

import java.util.Scanner;

public class ProdutoScanner {
    public static void main(String[] args) {

        int valorProduto, porcentagemDesconto, valorDesconto;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor do Produto: R$");
        valorProduto = teclado.nextInt();

        System.out.println("Porcentagem do desconto: "+"%");
        porcentagemDesconto = teclado.nextInt();

        valorDesconto = valorProduto - ( valorProduto * porcentagemDesconto / 100 );

        System.out.println("Valor do produto é R$"+valorProduto + " com desconto de " + porcentagemDesconto +"%");
        System.out.println("Valor final: $"+valorDesconto);
    }
}