package java_practice.day05ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı pozitif giriniz :");
        int yas = scan.nextInt();
        if (yas >= 65) {
            System.out.println("emekli olabilirsiniz");
        }    else {
            System.out.println("emekli olamazsın");
            System.out.println(65 - yas + "sene daha calışmalısın");
        }

// nested if else
        if(yas>=0){
            if(yas>=65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsın");
                System.out.println(65-yas+ "sene daha calışmalısın...");
            }
        }else{
            System.out.println("lütfen sıfırdan buyuk bir sayı giriniz");
        }




    }
}

