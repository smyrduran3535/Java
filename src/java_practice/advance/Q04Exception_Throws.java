package java_practice.advance;

public class Q04Exception_Throws {
    /*
     randomSayi isminde bir method oluşturunuz.
     Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
     Bu iki random sayının toplamını yazdırın.
     Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
     ("Sayı 12'den küçük ise hata verir") yazdırın.
       */
    public static void main(String[] args) throws Exception {
        rastgeleSayi();//her calıstırdıgımızda farklı sayı verir


    }

    public static void rastgeleSayi() throws Exception {
        int a = (int) (Math.random() * 11);//11 ile carpmak demek carpmadan once max:0,999 verir bize 1 vermez 10 vermez bu metod.
        // biz de0 ile 10 arsında sayı elde etmek icin 11 yazdık. 0 ile 1 arasında deger verir random metodu
        int b = (int) (Math.random() * 11);
        System.out.println(a + "--" + b);
        System.out.println(a + b);//exceptıon atar
        if (a + b < 12) {
            throw new Exception("Sayı 12'den küçük ise hata verir");
        }
    }
}
