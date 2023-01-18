package calısmalarım_kitap_youtobe.For;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // 2 basamaklı sayıların aralarında bir bosluk bırakacak yayana yazdırın

        for (int i = 10; i <100 ; i++) {
            System.out.print(i+" ");
        }
        // while loop
        System.out.println("");
        int a=10;

        while(a<100){
            System.out.print(a+" ");
            a++;
        }

/*
kullanıcıdan toplamak üzere tam sayılar alın. kullanıcı 0 a basarsa sayı alma işini bitirin.
kullanıcının kaç sayı girdiğini ve bu sayıların toplamının kaç oldugunu yaz
 */
        System.out.println();
        Scanner input=new Scanner(System.in);

        int girilenSayı=5;//verilen ilk değer bu soru için 0 olmamalı.istediğin degeri ver
        // çünkü 0 for loop u bitirmek için kulalnılır
        int sayac=0;
        int toplam=0;
        while(girilenSayı!=0){
            System.out.println("lütfen toplamak için tam sayı girin"+"\nnitirmek için 0 a basınız");
            girilenSayı=input.nextInt();

            if(girilenSayı!=0){
                sayac++;
                toplam=toplam+girilenSayı;
            }
        }
        System.out.println("girilenSayı"+sayac+"adet sayının toplamı"+ toplam);

      /*
      kullanıcıdan toplanmak üzere sayı alın
      sayıların toplamı 500 e esit olur veya gecerse
      girilen sayi adeti,
      girilen sayıların toplamı,
      "bu kadar yeter" yazdırın
       */
        Scanner input1=new Scanner(System.in);
        int sayiGirilen=0;
        int adet=0;

        while(toplam<500){
            System.out.println("toplamak için sayı giriniz");
            sayiGirilen=input1.nextInt();
            toplam+=sayiGirilen;
            adet++;

        }
        System.out.println("girilen"+ adet+ "sayının toplamı:"+toplam+"oldu."+"bu kadar yeter");
    }












    }

