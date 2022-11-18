package calısmalarım_kitap_youtobe.For;

public class nestedforloop {
    public static void main(String[] args) {

            //inteview: kullanıcıdan string isteyin ve tersten yazdırın

            String str = "Java ne kadar guzel";
            //lezug gibi
            for (int i = str.length() - 1; i >= 0; i--) {//son karakteri yazmak için index sondan baslamalı azalarak
                System.out.print(str.charAt(i));//lezug radak en avaJ :******charAt sadece yazdırır*****
                /*
                l -den j ye kadar length ile azaklarak ters cevrilir
                 */
            }
            System.out.println();
                 //inteview: kullanıcıdan string isteyin ve tersine cevirip "kaydedin"

                 String str1 = "Java her gecen gun guzellesiyor";
                 String tersstr1 = "";//kaydetmek istiyorsak boş string yapıyoruz tersi için********KAYDETMEK İÇİN*****
                 for (int i = str1.length() - 1; i >= 0; i--) {
                     //her bir harfi alıcaz tersstr1 e ekliiycez kaydedip. "+" ekleme yapmazsak sadece tekharf yazdırır
                     tersstr1 += str1.substring(i, i + 1);//harf ekliyoruz
                 }
                 System.out.println(tersstr1);//royisellezug nug neceg reh avaJ



     //***************************nested for loop***************************
     //1-4 arasındaki sayılar için carpım tablosu olusturalım

                 for (int i = 1; i <= 4; i++) {
                     //iç dögü her satırda olan degerleri kontrol eder
                     for (int j = 1; j <= 4; j++) {

                         System.out.print(i * j + " ");
                     }
     //ic döngü bittiginde javayı alt satıra indirmeliyiz
                     System.out.println("");//asagı satıra inmek için hiçlik yazdır
                 }
          /*
          asagıdaki sekli yazdırın bir kod hazırlayın
           * * * * * * *
           * * * * * * *
           * * * * * * *
           * * * * * * *
           * * * * * * *
           * * * * * * *

           */


                 for (int i = 1; i <= 6; i++) {
                     for (int k = 1; k <= 6; k++) {
                         System.out.print("*" + " ");

                     }//iç loop bitince alt satıra her gececek
                     System.out.println("*");//iç loop biterse alt satıra gececek
                 }


                 //örnek

                 for (int i = 1; i <= 4; i++) {//SATIR
                     for (int k = 1; k <= 8; k++) {//SUTUN
                         System.out.print("* ");
                     }
                     System.out.println("");
                 }
     //*******************ÜCGENNNNNNNNN YAPIMI***********************************
             /*
             NEDTED FORLOPP KULL SEKLE
             1
             1 2
             1 2 3
             1 2 3 4
             1 2 3 4 5
              */
                 for (int i = 1; i <= 6; i++) {
                     for (int k = 1; k <= i; k++) {//iç loop hep 1 den baslıyor VE İ'ye sakar gider satır satısına kadar gider
                         System.out.print("* ");

                     }
                     System.out.println("");
                 }

      /*
             NEDTED FORLOPP KULL SEKLE
                      11111
                      1111
                      111
                      11
                      1

              */
                 for (int i = 5; i >= 1; i--) {
                     for (int k = 1; k <= i; k++) {
                         System.out.print("1");
                     }
                     System.out.println("");
                 }


                 for (int i = 10; i >= 1; i--) {
                     for (int k = 1; k <= i; k++) {
                         System.out.print("$  ");
                     }
                     System.out.println("");
                 }

             /*
             1
             2 4
             3 6  9
             4 8  12 16
             5 10 15 20 25
              */
                 for (int i = 1; i <= 5; i++) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print(i * j + " ");
                     }
                     System.out.println("");
                 }

             /*
                   1
                  2 2
                 3 3 3
                4 4 4 4
              */

     /*



     *
     **
     * *
     *  *
     *****

     */
                 int n = 6;
                 boolean bayrak = true;
                 for (int i = 1; i <= n; i++) {
                     for (int k = 1; k <= 2; k++) {

                         for (int j = 5; j <= 5; j++) {
                             System.out.print("*");
                         }
                     }
                     System.out.println("");

            }

        }
    }

