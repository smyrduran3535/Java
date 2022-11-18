package java_practice.day06nestedif;

import java.util.Scanner;

public class C04_SwicthCase {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        //BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Pazartesi :1 \t Sali : \t Carsamba :3 \t Persembe :4 \t Cuma :5 \t Cumartesi :6 \t Pazar :7\n" + "" +
                "Haftanın kacıncı gününde oldugunuzu giriniz");
        int kacinciGun = input.nextInt();
        if (kacinciGun <= 0 || kacinciGun > 7) {
            System.out.println("hatalı veri girdiniz");
        } else {
            System.out.println("kac gün sonrasını bilmek istiyorsun");
            int kacGunSonrasi = input.nextInt();
            int bulunanGun= (kacGunSonrasi + kacinciGun) % 7;
            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Salı");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Çarsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Cumartesi");
                    break;
                case 0://7 nin 7 ye bölümünden kalan 0 dır.o yüzden 7 yazmadık
                    System.out.println(kacGunSonrasi+"gün sonra günlerden Pazar");
                    break;
                default:
                    System.out.println("lütfen geçerli bir sebep yazınız");
            }
        }
    }
}
