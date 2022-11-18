package anaDers.day24staticKeyWordAndcapsulation;

public class CarRunner {
    public static void main(String[] args) {

        /*
        static se class a baglanır;kim neye baglanmıssa ona ondan ulasırız.
        static degilse;objeye baglanır
        staticlerde yapılan degisiklik butun objeler tarafından gorulur
        objelerde yapılan degisiklikleri objeler gorur
        her new keywordu bir objedir

        testten note:
        A) Static variable'lara sadece classin ismi kullanılarak da ulaşılabilir.
        B) Static olmayan variable'lara ulaşabilmek için object oluşturmak zorundayız.
        C) Static variable'larin diğer adi class variable'dir. Instance variable'larin diğer adi object
          variable'dir.
        D) Static variable'lar object'lerin ortak kullanımına açıktır fakat instance variable'lar değildir.

         */
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        System.out.println(car1.price);
        System.out.println(car1.counter);
        System.out.println(car2.price);
        //static variablelarar objeleri kullanarak ulasmak mumkun ama tavsiye edilmez
        System.out.println(car2.counter);
        //static variable lara Class ismi kullanarak ulasılabilir
        System.out.println(Car.counter);//classın ismini yazınca counter geldi.;
        /*
        1) Static keyword, class'a bağlanmış class elemanlarıdır.
        static variable/method class'a bağlıdır.
        2) Static class elemanları, tüm objelerin ortak elemanıdır.
        3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
        4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
        Kullanılırsa hata vermez, fakat tavsiye edilmez.
        tüm objelrden görülür.Static class elemanlarına class üzerinde ulaşılır,
        objeler üzerinde ulaşılması tavsiye edilmez.Static ler Override edilemez çünkü tüm objeler bundan etkilenir.

        static keyword nedir?
        static keyword class'a baglanmis class elemanlaridir
        static class elemanlari butun Object'lerin ortak elamanidir.
        static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
        static Class elemanlarina Class uzerinden ulasilir.

        **static olanlar override edilemez
         */

    }
}