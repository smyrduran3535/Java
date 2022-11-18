package anaDers.day13LoopsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        //ex 1 :kullanıcıdan bir sayı alınız sayı 100 den küçük ise ekrana kadandın yazd.aksi halde "kaybettin "yaz
        //kullanıcı kazandıkça oyun devam etmeli
        Scanner input=new Scanner(System.in);
        int sayi=0;

        do{
            System.out.println("bir sayı giriniz");
            sayi= input.nextInt();
            if(sayi<100){
                System.out.println("kazandınız");
            }
        }while(sayi<100);//100 den büyük yazınca döngü durur sart sağlamıyor diye kırılır ve kazanmadınız yazar
        System.out.println("kaybettiniz");


//ex 2:kullanıcıdan ismini alınız ilk harfinin büyük olup olmadığını kontrol ediniz

        do{
            System.out.println("isminizi girirn");
            char ilkHarf=input.next().charAt(0);
            if(ilkHarf>='A'&&ilkHarf<='Z'){
                System.out.println("ismi basarıyla girdiniz");
            }else {
                System.out.println("ismi yanlış girdiğiğniz için iptal");
                break;
            }
        }while(true);



//infinite loop:sonsuz döngü : loop oluşturuken sonsuz döngü oluşturma.
// cod calıştığında memory dolmaya baslar. memory dolması bitince cod durur ve tehlikelidir.bilgisayarı da bozabilir

//for(int i=1;i<4 ;i--){
//    System.out.println("Hi"); //sonsuz döngü bu calıştırma. sonsuz loopu i++ yaparsan düzelir
        //arttırma azalma kısmında hata yaparsanız infinite loop sorunsalı oluşur

        //   for(int i=1;i<4 ;){//sürekli hi yazar. 1<4 sürekli sorar sünkü artırma azalma kısmına bişey yazmazsak süreli sonsuz loop oluşur.
        //çünkü loop gelir ; sorar napıcam diye arttırma azaltma görmeyince tekrardan 1<4 gelir sürekli aynı seyi yazdırır
//    System.out.println("Hi");


        /*
        int i=12;
        while(i<15){
            System.out.println(" Hi");
            //7 artırma /azaltma kısmını yazmazsan infnite loop oluşur.eksiklertamamla calıştırmasan önce
}

         */





    }
}