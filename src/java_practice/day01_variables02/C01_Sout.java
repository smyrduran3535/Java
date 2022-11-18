package java_practice.day01_variables02;

public class C01_Sout {
    public static void main(String[] args) {
        /*
   Soru-1 :Konsolda asagidaki ciktiyi yazdiriniz

  T
  E
  C
  H
  P
  R
  O

  E
  D
  U
  C
  A
  T
  I
  O
  N
   */

//1.YOL
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("N");
        System.out.println("O");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("İ");
        System.out.println("O");
        System.out.println("N");

        //2.YOL
        // Soru-1 : TECHPRO EDUCATION  ==>tek sout ile her hara alt alta gelecek sekilde ilk kelimeden sonra bosluk
// olacak sekilde yazdiran bir kod yaziniz
        System.out.println("T"+ "\nE"+"\nC"+"\nH"+"\nN"+"\nO"+"\nP"+"\nR"+"\nO"+" "+"\nE"+"\nD"+"\nI"+"\nC"+"\nA"+"\nT"+"\nI"+"\nO"+"\nN");
/*
        ctrl+alt+l==>sayfayi duzenler
    \n alt satira gecirir
    \t tab bosluk birakir
    \b gerisindeki harfi siler
     \\: :\ (ters slash) yazdirir   prints a back slash
      \': ' tek tirnak yazdirir.  prints single quote
      \" :"" cift tirnak yazdirir. : prints double quote

 */
        //kestirme ====   System.out.println("T\nE\nC\nH\nP\nR\nO\n \nE\nD\nU\nC\nA\nT\nI\nO\nN");



        //JAVA İLE GÜZEL DÜNYA HER KELİMESİNİ ALT ALTA GELİCEK ŞEKİLDE YAZD

        System.out.println("JAVA\n\nİLE\n\nGÜZEL\n\nDÜNYA");
        //kelimeler arsında bir tab boşluk olacak şekilde code yazı
        System.out.println("\tJAVA\tILE\tGUZEL\tDUNYA"); // yanyana boşluk bırakarak yazar:    JAVA	ILE	GUZEL	DUNYA


        System.out.println("java\bile\bguzel\bdunya");//javilguzedunya
        System.out.println("java \bile \bguzel \bdunya");//javaileguzeldunya



        //pazartesi kel,mesini alt alta yazdır
        System.out.println("\nP\na\nz\na\nr\nt\ne\ns\ni");

//SORU: "techpro" ile java cok 'kolay' yazdır

        System.out.println("\"Techpro\" ile java cok \'kolay\'");

        //

        System.out.println("\"maharet\" hiç  \'düşmemek\' değil;+ \n\n\n\ther düştüğünde kalabilmektir\"" );
/*
"maharet" hiç  'düşmemek' değil;


"her düştüğünde kalabilmektir
​
 */





    }
}
