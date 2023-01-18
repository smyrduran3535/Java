package calısmalarım_kitap_youtobe.MethodOlusturma;

public class parametreAlanAlmayan {
    static void metod1(){
        System.out.println("bu metod parametre almıyor ve deger dondurmuyor");
    }
    static int metod2(){
        System.out.println("bu metod parametre almıyor fakat deger donduruyor");
        return 5;
    }
    static void metod3(int a){
        System.out.println("bu metod parametre alıyor fakat deger dondurmuyor"+a);
    }
    static int method4(int x){
        System.out.println("bu metod parametre alıyor ve degeer donduruyor"+x);
        return x;
    }
    public static void main(String[] args) {
        metod1();
        metod2();
        metod3(5);
        method4(15);
    }

}


