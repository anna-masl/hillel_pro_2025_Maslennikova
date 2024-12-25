package org.example.lesson1;

public class
Main {
    private static final double CONV_K = 2.20462;
    public static void main(String[] args) {
        System.out.println("Convert App.");
        double kgs = 10;
        double pnds = 15;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + " pounds and " + kilos + " kgs.");

    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }
}