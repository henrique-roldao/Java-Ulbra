package com.company;

import java.util.Scanner;

public class AposentadoriaCalc {

            public static void main(String[] args) {
                int idade; int qtdAnos;
                char sexo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = input.nextInt();
        System.out.println("Digite a quantidade de anos");
        qtdAnos = input.nextInt();
        System.out.println("Digite o sexo");
        sexo = input.next().charAt(0);
    }
}
