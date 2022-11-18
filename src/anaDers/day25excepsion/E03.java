package anaDers.day25excepsion;

public class E03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumOfChars(str);//3 leght

        String s="";//atama operatoru oldugu icin:0
        String a;//null
        getNumOfChars(s);//0

        String t=null;//length metodunda null kullanılırsa: "nullponterexcepsion" verir
        getNumOfChars(t);//hata verir:excepsion

    }
    //bir String de bulunan karakterlerin sayısını bulabılmek ıcın bır metod olusturunuz
    public static void getNumOfChars(String str){
try{
    System.out.println(str.length());
}catch (NullPointerException e){
    System.out.println("length(); metodunda bir problem olustu");
    e.printStackTrace();
    //bu metodu kullandıgınız zaman System çoutçprintln kullanmanıza gerek yok


}

    }
}
