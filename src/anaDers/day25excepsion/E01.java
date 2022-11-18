package anaDers.day25excepsion;
/*
1-"exception(istisnai hata)" javada kodlarımızı calıstırırken meydana gelenbeklenmedik durumlardır.
2-exceptionlar ile calısmanın 2 yolu vardır;
a)try-catch blok kullanma ve excepsıon olussa bile calısmayı devam ettirme
b)throw excepsion kullanarak calısmayı durdurma(mesela yazdıgımız kod geregi bir dosya uzerinden okuma yapmamız gerekiyor ise
 bu dosyamız eger silinmis ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmmez)
3-eger exception ı handle etmez isek;java calısmayı durdurur.
4-try-catch kullanırken try kodunu bir yada birden fazla catch kodunu kulalnabiriz
5-try catch olmaksızın yalnız kullanılamaz
6-eger ki yazmıs oldugunuz herhangi bir kod satırında problem olabilecegini dusunuyorsanız;try catch block icine koymalısınız
7-catch block parantezi icersine olması muhtemel exception class ismi yazılır
8-e.getmessage(), metodunu kullanarak teknik mesaj elde ederiz
  Ststem.out.prıntln(); burada yazmıs oldugum teknık mesajlar benım teknık olmayan acıklamalarımdır
  e.printStackTrace();bu metodu Exception ile ilgili detaylıca teknik mesaj verir.kod calısmaya devam eder
  System.err.println();hata mesajını renkli olarak veriyor.bizler hata mesajlarını diger mesajlardan ayırmak isteriz
9-eger try body icindeki kod sorunsuz calısırsa; catch blok devreye girmez.
 */
public class E01 {
    public static void main(String[] args) {
divide(6,2);
divide(0,2);//0
divide(6,0);//exceptıon hatası verir.javanın burda yapacagı bırsey yok.
// matematik problemi.Matematikte bir sayı 0 ile bolunmez

        divide2(5,0);
        divide2(12,0);
    }
    //1.yol:tavsiye edilmez
    //bir devoloper icin tum matematık kurallarını ezbere bilmek mumkun deildir
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("bir sayi sifir ile bolunemez");
        }else
        System.out.println(a/b);
        }//1,yol:try*catch kullanarak exception ı handle etmek tavsiye edilir
    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
            System.out.println("Hi excepsion");
            System.out.println("bye excepsion");
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde biir problem olustu"+e.getMessage());
        }
        //java matematik ile ilgili karsılasılması muhtemel tum istisnaları hataları :ArithmeticException classına koymustur
        //matematikteki tum istisnaları tum detayları bilmek zorunda degiliz

//Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
//1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
// isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
//2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
// try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
// Javanin ne yapmasini istedigimizi yazabiliriz
    }
}
