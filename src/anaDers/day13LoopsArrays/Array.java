package anaDers.day13LoopsArrays;

import java.util.Arrays;

public class Array {


        /*
            1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
              Bu yapilardan birisi de "Array" lerdir.
         */

    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?

        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

        //1.yoll

        int sum = 0;

        for (int i = 0; i < stdAges.length; i++) {
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.Yol: while-loop
        int i=0;
        int toplam = 0;

        while(i<stdAges.length){
            toplam = toplam + stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.Yol: do-while-loop
        int k=0;
        int s =0;

        do{
            s = s + stdAges[k];
            k++;
        }while(k<stdAges.length);
        System.out.println(s);

        //4.Yol: for each loop Array'lerde ve Collections'larda kullanilir
        int t = 0;
        for(int w : stdAges){
            t = t + w;
        }
        System.out.println(t);


        //ex 3:String bir Array oluşturunuz.
        //bu Arraye 5 tane isim yerleştiriniz.
        //bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int karakterSayilarTopl=0;
        for(String w:stdNames){
            karakterSayilarTopl=karakterSayilarTopl+w.length();
            System.out.println(karakterSayilarTopl);
        }

//ex 4: Char bir Array oluşturunuz.
        //bu Array e 5 eleman ekleyiniz
        //bu Array deki sadece büyük harfleri ekrana yaz
        char ch[]={ 'A','c','D','k','m' };

        for(char w:ch){
            if(w>='A'&& w<='Z'){
                System.out.println(w);
            }
        }





    }
}

