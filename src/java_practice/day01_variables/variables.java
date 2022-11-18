package java_practice.day01_variables;

public class variables {
    public static void main(String[] args) {
        // Java.day01_variables;
        // public class C02_Variables {

        String okulIsmi="Techpro";
        System.out.println("okulIsmi = " + okulIsmi);
        char ilkHarf='K';
        System.out.println("ilkHarf = " + ilkHarf);
        int sayi1=20;
        System.out.println("sayi1 = " + sayi1);
        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Ahmet Can
        //  soyisminiz : Ates
        //  seklinde yazdirin
        String isim="Ahmet Can";
        String soyIsim="Ates";
        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short deger1=10;
        int deger2=20;
        System.out.println("Iki farkli data turunun toplami : "+ (deger1+deger2));

        int toplam=deger1+deger2;
        System.out.println("toplam = " + toplam);
        //4- Bir tamsayi ve bir ondalikli variable olusturun bunlarin toplamini yazdirin
        int deger3=40;
        double deger4=0.8;
        System.out.println("deger4+deger3 = " + (deger3+deger4));
        //5 – char data turunde bir variable olusturun ve yazdirin
        char sembol='*';
        System.out.println("sembol = " + sembol);
        //6- bir tamsayi ile bir harfi toplayiniz.
        int deger5=20;
        char harf='m';
        //1YOL
        int toplam1=deger5+harf;
        System.out.println("toplam1 = " + toplam1);
        //2.YOL
        System.out.println("deger5 = " + (deger5+harf));
    }//main
}//class

