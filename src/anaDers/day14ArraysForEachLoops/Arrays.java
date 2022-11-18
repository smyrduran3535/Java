package anaDers.day14ArraysForEachLoops;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
         /*
        arrayslerin içine sadece primitive data tipleri ve "referanslar"(adres) yerleştiirilir.baska birşey konamaz
         */

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "suprise you";
        System.out.println(str);//[Ljava.lang.String;@19dfb72a >>>> referanstır bu

//dersek ki stringe cekir öylle yazdır verir o zaman
        System.out.println(java.util.Arrays.toString(str));//[Java, did, suprise you]


//ex: string bir arrays oluşt. "Tom"dan ve "Tom"dan önceki tüm elemanları   ekrana yazd
        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr) {
            System.out.print(w + " ");//Jane Mark Christopher Tom
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();


        //ex: string bir arrays oluşt. "Tom" ve "Jane" hariç tüm elemanları   ekrana yazd
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {
            //if(!w.equals("Tom")&&w.equals("Jane")
            if (w.equals("Jane") || w.equals("Tom")) {// TRUE &&FALSE VERECEGİ İÇİN :FALSE OLUR CALIŞMAZ. ÇALIŞMASI İÇİN BİZE TRUE LAZIM..
                // BUNUN İÇİN && YERİNE || KULLANILIR. CONTINUE KULLANILIRIZ KIRMAK İSTEMİYORUZ CÜNKÜ LOOPU BREAK İLE
                continue;
            }
            System.out.print(w + " ");//Mark Christopher Ali Rojda
        }
        /*EXAMPLE 3:
        kullanıcı ile beraber bir array olusturunuz
        bir ögretmanin sinifindaki öğrencilerinin isimlerini applicationa yuklemesini saglayan kodu yazınız:
         */

        Scanner input=new Scanner(System.in);
        System.out.println("kac ogranciismi gireceksiniz");//data sayısı(kac öğrenci) isimini girecegini belirlemeden array olusturamam
        int numOfStd=input.nextInt();
        String names[]=new String[numOfStd];
        //tekrarlı işl oldugu için for loop kull.caz
        for(int i=1; i<=numOfStd;i++){
            System.out.println("lütfen "+i+".öğrenci ismini giriniz");//mesaj vericez dinamic mesaj

           /* String stdName=input.next();
            names[i-1]=stdName;// ögrencini isimini ilk indexe yerlestiriyoruz. her zaman index sıra numarasından azdır.
            // kullanıcıdan datayı al conteynera koy.bunun için input kullan*/
            names[i-1]=input.next();//direk bunu yaz daha kolay kısa.arrayle yaparsın işi(i:sıra numarası,1:index)
            //loop bitti burda
            System.out.println("girisi sonlandırmak için q harfine basınız.deam etmak icin herhangi bir tusa bas ");
            //yazarken mola verebiliriz
            //bütün hepsini girmek istemedik diyelim bunu yazabiliriz
            //q dersek null verecek kalan sayıyı
            char exit=input.next().charAt(0);
            if(exit=='Q'||exit=='q'){
                break;
            }
        }
        System.out.println(java.util.Arrays.toString(names));
/*
 //Arrays'lerin icine "primitive data type" leri ve "reference"(adres) lar konabilir.

    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : arr){
            System.out.print(w + " ");
            if(w.equals("Tom")){
                break;
            }
        }

        System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : brr){
            if(w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();

        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )
        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for(int i=1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");
            String stdName = input.next();
            if(stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;
        }
        System.out.println(Arrays.toString(names));
 */


    }
}
