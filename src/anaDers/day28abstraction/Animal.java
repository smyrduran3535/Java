package anaDers.day28abstraction;

public abstract class Animal {
    //body si olmayan metodlar abstract method olarak adlandırılırlar access modifier ile return typein arasına abstract yaz
    //bir method'u abstract yapmak icin;
    // 1)method body i sil
    // 2)"abstract " yaz
    //3-"absract method"lar abstract class icinde olmalı
    /*
bir method "parent class" da "abstract method" ise;
 Child Class o methodu "override" edip kullanmak zorundadır.
bu yuzden herhangi bir fonksiyonu "child class" icin mecburi yapmak isterseniz
o methodu "abstract" yapmalısınız.Child Class icin o metod mecburi olur artık
 */
    public abstract void eat();

    //abstaract class larda hemde abstract class hemde "concrete(non-abstract)" method kullanılabilir
    public void drink(){
        System.out.println("Animals drink...");
    }
    public abstract void move();//void yapmak zorunda deiliz,access de degisebilir

}
