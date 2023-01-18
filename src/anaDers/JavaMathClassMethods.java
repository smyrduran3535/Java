package anaDers;

import java.util.Random;

public class JavaMathClassMethods {
    public static void main(String[] args) {

        int a=-12;
        int b=4;
        System.out.println("a nın mutlak degeri "+Math.abs(a));
        System.out.println("a ve b den en buyuk olani :"+ Math.max(a,b));
        System.out.println("2,6,8 den en buyuk olani :"+ Math.max(2,Math.max(6,8)));
        System.out.println("a ve b den en kucuk olani :"+ Math.min(a,b));
        System.out.println("b nin karekoku :"+Math.sqrt(b));
        System.out.println("2 nin 3. kuvveti :"+ Math.pow(2,3));//pow(taban,us)
        System.out.println("round 3.1 i yuvarla :"+Math.round(3.1));//3
        System.out.println("round 3.5 i yuvarla  :"+Math.round(3.5));//4
        System.out.println("3.1 sayisinin ust tamsayiya yuvarla :"+Math.ceil(3.1));//tavan 4
        System.out.println("3.6 sayisinin ust tamsayiya yuvarla :"+Math.ceil(3.6));
        System.out.println("3.1 sayisinin alt tamsayiya yuvarla :"+Math.floor(3.1));//taban 3
        System.out.println("3.6 sayisinin ust tamsayiya yuvarla :"+Math.floor(3.6));
//Math.random(): double veri tipine sahip olarak algılar ve 0-1 arsında rastgele sayi uretir.


//random() metoduyla rastgele deger uretme:
        double doubleSayi= Math.random()*100;
        System.out.println("doubleSayi"+doubleSayi);

        //random() metoduyla int  deger uretme:
        int intSayi=(int)(Math.random()*100);
        System.out.println("intSayi = " + intSayi);

        int max=20;//bu sayıya kadar sayi uretir max ve min da
        int x=(int) (Math.random()*max);
        int y=(int) (Math.random()*max);
        System.out.println("x value is "+ x);
        System.out.println("y value is "+ y);
        if (x<y)
            System.out.println(x+" is the minimum number");
        else
            System.out.println(y+" is the minimum number");

//java Math.Random kullanimi :
        for (int i = 0; i <10 ; i++) {
            System.out.println("java Math.Random: "+Math.random());
        }
//java.util.Random kullanimi :
        Random rnd=new Random();
        for (int adet = 0; adet <10 ; adet++) {
            int rSayi=rnd.nextInt(100);
            System.out.println("java.util.Random sayi= " + rSayi);
        }











    }

}





