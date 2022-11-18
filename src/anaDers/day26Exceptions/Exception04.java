package anaDers.day26Exceptions;
/*
exceptionlar iki bolumden olusur run time exception ve compile time exception.
     Run-Time exception:run tusuna bastıktan sonra farkederiz(unchecked)       Compile-Time Exception:kodu yazarken farkederiz(checked)
1-ArithmeticException                                                           1-
2-NullPointerException                                                          2-
3-ArrayIndexOutOfBoundsException
4-IllegalArgumentException
5-NumberFormatException

 */
public class Exception04 {

    public static void main(String[] args) {
        //yası ekrana yazdıran bir method olusturun
        int age=-25;
        try{
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }

    public static void printAge(int age) {
       /* if (age > 0) {//if else kullanırsak durduramıyoruz uygulamayı o yuzden ıf else kullanmayız exp. da
            System.out.println(age);
        } else System.out.println("yas negatif olamaz");
        */
        if (age<0||age>200){
            throw new IllegalArgumentException("yas negatif olamaz");
        }
          System.out.println(age);//- yası kabul etmeyecek.bu kuralı da biz yazıyoruz:age.message yazınca bu kural karsımıza cıkıyor

    }//metodun icinde exc uretme hangi senaryolarda kullanılır?
    //kurallar olusturmak ıcın
    //gun hayatta yasak fakat java icin yasak olmayan seyler olunca metod ıcıne exct atmak gerekir
    //senin kuralın olup jsavanın kuralı olmayınca exception atmak gerekebilir
}