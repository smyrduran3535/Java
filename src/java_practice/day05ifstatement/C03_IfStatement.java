package java_practice.day05ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {


    //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
    // asagidaki degerlere gore cevap yazdirin.
    //Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
    //10000 – 20.000 arasinda ise "Konusabiliriz",
    //10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin
    Scanner input=new Scanner(System.in);
        System.out.println("lütfen maaş için bir teklif veriniz");
    double teklif= input.nextDouble();
        if(teklif>=20000){
        System.out.println("kabul ediyorum");
    } else if (teklif>=10000&&teklif<=20000) {
        System.out.println("konuşabiliriz");
    }else System.out.println("maalesef kabul edemem");


}
}
