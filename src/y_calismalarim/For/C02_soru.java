package ycalısmalarım_kitap_youtobe.For;

public class C02_soru {
    public static void main(String[] args) {
        /*
        kullanıcıdan pozitif bir sayı alıp, 1 den baslayarak tüm tam sayıları yazdırın
        -3 ile bölünebilen bir sayıya gelirse,sayı yerine fizzz
        -5 ile bölünebilen bir sayıya gelirse,sayı yerine buzz
        hem 3 hem 5 ile bölünebilen bir sayıya gelirse,sayı yerine fizzbuzz yazdırın
         */
        int sayi=130;
        for (int i = 1; i <sayi ; i++) {

            if(i%3==0&&i%5==0){
                System.out.print(" fizzBuzz ");
            }else if(i%3==0){
                System.out.print("fizzz  ");
            }else if(i%5==0){
                System.out.print("buzz  ");
            }else System.out.print(i+" ");
        }System.out.print(sayi);







    }
}
