package com.company.tdeArray;

public class exerc02 {
    public static void main(String[] args) {
        /*Já que todos os strings são objetos de tipo String, mostre como chamar os métodos length( ) e charAt( ) neste literal de string: “I like Java”.*/

        String string = "I like Java";

        System.out.println(string.length());

        for (int i=0; i<string.length(); i++) {
        System.out.println(string.charAt(i));
        }
    }
}
