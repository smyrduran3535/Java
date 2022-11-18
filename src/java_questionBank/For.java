package java_questionBank;


import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
        1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız
         */
        String s = "";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + "";
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //while
        int a = 120;
        String x = "";
        while (a > 10) {
            if ((a % 4 == 0 && a % 6 == 0)) {
                x = x + a + "";
            }

            a--;
        }
        System.out.print(x + "");
        System.out.println();

        //do while loop
        int i1 = 120;
        String p = "";
        do {
            if (i1 % 4 == 0 && i1 % 6 == 0) {
                p = p + i1 + "";
            }
            i1--;
        } while (i1 > 10);
        System.out.print(p + " ");

/*
) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories -------> ces
 */
        String tekrar = "accessories";
        String c = "";
        for (int j = 0; j < tekrar.length(); j++) {
            String d = tekrar.substring(j, j + 1);
            if (tekrar.indexOf(d) != tekrar.lastIndexOf(d)) {
                if (!c.contains(d)) {
                    c = c + d;
                }
            }
        }
        System.out.println(c);
        //while ile;
        String tekrar1 = "accessories";
        String c1 = "";
        int k1 = 0;
        while (k1 < tekrar1.length()) {
            String d1 = tekrar1.substring(k1, k1 + 1);
            if (tekrar1.indexOf(d1) != tekrar1.lastIndexOf(d1)) {
                if (!c1.contains(d1)) {
                    c1 = c1 + d1;
                }
            }
            k1++;
        }
        System.out.println(c1);

        //do while;
        String tekrar2 = "accessories";
        String c2 = "";
        int i2 = 0;
        do {
            String d2 = tekrar2.substring(i2, i2 + 1);
            if (tekrar2.indexOf(d2) != tekrar2.lastIndexOf(d2)) {

                if (!c2.contains(d2)) {
                    c2 += d2;
                }
            }
            i2++;
        } while (i2 < tekrar2.length());
        System.out.println(c2);

        /*
          Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
          aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
         */
        String w = "anna";
        String ters = "";

        for (int j = w.length() - 1; j >= 0; j--) {
            String sd = w.substring(j, j + 1);
            ters = ters + sd;
            if (w.equals(ters)) {
                System.out.println(w + " " + "palindrom");
            } else {
                System.out.println(w + " " + "palindrom degildir");
            }
        }
        System.out.println(ters);

        //while;
        String w1 = "runnur";
        String trs = "";
        int j = w1.length() - 1;
        while (j >= 0) {
            String sdr = w1.substring(j, j + 1);
            trs += sdr;
            if (w1.equals(trs)) {
                System.out.println(w1 + " polindrom");
            } else System.out.println(w1 + " polindrom degil");
            j--;
        }
        System.out.println(trs);

//do while ile;

        String w2 = "runnur";
        String trs1 = "";
        int i4 = w2.length() - 1;
        do {
            String c3 = w2.substring(i4, i4 + 1);
            trs1 += c3;
            if (w2.equals(trs1)) {
                System.out.println(w2 + "polindrom");
            } else System.out.println(w2 + " polindrom degil");
            i4--;
        } while (i4 >= 0);
        System.out.println(trs1);


        /*
        4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37
         */

        int rakam = 223878;
        String str = String.valueOf(rakam);

        String st = "";
        for (int k = 0; k < str.length(); k++) {
            String n = str.substring(k, k + 1);
            if (str.indexOf(n) == str.lastIndexOf(n)) {

                st += n;
            }
        }
        System.out.println(st);//37

// while:
        int rkm = 223878;
        String str1 = String.valueOf(rkm);
        String st1 = "";
        int i5 = 0;
        while (i5 < str1.length()) {
            String n1 = str1.substring(i5, i5 + 1);
            if (str1.indexOf(n1) == str1.lastIndexOf(n1)) {
                st1 += n1;
            }
            i5++;
        }
        System.out.println(st1);
        System.out.println();
        //do while loop
        i5 = 0;
        do {

            String m = str1.substring(i5, i5 + 1);
            if (str1.indexOf(m) == str1.lastIndexOf(m)) {
                st1 += m;
            }
            i5++;
        } while (i5 < str1.length());
        System.out.println(st1);

/*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                                    A A A A A
                                    A A A A A
                                    A A A A A
                                     */

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.print("A");
            }
            System.out.println("");
        }
        System.out.println();
//while
        int i6 = 1;
        while (i6 <= 3) {
            for (int i = 1; i < 6; i++) {
                System.out.print("A");
            }
            i6++;
            System.out.println();
        }
        System.out.println();

