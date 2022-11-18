package anaDers.Day18arrayListPassByValue;

public class PassByValue01 {

    //  Gomlek  = 100TL
    //  Ogrenci = -10TL ==> 90TL
    //  Gazi    = -20  ==> 80TL
    // Orjinal deger bozmamak icin ....
        /*
        1- Java variable larin orjinal degerlerini korumak ister.
        2- Variable methodlar icinde kullanildiginda, java methodun icine orjinal degeri koymaz
            ve lmethod'a o kopyayi yollar.
            Method kopya ustunde degisiklik yapar dolayisi ile variable'in orjinal degeri korunmus olur
            Bu sisteme "Pass By Value" denir...
            Note": Java Pass By Value kullanir.
                Bazi programlama diller orjinal degeri kontrol altina almamistir.
                Bu isi developar lara birakmistir..
                Bu tarz dillere Pass by Referance kullanir..
         */
    public static void main(String[] args) {
        int x = 5;  // Gomlek ..
        System.out.println(x); //5
        // static method olan main method'un icindeki hersey statik olmalidir.
        change(x);
        System.out.println(x); // 5
        int ucret = 100;
        ucret =indirim(ucret);//90
        int kopya = indirim(ucret); // 90 indirimli fiyat
        System.out.println(kopya);  // 90
        System.out.println(ucret);  // 100  orjinal degismedi
    }
    public static void change(int a){
        System.out.println(a*3);
    }
    //void disindaki "return" type larda method badisi icinde "return" keyword kullanilmalidir.
    public static int indirim(int gomlek){
        return gomlek - 10;
    }
}

