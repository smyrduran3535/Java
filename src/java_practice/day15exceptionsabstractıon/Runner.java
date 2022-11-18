package java_practice.day15exceptionsabstractıon;

import static java_practice.day15exceptionsabstractıon.Kayit.counter;

public class Runner {
    public static void main(String[] args) {
        Kayit obj =new Kayit();
        obj.kayit();
        System.out.println(counter+"kac kez kullanıcı girisi yapildi");
    }
}
