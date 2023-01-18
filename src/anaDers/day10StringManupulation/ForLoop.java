package anaDers.day10StringManupulation;

public class ForLoop {
    public static void main(String[] args) {

        //loop=döngü:tekrarlı işler için kull.
        //ex 1: ekrana 5kere "hi" yaz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");//bu sist. her senaryoda calışmaz. bu yöntemde kodu tamir etmek cok zor.cod da tekrar iyi değil
        /*4 cesit loop var:
               1 for loop
               2 while loop
                3 do while loop
                4 for each loop:en gelişmiş loop

         */
        //ekrana 5 kere"Hi" yazd.
        //baslangıc degeri loop hangi şart altında calışacak INCEREMENT VEYA dECREMENT
        for (int i = 1; i < 6; i = i + 1) {
            System.out.println("Hi");
        }

        //ex: 4 den 7 ye kadar tüm tam sayıları ekrana yazdıran codu yaz.

        for (int i = 4; i < 8; i = i + 1) {
            //System.out.println(i);/alt alta yazar
            System.out.print(i + " ");//4 5 6 7
        }
        System.out.println();
        //inc:int i =12;       1)i=i+3  =   2)i+=3    3)sadece 1 ile arttırma da kullan: i++
        //çarpma da arttırma   1)i=i*3  =   2)i*=3
        //decrement
        /*
        int k=15;                                      bölme ile
        1)k=k-7;                                           k=k/3;
        2)k-=7;                                            k/=3;
        3)k--  : 1 ile azaltmak için
         */
        // 14 den 5 e kadar tüm tam sayıları yaz
        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");//14 13 12 11 10 9 8 7 6 5
        }
        //ex: 14 ten 5 e kadar tüm çift tamsayıları ekrana yazd.
        for (int i = 14; i > 4; i -= 2) {
            System.out.print(i + " ");// 14 12 10 8 6
        }
//2.yol matematıge gerek yok: ideal olan
        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //ex : 28den 157e kadar tüm tek tamsayıları yazdıran kodu yaz
        for (int i = 28; i < 157; i ++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        //ex "Java" stringini "J*a*v*a" stringine ceviren kodu yaz
        String str="Java";//stringlerde index 0 dan baslar
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"*");//J*a*v*a*
        }
//ex: size verilen string de tekrarsız karaterleri ekrana yazdırınız
        //"Hellooo Ali"=>HeAi

        String s="Hellooo Ali";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }



    }
}


