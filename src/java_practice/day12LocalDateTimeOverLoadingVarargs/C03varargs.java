package java_practice.day12LocalDateTimeOverLoadingVarargs;

import static java.util.stream.IntStream.concat;

public class C03varargs {
    public static void main(String[] args) {
        //Varargs kullanarak Verilen Stringleri birlestiren concat() isimli bir method olusturunuz

       concat(  "Safran","bolu","evleri" );




    }
    private  static void concat(String ...str){
        String sonuc=" ";
        for (String w:str) {
            sonuc+=w;
        }
        System.out.println(sonuc+" ");
    }
}
