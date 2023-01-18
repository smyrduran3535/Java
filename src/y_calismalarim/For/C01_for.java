package calısmalarım_kitap_youtobe.For;


public class C01_for {
    public static void main(String[] args) {
        //verilen bir Stringi tersine cevire
        //verilen bir sayadan 1 den tum tam sayıları toplayın
        //veilen bir tam sayının rakamları toplamını bulun
        //kullabıcının verdiği satıları, toplam 500 oluncaya kadar toplayın
        //kullanıcının verdiği sayıarı kullanıcı tamam diyene kadar topla

        for (int i = 1; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
/*
1 den 100 e kadar olan tamsayıları toplayın
 */
        int sum = 0;
        for (int i = 1; i <= 101; i++) {
            sum += i;

        }
        System.out.print(sum + " ");

/*
verilen iki sayının ilkinden baslayıp ikinciye kadar
3 er 3 er bolünebilen sayıları yazdırın
 */
        int bas = 20;
        int bitis = 61;

        for (int i = bas; i <bitis; i+=3) {


            System.out.print(i + " ");//20 23 26 29 32 35 38 41 44 47 50 53 56 59 21


        }
        System.out.println();
        /*
        verilen sayıdan baslayarak geriye 1 e doğru 3 ile bölünebilen sayıları yazdırın
         */int input=100;

        for (int i = input; i >=1 ; i--) {

            if(i%3==0){
                System.out.print(i+" ");     //99 96 93 90 87 84 81 78 75 72 69 66 63 60 57........... 6 3
            }
        }



        /*  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>H A T A L A R<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        1.sonsuz loop:
        eğer ilk deger atamasından sonra ,degerler bitirme sartina yaklaşmıyorsa,loop boys sonsuz calışacaktır
        for(İNT İ= 1; İ>0; İ++){
        System.out.prıntln(i +" " )
         }


        2.hata

        for(  int i = 1; i > 10 ; i++;){
        System.out.prıntln(i +" " )
        }
         hiç calışmayan loop body: baslangıc degeri bile bitis kosulunu saglamıyorsa ,
         loop body saglamıyorsa, loob body' si hiç calısmayacaktır
         */


        /*
        2 basamaklı sayılardan 7 ile bölünebilenleri yanyana yazdırın
         */
        for (int i = 10; i <=99 ; i++) {
            if(i%7==0){
                System.out.print(i+" ");//14 21 28 35 42 49 56 63 70 77 84 91 98
            }
        }
        System.out.println();
        /*13 ten baslayarak 100 e kadar 7 ser 7ser arttırıp yazd

         */

        for (int i = 13; i <100 ; i+=7) {
            System.out.print(i+" ");//13 20 27 34 41 48 55 62 69 76 83 90 97
        }

        System.out.println();
/*1 den 10 kadar sınırlar dahil sayıların karelerini yazdıralım

 */

        for (int i = 1; i <=10 ; i++) {


            System.out.print(i*i+" ");//1 4 9 16 25 36 49 64 81 100
        }

        /*kullanıcının verdiği sayının faktöriyelini bulalım

         */
        int sayi=10;
        int faktoriyel =1;
        for (int i = sayi; i >=1; i--) {
            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel+" ");// 3628800


        /*1 den 100 e kadar olan sayilari topl

         */

        int sum1= 0;
        for (int i = 1; i <=100 ; i++) {
            sum1=sum1 +i;
        }
        System.out.println(sum1);//5050


        /*rakamlar toplamı: kullanıcının verdiği sayının rakamlar toplamını bulun

         */

        int sayi1=10001;
 int birlerBasamagı=0;
        int rakamlarToplamı=0;

        for (int i = 1; i <=5 ; i++) {

            birlerBasamagı=sayi1%10;

            rakamlarToplamı=rakamlarToplamı+birlerBasamagı;

            sayi1=sayi1/10;
        }
        System.out.println(rakamlarToplamı);




        //stringe cevirirsek lentgh'i buluruz
        int sayi3=123546;
        String sayistr=""+sayi3;
        int birlerBasamagı1=0;
        int rakamlarToplamı1=0;

        for (int i = 0; i <=sayistr.length() ; i++) {
            birlerBasamagı1=sayi3%10;
            rakamlarToplamı1=rakamlarToplamı1+birlerBasamagı1;
            sayi3=sayi3/10;

        }
        System.out.println(rakamlarToplamı1);//21


        /*
        NOT:
        1= condition i'nin tüm degerleri için hep true oluyorsa
        for(int i=0; i>-10 ; i++){
        sout()i;sonsuz loop


        ilk deger için bitiş sartı true olmuyorsa
        for body si hiç devreye girmez
            for(int i=0;i>10;i++){
        sout(i)
         */
        /*
        bir loop'u beklemeden bitirmek istersek
         */
        //kullanıcının verdiği bir sayının asal olup olmadıgını bulun

        int sayi4=103;
        int asal=0;
        for (int i = 2; i <=sayi4-1 ; i++) {
            if(sayi4 % i==0){
                asal++;
                break;
            }
        }
        System.out.println(asal);
        if(asal==0){
            System.out.println("asal");
        }else System.out.println("asal değil");

    }
}


