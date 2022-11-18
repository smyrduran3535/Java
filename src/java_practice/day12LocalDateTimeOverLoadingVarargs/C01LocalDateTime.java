package java_practice.day12LocalDateTimeOverLoadingVarargs;

import java.util.Scanner;

public class C01LocalDateTime {
    public static void main(String[] args) {
        //kullanıcıdan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dogdugunuz ayı string olarak giriniz");
        String ay = scan.nextLine();
        System.out.println("dogdogunuz gun bilgisini giriniz");
        int gun = scan.nextInt();
        String burc = "";
        if (ay.equalsIgnoreCase("Ocak")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "Oglak";
        }
        if (ay.equalsIgnoreCase("Subat")) {
            if (gun > 20)
                burc = " balik";
            else
                burc = " kova";
        }
        if (ay.equalsIgnoreCase("Mart")) {
            if (gun > 21)
                burc = "koc";
            else
                burc = "balık";
        }
        if (ay.equalsIgnoreCase("Nisan")) {
            if (gun > 21)
                burc = "boga";
            else
                burc = "koc";
        }
        if (ay.equalsIgnoreCase("Mayıs")) {
            if (gun > 22)
                burc = "ikizler";
            else
                burc = "boga";
        }
        if (ay.equalsIgnoreCase("haziran")) {
            if (gun > 23)
                burc = "yengec";
            else
                burc = "ikizler";
        }
        if (ay.equalsIgnoreCase("temmuz")) {
            if (gun > 23)
                burc = "aslan";
            else
                burc = "yengec";
        }
        if (ay.equalsIgnoreCase("agustos")) {
            if (gun > 23)
                burc = "basak";
            else
                burc = "aslan";
        }
        if (ay.equalsIgnoreCase("eylul")) {
            if (gun > 23)
                burc = "terazi";
            else
                burc = "basak";
        }
        if (ay.equalsIgnoreCase("ekım")) {
            if (gun > 23)
                burc = "akrep";
            else
                burc = "terazi";
        }
        if (ay.equalsIgnoreCase("kasım")) {
            if (gun > 22)
                burc = "yay";
            else
                burc = "akrep";
        }
        if (ay.equalsIgnoreCase("aralık")) {
            if (gun > 22)
                burc = "oglak";
            else
                burc = "yay";
        }
        System.out.println(gun +" "+ ay+" " + "tarihinde dogduysanız"+burc);
    }
}


