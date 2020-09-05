package com.company.tdeArray;

public class exerc03 {
    public static void main(String[] args) {
        /* Declare duas maneiras de declarar um array unidimensional de 12 doubles. */

        Double [] formOne = new Double[12];

        Double [] formTwo ={1.0,2.0,3.5,4.6,5.6,6.6,7.6,8.6,9.8,10.1,11.2,12.3};

        for (int i=0; i< formTwo.length; i++) {
            System.out.println(formTwo[i]);
        }
    }
}
