package anaDers.day06nestedIfStatementSwitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //NOTE: switch de sadece int byte short ve string data tipleri kullanılabilir.long- boolean- double -float kullanamazsın
        // eger; 3 ten fazla durum varsa swithc tercih eder süleyman hoca


         /*
        kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucu ekrana yazdıran basit bir hesap makinesi yapınız
         */


        Scanner input = new Scanner(System.in);
        System.out.println("işlemi giriniz :+,-,*,/,%");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayıyı giriniz ");
        double ilk= input.nextDouble();
        System.out.println("ikinci sayıyı giriniz ");
        double ikinci= input.nextDouble();
        switch (islem){

            case'+':
                System.out.println(ilk+ikinci);
                break;
            case'-':
                System.out.println(ilk-ikinci);
                break;
            case'*':
                System.out.println(ilk*ikinci);
                break;
            case'/':
                System.out.println(ilk/ikinci);
                break;
            case'%':
                System.out.println(ilk%ikinci);
                break;
            default:
                System.out.println("doğru işlem giriniz");



        }
    }
}


