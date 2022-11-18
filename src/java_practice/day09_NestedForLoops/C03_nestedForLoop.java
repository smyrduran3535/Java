package java_practice.day09_NestedForLoops;

import java.util.Scanner;

public class C03_nestedForLoop {
    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
    /* tac uzunlugu -> 6 iken

       ^
       ^^
       ^^^
       ^^^^
       ^^^^^
       ^^^^^^
       |||
       |||
       |||
       |||
       |||


*///benım cozumum
        for (int i = 1;  i<7 ; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print("|"+" ");
            }
            System.out.println();
        }
        //hocanın cozumu
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen agacın tac uzunlugunu gırınız");
        int tacUzunluk= input.nextInt();
        String yaprak="";

        for (int i = 0; i <tacUzunluk ; i++) {
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("|||");
        }
    }
}
