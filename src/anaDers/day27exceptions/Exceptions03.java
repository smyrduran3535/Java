package anaDers.day27exceptions;

/*     1)Java Exception'lar olusturarak Developer'larin Java kurallarina uymalarini temin etmistir.
       2)Biz de Application uretirken kendi Exception'larimizi olusturarak diger developer'larin bizim ortaya koydugumuz kurallara uymalarini temin ederiz.
       3)Java'nin degil, bizim urettigimiz Exception'lara "Custom Exception" denir.
       4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
       5)Custom "RuntimeException" uretmek icin "extends RuntimeException" deriz
       6)Custom "CompileTimeException" uretmek icin "extends Exception" deriz              */

public class Exceptions03 {
    public static void main(String[] args) throws IllegelGradeException {
printGrade(20);

checkNameFormat("ali");//exc atar
checkNameFormat("Ali");//exc atmaz
    }//ogrenci notlarını yazdiran bir metod olusturnuz

    public static void printGrade(double grade) throws IllegelGradeException {
        if (grade<0||grade>100){//ise exc.at diycez;
            throw new IllegelGradeException("grade 0 dan az 100 den cok olamaz");

        }else {
            System.out.println(grade);
        }
    }
    //verilen ismin ilk harfinin buyuk harf olmaması durumunda Exception atan metod yaziniz
    public static boolean checkNameFormat(String name){//unchecked exception
        if (name.charAt(0)>='A'&&name.charAt(0)<='Z'){
            return true;//ilk harf buyuk harf ise return true kabul et degilseexc at bizim urettigimiz
        }else{
            throw  new IllegalNameException("isimler buyuk harfle baslamalıdır");
        }
    }
}
