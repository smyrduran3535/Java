package java_practiceStudent.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        /*
 Rastgele kullanici adi olusturan JAVA kodu yaziniz.
 *  1. Kullanici isimlerinin oldugu listemiz olsun.
 *  2. Kullanicidan ismini isteyelim
 *  3. Kullanicinin girecegi ismin onunde ve sonunda bosluklar olmasin.
 *  4. Kullanici adinin alinabilir olup olmadigina bakalim.
 *  5. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
 *  6. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup bunu kullaniciya sunalim.
 */

        List<String> list=new ArrayList<>();
        list.add("Esra");
        list.add("Sumeyra");
        list.add("Cumali");
        list.add("Ebru");
        list.add("Mehmet");
        Random rnd=new Random();//rastgele sayı atayabiliriz istedigimiz oranda
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcı adını gırınız");
        String kullanici=scan.nextLine().trim();

        if(list.contains(kullanici)){
            kullanici=kullanici+rnd.nextInt(1000);//int sayı=(int)(Math.random()*10000)
            System.out.println("kullanıcı adıyla daha once alınmıstır"+ kullanici+" bu adı kullanabilirsiniz");
        }else
            System.out.println("kullanıcı adınız basarıyla olusturulmustur"+kullanici);

    }
}
