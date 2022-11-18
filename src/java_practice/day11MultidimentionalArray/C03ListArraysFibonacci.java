package java_practice.day11MultidimentionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03ListArraysFibonacci {
    public static void main(String[] args) {
        /*
     INTERWIEW
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
        List<Integer> fibonacci=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayi= scan.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayi<=1){
            System.out.println("lutfen 1 den buyuk bır sayı gırınız");
        }else {
            while (fibonacci.get(i)<sayi){
                fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));//bir onceki eleman ile topladık
                i++;//bir basamak ilerlesin
            }
           if (fibonacci.get(fibonacci.size()-1)>sayi){//fibonaccide yer almıyorsa
               fibonacci.remove(fibonacci.size()-1);//son elemanı sil
               System.out.println("girdiginiz sayi fibonaccide yer almıyor .girilen sayiya kadarki fibonacci:"+fibonacci);
            }else{
               System.out.println("girdiginiz sayi fibonacci sayisidir");
           }


        }

    }
}
