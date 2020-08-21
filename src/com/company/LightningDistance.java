package com.company;

public class LightningDistance {
    public static void main (String[] args) {
        int lightningSpeed;
        float distanceRange, distanceFeet;

        lightningSpeed = 1100;
        distanceRange = 7.2f;

        distanceFeet = lightningSpeed * distanceRange;

        System.out.println(distanceFeet + " distance feet's");
    }
}
