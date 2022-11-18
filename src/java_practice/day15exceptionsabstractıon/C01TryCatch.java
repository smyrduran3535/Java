package java_practice.day15exceptionsabstractıon;

public class C01TryCatch {

    public static void main(String[] args) {
        //verilen sayıyı 10 kez bolen kod yazınız
        int sayi1 = 100;
        int sayi2 = 5;
        int sayac = 1;

/*
while(sayac<10){

    System.out.println(sayi1/sayi2);
    sayi2--;//10 kere bolecek sekilde azalacak
    sayac++;//tekrar tekrar islem yapsın diye
}
    }
*/
      /*  System.out.println("***********if else ile******************");
       sayac=1;
        while (sayac<10){
            if (sayi2==0){
                System.out.println("islem yapilirken payda sifir oldu");
            }else {
                System.out.println(sayi1 / sayi2);
            }
            sayi2--;
            sayac++;
        }

       */
        System.out.println("****try-catch ile *******");
        int a=100;
        int b=5;
        int sayac2=1;//0 kez boldu demek mantıklı deıl o yuzden 1 den baslanır

            while (sayac2 < 10) {
                try {
                    System.out.println(a / b);

            } catch(Exception e){
                System.out.println("payda sıfır oldu hata verdi");
                // throw new RuntimeException(e);

            }
                b--;
                sayac2++;
        }

    }
}
