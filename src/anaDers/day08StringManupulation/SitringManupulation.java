package anaDers.day08StringManupulation;

import java.util.Scanner;

public class SitringManupulation {
    public static void main(String[] args) {
        //kullanıcıdan aldıgın ismin ilk harfini ve son harfini yazdırın..Ramazan -->Rn
        //1.yoll
        Scanner input = new Scanner(System.in);
        //System.out.println("isminizi giriniz");
        //String isim= input.next();

        //char ilkHarf=isim.charAt(0);

        // char sonHarf=isim.charAt(isim.length()-1);//yazdıgınız kod sadece bazı durumlar için calışırsa o koda ; "Hard Coding" denir
        //System.out.println(""+ilkHarf+sonHarf);     //yazdığınız kod her durum için calışırsa " Dynamic coding" denir

//2.yoll substring:bir stringin içindeki string demek:Ramazan:substring(0,5);"amaz"(1 hahil oluyo 5. index dahil değil)
        //tring ilk= isim.substring(0,1);
        // String son = isim.substring(6,7); // 6 dersek hard coding olur. o yüzden 6 yerine son index yazılır. ve 7 yazmaya da gerek yok
        //
        // String son = isim.substring(isim.length()-1);
        // System.out.println(ilk+son);

        //ex 2 :verilen string de hayvan isimlerini ekrana yazdırınız
        //       "Ben kedi, eşim tavuk, oğlum sever inek  "

        String str="Ben kedi, eşim tavuk, oğlum sever inek";
        String kedi=str.substring(4,8);
        String tavuk=str.substring(15,20);
        //String inek=str.substring(34,38);//sadece 34 yazarsak java inek kelimesinin hepsini alır
        String inek=str.substring(34) ;
        System.out.println(kedi + tavuk + inek);
        //substring() in iki kullanimi vardir.
        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar


//ex 3: ilk isim ve soyisimi içerren isimlerden ilk ve soyisimlerin başharflerini ekrana yazdırınız
        //Ali Can                Tahsin Yurdakul
        System.out.println("ilk ve soyismizi giriniz");
        String tamIsim=input.nextLine();
        String a =tamIsim.substring(0,1);
        String b=tamIsim.split(" ")[1].substring(0,1);//split ismi keser.bize 1 kısım laızm diye 1 yazdık
        System.out.println(a+b);
    }
}




