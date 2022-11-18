package java_practice.day14_inheritanceencapsulation;

public class KumandaRunner {
    public static void main(String[] args) {
Test tv= new Test(102.10,80.00,40.45);
tv.gucDugmesi();//kumanda ile tvyı ac
        System.out.println(tv.kanakDegidtirme(2));//45.23
        System.out.println(tv.sesArttırma());//12
        System.out.println(tv.sesAzaltma());//11
    }
}
