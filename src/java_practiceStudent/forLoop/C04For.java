package java_practiceStudent.forLoop;

import java.util.Scanner;

public class C04For {
    public static void main(String[] args) {
 /*
        Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
        Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
        için bir kod yazınız.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Armstron sayisi olup olmadigini konrol etmek icin bir sayi giriniz");
        int n=scan.nextInt();
        int sumOfCube=0;
        int tepm=n;
        int digit=0;
       while(n>0){
          digit=n%10;
          sumOfCube=sumOfCube+digit*digit*digit;


           n=n/10;
       }
       if (tepm==sumOfCube){
           System.out.println(tepm+"Amstrong sayisidir");
       }else{
           System.out.println(tepm+"Amstrong sayisi degildir");
       }

    }
}
