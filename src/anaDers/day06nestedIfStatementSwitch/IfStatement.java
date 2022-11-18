package anaDers.day06nestedIfStatementSwitch;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
            /*
       //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)---- tanımlanmamıs evre
         kullanıcıdan yas degerini alan ve yasın hangi evrede oldugumgıdaki tabloya göre yaz.
         */
// bu soruda küçükten büyüğe başlamak lazım..
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen yasınızı girin:");

        byte yas = input.nextByte();
        if (yas < 0) {// - degerler unutulmus bu yuzden biz ekledik
            System.out.println("gecerli yas giriniz");
        } else if (yas <= 4) {
            System.out.println("bebek");
        } else if (yas <= 12) {
            System.out.println("cild");
        } else if (yas <= 20) {
            System.out.println("genç");
        } else if (yas <= 30) {
            System.out.println("yetişkin");
        } else {
            System.out.println("tanımlanmamış evre...");// Boundary value analyze test=
            // sınır-deger-analiz=sınır değerlerini analiz etme
        }

    }
}


