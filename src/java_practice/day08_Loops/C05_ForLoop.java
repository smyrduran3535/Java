package java_practice.day08_Loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=input.nextLine();


        System.out.println("kac kere tekrarlanmasını istiyorsanız giriniz");
        int tkrSayisi=input.nextInt();

        String ilkSonHarf=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        String cıktı="";
        for (int i = 1; i <=tkrSayisi ; i++) {
            cıktı+=ilkSonHarf;

        }
        System.out.println(cıktı);
    }
}
