package anaDers.day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
"throw" ile "throws" arasındaki fark nedir?
1-)"throws" method body'si icinde kullanılır."throws" ise methoun isminden sonra kullanılır
2-)"throw" dan sonra object olusturulur. "throws" dan sonra ise sadece Exception Class'in ismi yazilir.
3-) "throw" methodun icinde istedigimiz yerde "Exception" üretmek icin kullanilir.
"throws" ise var olan checked (Compile Time) Exception'i atmak icin kullanilir.
Yani "throw" Exception üretir. "throws" var olan Exception'i atar.
4-)"throw" dan sonra sadece 1 tane Exception olabilir.
   "throws" dan sonra 1 den fazla Exception olabilir.
      --------
      RunTime larda throws kullanılmaz.
      Compile time larda Throws kullanılır
 */
public class ReadFileLineByLine {
    public static void main(String[] args) {
/*
bunun bir onceki okumadan farkı satır satır okuyor. bır onceki kac karakter varsa o kadar okuyordu.
karakter karakter okumaktan daha iyidir bu metod.line !=null demek:null degilse yazdır demek
eger bosluk olursa satır satır okumada java onu okur;karakter kaarkter okuma da okumaz
 */
        readFileLineByLine();
    }

    public static void readFileLineByLine() {
        //dosya okumak icin; input output kutuphanesinde
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\anaDers\\day27exceptions\\File1.txt"));//parametre ile calısacak; filereader objesiyle calısır.new demek obje uretmek demek
            String line = br.readLine();//string verecegi icin string olusturduk.====>>>>>>1.satırı okuyor.atama opr 2. yada baska bir satırı oku deseydik peki nasıl olurdu ? alıp line nın icine koyucak
            while (line != null) {
                System.out.println(line);
                line = br.readLine();//satır bos degilse yazdırcak ve bir sonraki satıra gecicek;
            }//butun satırlar bittiginde readline null verecek ve loop kırılacak;
        } catch (FileNotFoundException e) {
            System.out.println("ya path yanlis ya da dosya silinmis" + e.getMessage());
        } catch (IOException e) {
            System.out.println("okunamayacak karakter veya karakterler var" + e.getMessage());
        }
    }
}
