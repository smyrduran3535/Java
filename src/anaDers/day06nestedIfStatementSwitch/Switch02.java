package anaDers.day06nestedIfStatementSwitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
          /*
        kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("gün numarasını giriniz");
        byte gunNo = input.nextByte();

        //1.yol : if ile cozünuz
        if (gunNo == 1) {
            System.out.println("pazar");
        } else if (gunNo == 2) {
            System.out.println("pazartesi");
        } else if (gunNo == 3) {
            System.out.println("salı");
        } else if (gunNo == 4) {
            System.out.println("çarsamba");
        } else if (gunNo == 5) {
            System.out.println("persembe");
        } else if (gunNo == 6) {
            System.out.println("cuma");
        } else if (gunNo == 7) {
            System.out.println("cumaretsi");
        } else {
            System.out.println("doğru değer girin");

            //2.YOL = SWİCTCH KULLANMA   : if in aynısını yapar kestirme ve basittir

            switch (gunNo) {
                case 1:
                    System.out.println("Pazar");
                    break;

                case 2:
                    System.out.println("Pazartesi");
                    break;
                case 3:
                    System.out.println("Salı");
                    break;
                case 4:
                    System.out.println("çarsamba");
                    break;
                case 5:
                    System.out.println("Persembe");
                    break;
                case 6:
                    System.out.println("Cuma");
                    break;
                case 7:
                    System.out.println("Cumartesi");
                    break;
                default:
                    System.out.println("gecerli gün sayısı yazınız");

            }
        }
    }
}


