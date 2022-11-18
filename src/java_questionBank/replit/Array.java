package java_questionBank.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

/*
*****Arrays 1****
Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

```
Test Data:
```

```
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
```

 */
        int[] arr = {1232, 1134, 2345, 1022};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String[] brr = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

    /*
    Array deki sayıları tolpayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int top = 0;
        for (int w : array) {
            top += w;
        }
        System.out.println(top);

/*
Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]
 */
        int[] arr1 = {20, 30, 25, 35, -16, 60, -100};
        int tplm = 0;
        double ortalama = 1;

        for (int w : arr1) {
            tplm += w;
            ortalama = tplm / arr1.length;
        }
        System.out.println(ortalama);

        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

```
Beklenen Çıktı:
```

```
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
```
         */
        int arr2[][] = new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2[i].length; k++) {
                System.out.print(" " + arr2[i][k]);
            }
            System.out.println("");
        }


        int[] array1 = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        Arrays.sort(array);
        int sayii=2020;
        System.out.println(Arrays.binarySearch(array1, 2020));


        System.out.println(Arrays.binarySearch(array1, 2010));
//Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        int[] Array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        Arrays.sort(Array);
        int a = Arrays.binarySearch(Array, 56);
        System.out.println(a);
        System.out.println("56 sayisi arrayin " + a + ".elemanı");
/*
Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]
 */
        int[] Arr = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(Arr);
        System.out.println(Arr[Arr.length - 2]);
//kac tane tek cift var
        int[] Arra = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int adet=0;
        for (int w:Arra) {
            if (w%2==0) {
                adet++;
            }
        }
        System.out.println("cift sayilar " +adet);

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        for(int i=0;i>=sentence.length();i++);
        String reversed = "";
        for (int i = (sentence.length()-1); i <=0 ; i++) {

        }

    }
}