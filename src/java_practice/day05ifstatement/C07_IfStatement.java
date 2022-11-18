package java_practice.day05ifstatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan dortgenin kenar uzunluklarini isteyin
//ve dikdortgenin kare olup  olmadigini yazdirin
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen 1. kenar uzunlugunu giriniz");
        int kenar1= input.nextInt();
        System.out.println("lütfen 2. kenar uzunlugunu giriniz");
        int kenar2= input.nextInt();
        System.out.println("lütfen 3. kenar uzunlugunu giriniz");
        int kenar3= input.nextInt();
        System.out.println("lütfen 4. kenar uzunlugunu giriniz");
        int kenar4= input.nextInt();

        if(kenar1==kenar2&&kenar2==kenar3&&kenar3==kenar4){
            System.out.println("bu cisim bir karedir");
        }else
            System.out.println("kare değildir");

    }
}