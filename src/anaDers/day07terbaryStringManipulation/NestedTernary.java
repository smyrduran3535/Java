package anaDers.day07terbaryStringManipulation;

public class NestedTernary {
    public static void main(String[] args) {

            //verilen yılın "Leap Year" olup olmadığını kontrol eden kodu yaz
            //yıl 100e bölünürse 400e de bölünmelidir==> 1600+   1800-
            //yıl 100 e bölünmezse 4 bölünmelidir 0==>1996+    2001-

            int year=2001;
            String Leap= year%100==0 ? (year%400==0 ? "leap year" : "leap year değil") : (year%4==0 ? "leap year" : "leap year değil");
            System.out.println(Leap);
/*EX: asagıdaki kurallara göre gecerli olup olmadıgını konrol ediniz.
        8 karakterden fazla karakter veya sekiz karakter  varsa küçük harfi 'i' olmalıdır
8 karakterden az karakter varsa ilk harfi 'K' olmalıdır
//  length stringdeki karakterleri sayar
 */
            String pwd="i2a3ed54";
            char ilkHarf=pwd.charAt(0);
            String gecerli= pwd.length() >8?(pwd.charAt(0)=='K' ?"geçerli":"geçersiz"):(pwd.charAt(0)=='i'?"geçerli": "geçersiz");
            System.out.println(gecerli);

            String pwd1="K2a3";
            char ilkHarf1=pwd.charAt(0);
            String gecerli1= pwd.length() <8?(ilkHarf1=='K' ?"geçerli":"geçersiz"):(ilkHarf1=='i'?"geçerli": "geçersiz");// '' old için string kullanmadık.
            // charlarda == kullanılır
            System.out.println(gecerli1);
        }
    }


