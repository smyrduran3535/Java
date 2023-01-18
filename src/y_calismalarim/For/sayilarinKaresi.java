package y_calismalarim.For;

import java.util.Scanner;

public class sayilarinKaresi {
    /*
    kullanıcıdan 1'den buyuk tamsayi girmesini isteyin.
    ve 1 'den girilen tam sayıya kadar olan sayilarin karelerin topl
    girilrn sayı:4
    kareler toplamı :14
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=input.nextInt();
        int karelerTopl=0;
        for (int i = 1; i <sayi ; i++) {
            karelerTopl+=(i*i);

        }
        System.out.println("kareler toplami "+ karelerTopl);
    }
}
