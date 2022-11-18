package java_practice.day01_variables02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //


//1.adım
        // Scanner scan=new Scanner(System.in);
        //2.adım
        System.out.println("");
//3.adım : uygun variable a kullan
        //double


//Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçapını giriniz");
        double r= scan.nextDouble();
        System.out.println("cemberin çevresi :"+2*314*r/100);
        System.out.println("dairenin alanı =" +314*r*r/100);

//

        Scanner scanner=new Scanner(System.in);
        System.out.println("uzun kenar giriniz");
        int uzun= scanner.nextInt();
        System.out.println("kısa kenar giriniz");
        int kısa= scanner.nextInt();
        System.out.println("alan ="+uzun*kısa);
        System.out.println("cevre ="+2*uzun*kısa);
       */
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin kisa kenarini giriniz: ");
        double kisaKenar=scan.nextDouble();
        System.out.println("Lutfen Dikdortgenin uzun kenarini giriniz: ");
        double uzunKenar=scan.nextDouble();
        System.out.println("Dikdortgenin Alani= "+4*kisaKenar*uzunKenar);
        System.out.println("DikdortgeninCevresi: "+ kisaKenar*uzunKenar);*/

/*
Scanner input=new Scanner(System.in);
        System.out.println("üçgen 1.kenarları girin");
byte kenar1= input.nextByte();
        System.out.println("üçgen 2.kenarları girin");
        byte kenar2= input.nextByte();
        System.out.println("üçgen 3.kenarları girin");
        byte kenar3= input.nextByte();
        System.out.println("cevre:"+ (kenar2+kenar3+kenar1));

// baska yol ile
        System.out.println("Lutfen ücgenin kenar uzunluklarını sırasıyla giriniz...");
        byte kenara =input.nextByte();
        byte kenarb = input.nextByte();
        byte kenarc = input.nextByte();
        System.out.println("Ucgenin cevresi:" +(kenara+kenarb+kenarc));



// Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char ch = scan1.next().charAt(0);
        System.out.println("  " + ch + "  ");//2 boşluk var"  "
        System.out.println(" " + ch + " " + ch + " ");//aralarda bir boşluk(" ") vardır
        System.out.println(ch + " " + ch + " " + ch);//aralarında 1 boşluk var" "
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Lutfen * isaretini giriniz: ");

        String ch = input.next();

        System.out.println("   "+ch +"\n" +" "+ch  +"   "+ch + "\n"+ch+"  "+ch +"  " +ch);

       */


    }
}
