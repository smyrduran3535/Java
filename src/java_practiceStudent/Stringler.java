package java_practiceStudent;

import java.util.Scanner;

public class Stringler {
    public static void main(String[] args) {
        for (int i = 4; i >1 ; i--) {
            System.out.print(i);//4 3 2
        }
        System.out.println("");
        //kullanıcıdan 10 dan kucuk bır tam sayı ısteyın ve faktorıyelını bul
        int sayi=9;
        int faktorıyel=1;
        String faktorıyelAcıkYazımı="";
        for (int i = sayi; i >=1 ; i--) {
            faktorıyel*=i;//faktorıyel =faktorıyel*i
            if(i==faktorıyel){
                faktorıyelAcıkYazımı=faktorıyelAcıkYazımı+i;

            }else faktorıyelAcıkYazımı=faktorıyelAcıkYazımı+"*"+i;

        }
        System.out.println(sayi+"! ="+faktorıyelAcıkYazımı+"="+faktorıyel);

        //kullanıcıdan iki tam sayı alın ve bu sayıları ve aralarındandaki tum tam sayıları yazdıran kod olust
        int baslangıc=40;
        int bitis=60;
        for (int i = baslangıc; i <=bitis; i++) {
            System.out.print(i+" ");//40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60
        }
//while ile;
        int c=baslangıc;
        while(c<=bitis){
            System.out.print(c+" ");//40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60

            c++;
        }
        System.out.println();
        //3 ile 9 arasındakı tam sayıların carpımını bulan kodu yaz
        //istenilen kosul saglanırsa en az bir kere calısır

        //1,yol
        int m=1;
        for (int i=3;i<10;i++) {
            m = m * i;
        }
        System.out.println(m);

      //2.yol
      int a =1;
      int b=3;
      while(b<10){
          a=a*b;
          b++;
      }
        System.out.println(a);

      //3.yol:
        int x=1;
        int y=3;
        do{
            x=x*y;
            y++;
        }while(y<10);
        System.out.println(x);

        // while loop kullanarak 3 basmaklı sayılardan 15,20,ve 90 a tam bolunelebılen sayıları yaaz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen uc basamaklı sayı gırınız");
        int sayı=scan.nextInt();

        int bolen=1;
        int sayac=0;
         while(bolen<=sayı) {


             if (sayı % bolen == 0) {
                 System.out.println(bolen + " ");
                 sayac++;
             }
             bolen++;
         }
        System.out.println("");
        System.out.println(sayı+ " sayısını bolen"+ " " + sayac+ "adet sayı vardır ");
    }
}
