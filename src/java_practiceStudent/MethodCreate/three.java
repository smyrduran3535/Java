package java_practiceStudent.MethodCreate;

import java.util.Scanner;

public class three {

         /*
        Kullanıcıdan pozitif bir tam sayı al ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, return eden method'u oluşturunuz.12345---15----6
        Örnek1:
        Girdi 38
        Çıktı: 2
        Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamaklı olduğundan, bunu döndürün.
        */
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Lütfen bir pozitif tamsayı giriniz: ");
            int sayi=input.nextInt();
            //1.yol:
            System.out.println("Girdi: "+sayi+"\n"+"Çıktı: "+dongu(sayi));
            //2.yol:
            System.out.println("Girdi: "+sayi+"\n"+"Çıktı: "+alternatif(sayi));
        }
        public static int dongu(int sayi){//12345
            while (sayi>=10) {
                sayi = rakamlarinintopla(sayi);
            }return sayi;
        }
        public static int rakamlarinintopla(int sayi){//3+8=11----1+1=2
            int topla=0;
            int rakam=0;
            while(sayi>0){
                rakam=sayi%10;
                topla+=rakam;
                sayi/=10;
            }return topla;
        }
        public static int alternatif(int sayi){
            sayi=sayi%9;
            if(sayi%9==0){
                sayi=9;
            }
            return sayi;
        }

    }