//do while loop

        int i7 = 1;
        do {
            for (int i = 1; i < 6; i++) {
                System.out.print("A ");
            }
            i7++;
            System.out.println();
        } while (i7 <= 3);

      /*
      ) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                                     A
                                     A A
                                     A A A
                                     A A A A
       */
        int baslangıc = 1;
        int bitis = 4;
        for (int i = 1; i <= bitis; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("A ");
            }
            System.out.println();
        }

        //while ile:
        int basla = 1;
        int bit = 4;
        while (basla <= bit) {
            for (int i = 1; i <= basla; i++) {
                System.out.print(" A ");
            }
            basla++;
            System.out.println();
        }
        System.out.println();
        //do while loops ile:
        int bas = 1;
        int bitt = 4;
        do {
            for (int i = 1; i <= bas; i++) {
                System.out.print("A ");
            }
            bas++;
            System.out.println();
        } while (bas <= bitt);

/*
         Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
         3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=3
 */
        int sabit = 3;

        for (int i = 1; i < 11; i++) {
            System.out.print(sabit + "x" + i + "=" + sabit * i);
            System.out.println();
        }
        //while ile;
        int sbt = 3;
        int carpım = 1;
        while (carpım < 11) {
            System.out.print(sbt + "x" + carpım + "=" + sbt * carpım);
            carpım++;
            System.out.println();
        }
        //while do loop;
        int sb = 3;
        int crp = 1;
        do {
            System.out.print(sb + "x" + crp + "=" + sb * crp);
            crp++;
            System.out.println();
        } while (crp < 11);

       /*
       8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
          bırakarak yazdırmak için gereken kodu yazınız
        */

        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                System.out.print((i) + " ");//19 17 15 13 11 9 7 5 3
            }
        }
//while ile;
        int i = 20;

        while (i > 2) {
            if (i % 2 != 0) {
                System.out.print((i) + " ");//19 17 15 13 11 9 7 5 3
            }
            i--;
        }
//do while:
        int i10 = 20;
        do {
            if (i10 % 2 != 0) {
                System.out.println(i10 + " ");
            }
            i10--;
        } while (i10 > 2);
        System.out.println(i10 + " ");//19 17 15 13 11 9 7 5 3


    /*
    9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
    Örneğin; 'Ali Can?' ==> l*i*a*n*
*/
        String kck = "Ali Can";
        kck = kck.replaceAll("[A-Z]", "");
        System.out.println(kck);
        String bos = "";
        for (int k = 0; k < kck.length(); k++) {
            String r = kck.substring(k, k + 1);
            bos += r + "*";
        }
        System.out.println(bos);
        System.out.println();

//2.yol for icin:
        String kcck = "Ali Can";
        String rr = kcck.replaceAll("[A-Z]", "");

        for (int t = 0; t < rr.length(); t++) {
            System.out.print(rr.charAt(t) + "*");
        }
        System.out.println();


        //while ile;
        int l = 0;
        String isimm = "Ali Can";
        String boss = "";
        isimm = isimm.replaceAll("[A-Z]", "");

        while (l < isimm.length()) {

            String s2 = isimm.substring(l, l + 1);
            boss = boss + s2 + "*";
            l++;
        }
        System.out.println(boss);

        //Do while loop ile
        int n = 0;
        String isim = "Ali Can";
        String bs = "";
        isim = isim.replaceAll("[A-Z]", "");
        System.out.println(isim);
        do {
            String yıldız = isim.substring(n, n + 1);
            bs = bs + yıldız + "*";
            n++;
        } while (n < isim.length());

        System.out.println(bs);


/*10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8

 */
        double ondalık = 75.4238;
        String sy = String.valueOf(ondalık);
        System.out.println(sy);
        String sy1 = sy.split("\\.")[1];
        System.out.println(sy1);//4238
        String ekle = "";

        for (int k = 0; k < sy1.length(); k++) {
            String r = sy1.substring(k, k + 1);
            ekle = ekle + "*" + r;
        }
        System.out.println(ekle);//*4*2*3*8

        //whihe
        int k = 0;
        String yıldız = String.valueOf(ondalık);
        String yıldız1 = yıldız.split("\\.")[1];
        String bosss = "";
        while (k < yıldız1.length()) {
            String r2 = yıldız1.substring(k, k + 1);
            bosss += "*" + r2;
            k++;
        }
        System.out.println(bosss);

