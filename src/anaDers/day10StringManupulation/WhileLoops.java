package anaDers.day10StringManupulation;

import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        //exAMPLE 3 TEN 10 a kadar tam sayıları aynı satırda ekrana yazdıran cod
        //for ile
        for (int i = 3; i < 11; i++) {
            System.out.print(i + "");
        }
        System.out.println();
//while ile
        int i = 3;
        while (i < 11) {
            System.out.print(i + "");
            i++;
        }
        System.out.println();
//ex:2: 17den 4 e kadar tüm çift sayıları aynı satırda kot

        int k = 17;
        while (k > 3) {
            if (k % 2 == 0)
                System.out.print(k + " ");
            k--;

        }
        System.out.println();
//Ex 3: 12 den 67 ye kadar sayıların toplamını veren codu yaz
        int sum = 0;
        int l = 12;
        while (l < 68) {
            sum = sum + l;

            l++;
        }
        System.out.print(sum);


        //ex 4: size verilen bir tam sayının rakamları toplamını ekrana yazd cod

        int sonuc = 0;
        int sayı = 385;
        while (sayı > 0) {
            sonuc = sonuc + sayı % 10;
            sayı = sayı / 10;
        }
        System.out.println(sonuc);
        System.out.println();

        //ex 5: kullanıcıdan aldıgınız bir sayının carpım tablosunu yaz
        Scanner input=new Scanner(System.in);
        System.out.println("carpım tablosunu görmek için sayı giriniz");
        int s=input.nextInt();
        int n=1;

        while (n<11){
            System.out.println(s+"*"+n+" ="+s*n);
            n++;
        }

    }
}
