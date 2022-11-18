package java_practice.day08_Loops;

public class C02_ForLoop {
    public static void main(String[] args) {


   /* Interview Question
    Kullanicidan 100’den kucuk bir tamsayi isteyin.
      1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
    Ancak;
      - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
      - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
      - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
 */
        int sayi = 30;
        for (int i = 1; i <= sayi; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(" java guzeldir ");
            } else if (i % 3 == 0) {
                System.out.print(" java ");

            } else if (i % 5 == 0) {
                System.out.println(" guzeldir ");
            }else System.out.print(i+" ");
        }
    }
}