package java_practice.day09_NestedForLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str=scan.nextLine();
        for (int i = 0; i <str.length() ; i++) {//ifadenin karakterlerine bakıldı
            if(str.charAt(i)=='a'||str.charAt(i)==' '){
                continue;//ifadede a ya da '' olursa atla der

            }
            System.out.println(str.charAt(i));

        }
    }
}
