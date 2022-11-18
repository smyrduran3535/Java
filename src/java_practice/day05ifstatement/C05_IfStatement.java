package java_practice.day05ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
        //1.yol
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki sayı girin");
        double sayı1= input.nextDouble();
        double sayı2= input.nextDouble();
        if(sayı1<sayı2){
            System.out.println("büyük olmayan sayı :"+sayı1);
        }else if(sayı1>sayı2){
            System.out.println("büyük olmayan sayı:"+sayı2);
        }else System.out.println("sayılar biribirine esit");


        //2.yol :ternary
        System.out.println(sayı1==sayı2?"sayılar esit":sayı1 > sayı2?sayı2:sayı1);




    }
}
