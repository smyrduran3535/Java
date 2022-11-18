package java_practice.day12LocalDateTimeOverLoadingVarargs;

public class C04varargs {
    public static void main(String[] args) {

        a1(true, false, true, true);
        System.out.println("a1" + a1(true, false, true, true));
        a2(1, 2, 3, 4, 5, 6);
    }

    private static int a2(int i, int i1, int... i2) {
        System.out.println(i2.length);
        return i2.length;
    }

    private static int a1(boolean b, boolean b1, boolean b2, boolean... b3) {
        return b3.length;
    }
}






