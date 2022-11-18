package java_practice.day10Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
      /*
INTERWIEW QUESTIONS
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str = scan.nextLine();
//split metodu ile parcala
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        //sort metodu ile sırala
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;//ayni harflerse bir artir
            } else {
                System.out.println(arr[i - 1] + "karakter sayisi" + (counter + 1));
                counter = 0;//her seferinde counter ı 0 la. farklı karaktere gectigi icin
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "karakterini sayisi" + (counter + 1));
            }

        }
    }
}
