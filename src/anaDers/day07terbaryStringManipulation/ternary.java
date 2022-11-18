package anaDers.day07terbaryStringManipulation;

public class ternary {
    public static void main(String[] args) {
        //example: bir sayının pozitif olup olmadığını ekrana yazdıran bira code yazd

        //1.Way
        int a =-12;

        if(a>0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif değil");
        }
        //2.way
        String sonuc= a>0  ? "pozitif" : " pozitif değil";
        System.out.println("sonuc = " + sonuc);
        //2.Yol: ternary
        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc1 =     a>0      ?           "Pozitif"                    :            "Pozitif degil";



        //example 2 =iki sasyıdan küçük olanı yaz
        int b=12;
        int c=23;
        int min= b<c ?b:c;
        System.out.println(min);


// ex -3: verilen bir sayının mutlak degerini hesaplayan kodu yazınız
// (pozitif sayılarının mutlak degeri kendileridir.
// negatif sayıların mutlak degeri -1 ile carpılmış halidir)

        int d = -45;
        int abs=  d<0 ? -1*d: d;
        System.out.println("abs = " + abs);

//example-4: 2 tane sayı aynı işaretli ise bu sayıları carpınız farklı işaretli ise "işlem yapamam" mesajı veririniz.

        int e=12;
        int f=10;
        Object islem=(e>0 &&f>0)||(e<0&&f<0)? e*f:"işlem yapamam";
        System.out.println(islem);
/*ternary farklı data tipl. return ederse data tipini "O"bject" yapmalısın.
        java da her classın en az bir tane "parent" classı vardır
        SADECE---->>>>>>object classın parent classı yoktur.

 */

    }
}


