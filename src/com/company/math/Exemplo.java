package com.company.math;

import java.text.DecimalFormat;
import java.util.Locale;

public class Exemplo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.ceil(10.9));
        System.out.println(Math.ceil(10.2));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.2));
        System.out.println(Math.round(10.9));
        System.out.println(Math.round(10.2));
        System.out.println(Math.max(10, 11));


        Locale l = Locale.getDefault();
        DecimalFormat numero = new DecimalFormat();
        double n1=2.1515;
        double n2=20.234;
        double n3=20;

        if (l.getCountry().equals("BR")){
            numero.applyPattern("R$ ###,###.00");
        } else {
            numero.applyPattern("USS ######.00");
        }

        System.out.println(numero.format(n1));
        System.out.println(numero.format(n2));
        System.out.println(numero.format(n3));


        String minhafrase= "SOU JAVA TA LIGADO";
        System.out.println(minhafrase.length());
        System.out.println(minhafrase.charAt(0));
        System.out.println(minhafrase.toUpperCase());
        System.out.println(minhafrase.toLowerCase());
        System.out.println(minhafrase);
        System.out.println(minhafrase.substring(9));
        System.out.println(minhafrase.substring(3, 10));

    }
}
