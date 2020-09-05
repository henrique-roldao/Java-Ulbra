package com.company;

public class TesteTrecho {
    public static void main(String[] args) {
        int m=0; int n=2;

        while (n>0) {
            m=++m-n;
            n--;
        };
        System.out.println(m);
    }
}
