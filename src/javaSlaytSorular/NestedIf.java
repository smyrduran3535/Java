package javaSlaytSorular;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        /*
        kullanıcıdan artık yıl olup olmadığı kontrol etmek için yıl girmesini isteyiniz
        kural 1: 4 ile bölünemeyen yıllar artık yıl değildir
        kural 2:4'ün katı olmasına ragmen 100 ile bölünebilen yıllardan sadece 400 ün katı olan yıllar artık yıldır
         */
        Scanner input=new Scanner(System.in);
        System.out.println("yılı giriniz ");
        double leapYil= input.nextDouble();;
        if(leapYil%100==0){
            if(leapYil%400==0){
                System.out.println("artık yıl");
            }else System.out.println("artık yıl değil");

        }else if(leapYil%100!=0){
            if(leapYil%4==0){
                System.out.println("artık yıl");
            }else System.out.println("artık yıl");
        }

    }
}
