package tekrarlarim;

public class Varargs {//variable argument in kısaltımı

    public static double ortalama(int... a) {//int ...a : burda array calisiyor arka planda
        int counter = 0;
        int sum = 0;
        int ortalama = 0;
        for (int w : a) {//arka planda array calısıtgı icin kullanabilir
            counter++;//her deger girdigimde arttır=girdigimz deger sayısı
            sum+=w;//vermis oldugumuz deger kadar arttırsın: girdigimiz degerlerin toplamı
            ortalama = sum / counter;
        }
        return  ortalama;
    }
    public static double cikar(double a,double ...b){
        double sonuc=a;
        for (double w:b){
            sonuc-=w;

        }
        return sonuc;
    }
    public static void topla(int a,int b){
        System.out.println(a+b);
    }
}
