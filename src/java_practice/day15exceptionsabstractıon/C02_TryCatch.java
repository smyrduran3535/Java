package java_practice.day15exceptionsabstractıon;
import java.util.InputMismatchException;
import java.util.Scanner;
public class C02_TryCatch {
    /*
      /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
     */
    public static void main(String[] args) {
        String[] urunler = {"Et", "Sut", "Findik", "Fistik"};
        Scanner input;
        int index = 0;
        boolean flag = true;//hatalı veri girince durdurur false yazarak
        while (flag) {//true olduug surece calısır
            try {
                input = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira numarasini giriniz ");
                index = input.nextInt();
                flag = false;//false oldugunda bayrak havaya kalktiginda code duracak
            } catch (InputMismatchException e) {//hatalı veri girdiginde bu exc ını atar(-,*,_,? gibi)
                e.printStackTrace();
            }
        }
        try {
            System.out.println(urunler[index]);//dukkanda olmayan buyuk bir sayı(veri) girdıyse bu handle edilir
        } catch (ArrayIndexOutOfBoundsException e) {//urunlerın sınırını astıgında
            System.out.println("girdiginiz deger 0 ile 3 arasinda olmali");
            e.printStackTrace();
        }
    }


    }

