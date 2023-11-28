package com.mycompany.degiskenler;
public class FloatAndDoubleVeriables {
    public static void main(String[] args) {
        System.out.println("Float Max Value && Float Min Value: " + Float.MAX_VALUE + " --- " + Float.MIN_VALUE);
        System.out.println("Double Max Value && Double Min Value: " + Double.MAX_VALUE + " --- " + Double.MIN_VALUE);
        // int --> float --> double
        // double S1 = 5.25d;
        // double S2 = 4.0d;
        // float S3 = (float)(S1 + S2);
        // System.out.println("Toplam Sonuç: " + S3);
        // float S1 = 5.25f;
        // float S2 = 4.0f;
        // double S3 = (S1 + S2);
        // System.out.println(S3);
        // int S1 = (22 / 7);
        // float S2 = (22f / 7f);
        // double S3 = (22d / 7d);
        // System.out.println(S1);
        // System.out.println(S2);
        // System.out.println(S3);
        // int S1 = 5;
        // float S2 = S1;
        // double S3 = S2;
        // System.out.println(S1);
        // System.out.println(S2);
        // System.out.println(S3);
        double S1 = 70.25d;
        double S2 = 60d;
        double S3 = 80.2d;
        System.out.println("Ortalama: " + (float)(S1 + S2 + S3) / 3);
    }
}