//do while loop
        int r = 0;
        String s3 = String.valueOf(ondalık);
        String yenis3 = s3.split("\\.")[1];
        String yenibos = "";

        do {
            String ryeni = yenis3.substring(r, r + 1);
            yenibos += "*" + ryeni;
            r++;
        } while (r < yenis3.length());
        System.out.println(yenibos);

        /*
        11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
         */
        String orginal = "Mark";
        String oTers = "";
//for:
        for (int m = orginal.length() - 1; m > -1; m--) {
            oTers += orginal.substring(m, m + 1) + "";
        }
        System.out.println(oTers);

//while:
        int m1 = orginal.length() - 1;
        while (m1 > -1) {

            oTers = oTers + orginal.substring(m1, m1 + 1);
            m1--;
        }
        System.out.println(oTers);


//do while:
        int n1 = orginal.length() - 1;
        String terss = "";
        do {
            terss = terss + orginal.substring(n1, n1 + 1);
            n1--;
        } while (n1 > -1);
        System.out.println(terss);

/*
12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
 */
        int rows = 4;
        int columns = 8;

        for (int m = 1; m <= rows; m++) {
            String ss = "";
            if ((m == 1 || m == rows)) {
                for (int o = 1; o <= columns; o++) {
                    ss += "A";
                }
                System.out.println(ss);
            } else {
                ss += "A";
                for (int o = 2; o <= columns - 1; o++) {
                    ss += "X";
                }
                ss += "A";
                System.out.println(ss);
            }

        }
//while ile
        int rows1 = 4, columns1 = 8, t = 1;
        while (t <= rows) {
            String ts = "";
            if (t == 1 || t == rows) {
                for (Integer q = 1; q <= columns; q++) {
                    ts = ts + "A ";
                }
                System.out.println(ts);
            } else {
                ts = ts + "A ";
                for (Integer m = 2; m < columns; m++) {
                    ts = ts + "X ";
                }
                ts = ts + "A ";
                System.out.println(ts);
            }
            t++;
        }
     /*
     13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız
      */
        //1.yol;
        int sum = 0;
        for (int m = 3; m < 15; m++) {
            sum += m;
        }
        System.out.println(sum);
        //2.yol
        int sum1 = 0;
        int baslangic = 3;
        while (baslangic < 15) {
            sum1 += baslangic;
            baslangic++;
        }
        System.out.println(sum1);
        //3.yol
        int sm = 0;
        int q = 3;
        do {
            sm = sm + q;
            q++;
        } while (q < 15);
        System.out.println(sm);

     /*
     14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız
      */
        //1.yol
        int carp2 = 1;
        for (int m = 3; m < 10; m++) {
            carp2 = carp2 * m;

        }
        System.out.println(carp2);

        //2.yol
        int carp1 = 1, d = 3;

        while (d < 10) {
            carp1 *= d;
            d++;
        }
        System.out.println(carp1);
        //3.yol
        int crpm = 1, o = 3;
        do {
            crpm *= o;
            o++;
        } while (o < 10);
        System.out.println(crpm);

       /* 15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
     kod yazınız
        */
        String ch = "";
        for (char z = 'C'; z >= 'A'; z--) {
            ch += z;
            System.out.println(z + " ");
        }
        String sd = "";
        char cha = 'C';
        while ('A' <= cha) {
            sd += cha;
            cha--;
        }
        System.out.println(sd);

        //3.yol
        char cc = 'C';
        String result = "";
        do {
            result = result + cc;
            cc--;
        } while (cc >= 'A');
        System.out.println(result);

       /*
       16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız
        */
        String str4 = "Ben ogrenmek istiyorum javayi";


        for (int m = str4.indexOf('m'); m < str4.length() - 1; m++) {
            if (m == str4.indexOf('m')) {
                str4 = str4.substring(str4.indexOf('m'));
                System.out.println(str4);
            }
        }
        //2.yol
        String str5 = "Ben ogrenmek istiyorum javayi";
        int b = str5.indexOf('m');
        while (str4.length() - 1 > b) {
            if (b == str5.indexOf('m')) {
                str5 = str5.substring(str5.indexOf('m'));
                System.out.println(str5);
            }
            b++;
        }
        //3.yol: do while
        String str6 = "Ben ogrenmek istiyorum javayi";
        int xy = str6.indexOf('m');
        do {

            if (xy == str6.indexOf('m')) {
                str6 = str6.substring(str6.indexOf('m'));
                System.out.println(str6);
            }
            xy++;
        } while (xy < str6.length() - 1);

        /*
        17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
         */
        int m = 785;
        int rakamlarToplami = 0;
        for (int u = m; u > 0; u = u / 10) {
            rakamlarToplami += u % 10;
        }
        System.out.println(rakamlarToplami);

        //2.yol
        int v = 982;
        int rkmtplm = 0;
        while (v > 0) {
            rkmtplm += v % 10;
            v = v / 10;
        }
        System.out.println(rkmtplm);

        //do ehile;
        int h = 987;
        int rtop = 0;
        do {
            rtop = rtop + h % 10;
            h = h / 10;
        } while (h > 0);
        System.out.println(rtop);

        /*
        18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
         */
        String word = "Javada hersey eglenceli";
        String smell = "";
        for (int u = 0; u < word.length(); u++) {
            smell = word.substring(u, u + 1);
            if (word.indexOf(smell) == word.lastIndexOf(smell)) {
                System.out.print(smell);
            }
        }
