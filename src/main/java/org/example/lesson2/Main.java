package org.example.lesson2;

public class Main {
    private static final double CONV_K = 1.60934;
    public static void main(String[] args) {
        System.out.println("Convert App.");
        double kms = 10;
        double mls = 10;
        double kilometers = convMlToKms(mls);
        double miles = convKmToMls(kms);
        System.out.println("Result is: " + kilometers + " kilometers and " + miles + " miles.");
    }

    private static double convKmToMls(double kms) {
        return kms / CONV_K;
    }

    private static double convMlToKms(double mls) {
        return mls * CONV_K;
    }
}
