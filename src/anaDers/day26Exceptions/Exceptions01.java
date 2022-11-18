package anaDers.day26Exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//128

        String st = "1a2b";
        int r = convertStringToInteger(st);//int verecegi icn atama yapıyoruz.eger icinde rakamdan farklı karakter barındıran
        // bir stringi valuOf metodu kullanarakInteger a cevirmek isterseniz NumberFormatException alirsiniz
        System.out.println(r + 10);
    }

    public static int convertStringToInteger(String str) {
        int i = 0;
        try {
            //herhangi bir satırda exception atılırsa java direkt "catch" bolumune geecer,try icindeki sonraki kodları calıstırmaz
            i = Integer.valueOf(str);//int verecek
            System.out.println("burası try bolumu");//pozitif senaryo(happy seneryo)=satir calisir :123 icin

        } catch (NumberFormatException e) {//negatif senaryo
            System.out.println("rakam olmayan karakterler iceren Stringler Integer a cevrilemez");
        }
        return i;
    }
}