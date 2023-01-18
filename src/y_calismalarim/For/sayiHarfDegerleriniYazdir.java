package y_calismalarim.For;

public class sayiHarfDegerleriniYazdir {
    public static void main(String[] args) {
        //0-255 e kadar olan harflerin , sayi ve harf degerlerini ekrana yazdiriniz
        for (int i = 0; i <256 ; i++) {
            char harf= (char) i;//data casting ile chara donusturduk...sayi harf ve karakter
            System.out.println(i+ " -> "+ harf);
            }
        //while ile;
        int i=0;
        while (i<256){
            char c=(char)i;//casting yaptık
            System.out.println(i+"->"+c);
            i++;
        }
        //do while ile;
        int a=0;
        do{
           char character=(char)a;
            System.out.println(a+" ->"+ character);
           a++;
        }while (a<256);

    }
    }