//2.yol
        int sw = 0;
        while (sw < word.length()) {
            smell = word.substring(sw, sw + 1);
            if (word.indexOf(smell) == word.lastIndexOf(smell)) {
                System.out.print(smell);
            }
            sw++;
        }

        //3.yol:
        int value = 0;
        do {
            smell = word.substring(value, value + 1);
            if (word.indexOf(smell) == word.lastIndexOf(smell)) {
                System.out.print(smell);
            }
            value++;
        } while (value < word.length());

    /*
    19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
    */
        String book = "Ben, aslında seviyorum javayı fakat; O sanki bence :)";

        book = book.replaceAll("\\p{Punct}", "").replaceAll("\\s", "");
        System.out.println(book);
        System.out.println(book.length());//41

        /*
        20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */

        int g = 6;
        String y = "";
        for (int u = 1; u <= g; u++) {
            for (int z = g; z >= u; z--) {
                y = y + "*";
            }
            System.out.println(y);
            y = "";
        }
        //2.yol:
        int rt = 6;
        String ret = "";
        for (int u = 0; u <= rt; u++) {
            for (int z = rt; z >= u; z--) {
                ret = ret + "*";
            }
            System.out.println(ret);
            ret = "";
        }
        /*
        21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
         */
        int tamSayi = 45645872;
        String rti = String.valueOf(tamSayi);
        int sumOfValueDigits = 0;
        for (int u = 0; u < rti.length(); u++) {
            String rnum = rti.substring(u, u + 1);
            if (rti.indexOf(rnum) == rti.lastIndexOf(rnum)) {
                sumOfValueDigits = sumOfValueDigits + Integer.valueOf(rnum);
            }
        }
        System.out.println(sumOfValueDigits);
     /*
       22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
     */
        for (int u = 3; u <10 ; u++) {
            if (u==5){
                continue;

            }
            System.out.print(u+" ");
        }
        /*
        23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
       Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
       olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
       yönlendiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı giriniz");
        int sayi=scan.nextInt();
        int count=0;
        if (sayi>0){
            if (sayi==1){
                System.out.println(sayi+ "sayi asal sayidir");
            }else{
                for (int u = 2; u <sayi ; u++) {
                    if (sayi%u==0){
                        System.out.println(sayi+" sayi asal sayi degildir");
                        count++;
                    }
                }
            }
            if (count==0){
                System.out.println(sayi+"sayi asaldir");
            }else{
                System.out.println(sayi+"asal sayi degildir");
                }
            }else System.out.println("pozitif bir tam sayi giriniz");

/*
24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
serinin 2 elemanı 1 ve 1 ile baslıyorsonraki sayı kendinden önceki sayının toplamı olur.
1+1=2   1+2=3     3+2=5      5+3=8    5+8 13   13+8 21
her zaman hafızada 2 sayı tutucaz bir değişkende int a=1,b=1;
ve birde
3.degişkenimiz olacak ve bu da 2 sayıyı topluycak; int c=a+b;
for un içine de ne kar sayı hesaplatmak ısteniyorsa o yazılır
1 1 2 3 5 8
a b c
  a b c
    a b c
      a b c(a+b)
      yeni durum;
      a=b;
      b=c;

 */
Scanner scan1=new Scanner(System.in);
        System.out.println("kac tane fibonacci sayisi gormek istiyorsunuz");
int number=scan1.nextInt();//
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");
        for (int u = 1; u <number-1 ; u++) {
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci+" ");
        }
/*
25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
için bir kod yazınız.
1+8+27:36
 */
int sayiBir;





































        }
    }

