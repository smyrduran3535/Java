package anaDers.day27exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 /*
        1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosya' ya git dedik, Java
           iki endise'ye kapildi i)Ya adres yanlissa   ii)Ya verilen adreste dosya yoksa.
           Biz "method isminden" sonra, "throws(atmak demek) FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
           olusursa "Exception At" dedik.

        2) while((k = fis.read()) != -1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosya'daki
          karakterleri oku dedik. Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse...
          Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik.

        3) Method isminden sonra "throws IOException" yazarsaniz Java "throws FilNotFoundException" i siler. Cunku;
           "IOException", "FileNotFoundException" i kapsar. "IOException", "FileNotFoundException" in parent'idir, onun yaptigi
           herseyi yapabilir o yuzden "IOException" varken "FileNotFoundException"a gerek yoktur.FileNotFoundException:sadece dosyayı bulur;dosya bulunamadı hatasıdır

          "IOException", "Input Output Exception" demektir.

          Exception atan metod()lar main icinde kullanıldıklarında mutlaka throws IOEXCEPTION yazmak zorundayız yoksa hata alırız.

         4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
            Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari  "Checked Exception"  dir.

           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling:butun sıkıntıları duzeltmek demek),
           halletmeden code yazmaya devam etmeyiniz.
     */


public class Exceptions02 {
    public static void main(String[] args) throws IOException {// readTheTextFromTheFile() throws IOException metod exc. attıgı icin;
        // mainin icinde kullanınca main tarafından da exc. atılması lazım yoksa ses cıkmaz
        readTheTextFromTheFile();


    }

    //bir text file daki text'i okuyan kodu yazınız?
    public static void readTheTextFromTheFile() throws IOException {//eger adres yanlıssa beni ara ; dosyayyı bulamazsan beni ara
        FileInputStream fis = new FileInputStream("src\\anaDers\\day27exceptions\\File1.txt");//bu adresteki dosyaya git deriz
        //dosyadan data almak icin kull:FileInputStream
        //bu dosyayı oku demek icin while loop kullanıcaz
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        // IOException;FileNotFoundException'ın parent'ıdır. parent oldugu yerde child a is dusmez...

    }

    //2.way:java ya beni ara demiyoruz; hata olustugunda ne yapacagını soyluyoruz
    public static void readTheText() {//bu metodu mainden cagırdıgımızda throws IOException yazmasak bile maine hata vermez
        try {
            FileInputStream fis = new FileInputStream("src\\anaDers\\day27exceptions\\File1.txt");//burda problem varsa; catch (FileNotFoundException e) yap
            int k = 0;
            while ((k = fis.read()) != -1) {//burda prob varsa;(IOException e) bunu yap deriz
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanın adresi veya varlıgı ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }
    }

        }
















































































