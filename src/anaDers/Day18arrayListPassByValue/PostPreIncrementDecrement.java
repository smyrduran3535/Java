package anaDers.Day18arrayListPassByValue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        //Post Increment
        int b = a++;
        System.out.println(b); // 5   == > once a yi gordugu icin a nin ilk degeri olan 5 i atadi sonra artidi.
        System.out.println(a); // 6       java anlamlı bır cumle buldugunda uygular
        //Pre Increment
        int c = 10;
        int d = ++c;
        System.out.println(d); // 11     ++ yi ocne gordugu icin c yi artirdi d ye atadi...
        System.out.println(c); // 11
        //Post Decrement
        int e = 20;
        int f = e--;
        System.out.println(f); // 20
        System.out.println(e);  // 19
        // Pre Decrement
        int h = 30;
        int i = --h;
        System.out.println(h); // 29
        System.out.println(i); // 29
    }
}
