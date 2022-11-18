package java_practice.day12overradingOverloadingStaticKet;

import static anaDers.Day18arrayListPassByValue.Varargs01.toplama;

public class C02Overloading {
    public static void main(String[] args) {
        //aynı class da aynı ısımde metod olusturmak icin signature degistirilir
        cikarma(98, (float) 52.666);
        cikarma(14.5, 3);
        toplama(55, 66);
        toplama(55.45, 66.45);
        carpma(2.0, 3);
    }//main

    //1.yol
    private static void carpma(int i, int i1) {
    }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cıkarma yontemi:" + (v - i));
    }

    private static void cikarma(int i, float v) {
        System.out.println("int bir deger ile float cıkarma yontemi " + (i - v));
    }

    private static void toplama(int a, int b) {
        System.out.println(a + b);
    }

    private static void toplama(double a, double b) {
        System.out.println(a + b);
    }

    private static void carpma(double c, int g) {
        System.out.println(c + g);
    }

    //2.yol:parametrelerin sayısı arttırılarak yapılan overloading
    private static void toplama(double a, double b, double c) {
        System.out.println(a + b + c);
    }
    private static void toplama(double a, double b, double c,double d){
        System.out.println(a + b + c+d);
    }
    //3.yol : parametrelerin yerlerini degistirerek Fakat birbirinden fafrklı olmalı
    private static void toplama(double a, int b, double c) {
        System.out.println(a * b * c);
    }

}

