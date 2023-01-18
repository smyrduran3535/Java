package y_calismalarim.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Random_isimEkleme {

        public static void main(String[] args) {
            /*
             * 1-Rastgele Kullanici adi olusturan JAVA kodu yaziniz
             * 2-Kullanici adindaki bosluklari silelim
             * 3-Kullanici adinin alinabilir olup olmadigina bakalim
             * 4-Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi,kullanicinin girdigi isim olsun
             * 5-Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim ve gosterelim
             */

            //once list olusturmamız lazım 3.adımı test etmek icin data base i olusturmaliyiz
            List<String> dataBaseIsimler=new ArrayList<>();
            dataBaseIsimler.add("Sumeyra");
            dataBaseIsimler.add("Esma");
            dataBaseIsimler.add("Canan");
            dataBaseIsimler.add("Zehra");
            dataBaseIsimler.add("Huriye");
            dataBaseIsimler.add("Ayse");
            System.out.println("dataBaseIsimler = " + dataBaseIsimler);

            //simdi kullancıdan isim alalim
            Scanner input=new Scanner(System.in);
            System.out.println("kullanmak istediginiz username i giriniz");
            String username=input.nextLine().trim();//boslukları silip rakam eklemek icin

            boolean usernameVarmi=dataBaseIsimler.contains(username);
            if (usernameVarmi){
                System.out.println("bu kullanici adi zaten alinmis ");
            }else
                System.out.println("bu kullanici adini kullanabilirsiniz");
            if (usernameVarmi){
                int randomSayi=new Random().nextInt(100);
                username = username+""+randomSayi;
                System.out.println("yeni kullanici adiniz : "+ username );
                dataBaseIsimler.add(username);
                System.out.println("dataBaseIsimler = " + dataBaseIsimler);
            }else {
                System.out.println("yeni kullanici adiniz :"+ username );
            }
        }


















    }



















