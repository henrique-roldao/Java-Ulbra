package com.company.tdeArray;

public class exerc04 {
    public static void main(String[] args) {
        /* Escreva um programa que crie um String e use um laço for para verificar
        se ele é um palíndromo, ou seja, se você inverter a ordem dos caracteres do
        String, obterá o mesmo String. Por exemplo, “abcdcba” é um palíndromo. */
        ehPalindromo("socos");
        ehPalindromo("ama");
        ehPalindromo("ovo");
        ehPalindromo("doidera");
    }

        static void ehPalindromo(String palindromo){
            for (int i = 0; i < palindromo.length(); i++) {
                if (palindromo.charAt(i) != palindromo.charAt((palindromo.length() - 1) - i)) {
                    System.out.println("Não é um palindromo");
                    return;
                }
            }
            System.out.println("É um palindromo");
        }
    }

