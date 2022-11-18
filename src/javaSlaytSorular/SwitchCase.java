package javaSlaytSorular;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //kullanıcıdan haftanın kaçıncı günü olduğunu7 sorun ve gün ismini yaz
        Scanner input = new Scanner(System.in);
        System.out.println("haftanın gününün ne olduğunu giriniz");
        String gun = input.nextLine().toLowerCase();
        switch (gun) {
            case "pazartesi":
                System.out.println("1.günü");
                break;
            case "salı":
                System.out.println("2.günü");
                break;
            case "carsamaba":
                System.out.println("3.günü");
                break;
            case "perşembe":
                System.out.println("4.günü");
                break;
            case "cuma":
                System.out.println("5.günü");
                break;
            case "cumartesi":
                System.out.println("6.günü");
                break;
            case "pazar":
                System.out.println("7.günü");
                break;
            default:
        }
        //KULLANICIDAN KAÇINCI AY OLDUGUNU SOR VE İSMİNİ YAZD.
        System.out.println("ay ismini giriniz");
        String ay = input.nextLine().toLowerCase();
        switch (ay) {
            case "ocak":
                System.out.println("1.ay");
                break;
            case "şubat":
                System.out.println("2.ay");
                break;
            case "mart":
                System.out.println("3.ay");
                break;
            case "nisan":
                System.out.println("4.ay");
                break;
            case "mayıs":
                System.out.println("5.ay");
                break;
            case "haziran":
                System.out.println("6.ay");
                break;
            case "temmuz":
                System.out.println("7.ay");
                break;
            case "ağustos":
                System.out.println("8.ay");
                break;
            case "eylül":
                System.out.println("9.ay");
                break;
            case "ekim":
                System.out.println("10.ay");
                break;
            case "kasım":
                System.out.println("11.ay");
                break;
            case "aralık":
                System.out.println("12.ay");
                break;
            default:
        }
     /*
     kullanıcıdan bir tam sayı girmesini isteyin
    girilen sayı
    10 ise iki basamaklı en kucuk sayı
    100 ise üç basamaklı en kucuk sayı
    1000 ise dört basamaklı sayı
    diğer durumlarda ise "girdiğin sayıyı değiştir" yaz

      */
        System.out.println("10,100,1000 sayı değerlerinden birini giriniz");
        int sayı = input.nextInt();

        switch (sayı) {
            case 10:
                System.out.println(10 + "iki basamaklı en kucuk sayı");
                break;
            case 100:
                System.out.println(100 + "üç basamaklı en kucuk sayı");

                break;
            case 1000:
                System.out.println(1000 + "dört basamaklı en kucuk sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir");
                break;
        }


    }
}


