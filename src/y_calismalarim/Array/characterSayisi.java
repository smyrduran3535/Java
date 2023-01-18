package y_calismalarim.Array;

import java.util.Arrays;

public class characterSayisi {


    public static void main(String[] args) {
/*
verilen bir cumledeki bosluklar haric karacter sayisini bulunuz
Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
 */

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str = str.replaceAll(" ", "");
        System.out.println("str = " + str);
        String[] c = str.split("");
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        System.out.println("karakter sayisi : " + c.length);

        //bosluk sayisi:
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[] bosluk = str1.split(" ");
        int boslukSayisi = bosluk.length - 1;
        System.out.println("boslukSayisi = " + boslukSayisi);
    }
}


















