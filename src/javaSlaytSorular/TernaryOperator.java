package javaSlaytSorular;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alın ve büyük olanı yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.println("sayı1 giriniz:");
        int sayı1 = input.nextInt();
        System.out.println("sayı2 giriniz:");
        int sayı2 = input.nextInt();
        System.out.println(sayı1 > sayı2 ? "sayı1 büyük" : "sayı2 büyük");


        //kullanıcıdan bir tam sayı alın ve sayının tek veya çift olduğunu yazdırın
        System.out.println("bir tam sayı giriniz ");
        int tamSayi = input.nextInt();
        System.out.println(tamSayi % 2 == 0 ? "çift sayı" : "tek sayı");

//kullanıcadan bir tam sayı alın mutlak değerini yazdırın

        int d = 25;
        System.out.println(d > 0 ? d : (d * -1));
        //kullanıcıdan bir tam sayı alın negatifse negatif pozitifse pozitif yazd
        System.out.println("sayıyı giriniz");
        int c = input.nextInt();
        System.out.println(c > 0 ? "pozitif" : c * c);

        //kullanıcıdan bir tam sayı alın ve sayı 10 dan küçükse "Rakam",100 den küçükse "iki basamaklı sayı"
        //değilse "üç basamaklı sayı" yaz
        System.out.println("bir sayıyı giriniz ");
        double b = input.nextDouble();
        System.out.println(b < 10 ? "Rakam" : b < 100 ? "iki basamaklı sayı" : "üç basamaklı sayı");

        //kullanıcıdan bir harf isteyin küçük harf ise consola "Kucuk Harf", büyük harf ise konsola "Büyük Harf" yzd.

        System.out.println("harf giriniz");
        char harf = input.next().charAt(0);
        System.out.println(harf==harf? (harf>='a'&&harf<='z'?"Kucuk Harf" : "Kucuk Harf Değil"):harf>='A'&&harf<='Z'?"Büyük Harf":"Büyük Harf değil");

        //2.YOL:TERNARY
        System.out.println((harf >= 'a' && harf <= 'z' ? "Küçük Harf" : "Büyük harf"));
//kullanıcıdan bir sayı alın ve sayı 3 basamaklı ise "üç basamaklı" yazdırın değilse "Uc basamaklı değil" yazd.
        System.out.println("lütfen sayınızı giriniz");
        double sayı = input.nextDouble();

        System.out.println(sayı>99&&sayı<999? "üç basamaklı":"üç basamaklı değil");

        //kullanıcıdan dikdöergenin uzunluğunu ve genişliğini alın girilen degerlere göre kare olup olmadıgına bakın
        System.out.println("uzunlugu giriniz");
        int uzn=input.nextInt();
        System.out.println("genişliği giriniz");
        int genls=input.nextInt();
        System.out.println(uzn==genls?"karedir":"kare değildir");

    }
}

