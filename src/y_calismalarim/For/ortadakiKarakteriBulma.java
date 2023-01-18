package y_calismalarim.For;

import java.util.Scanner;

public class ortadakiKarakteriBulma {
    /*
    input: celik
    output:l
    input: elif
    output: you entered wrong word :karakterin sayısı cift ise
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String word="";
        do{
            System.out.println("kelime giriniz");
            word=scan.nextLine();

            //girilen kelimenin uzunluguna gore yol alıcaz
            if (word.length()<3){
                System.out.println("girilen word 3 karakterden az");
            }
            if (word.length()%2 == 1 && word.length()>= 3){
                System.out.println("ortadaki karakter ="+ word.charAt(word.length()/2));
            }else System.out.println("you entered wrong word");

        }while(!(word.length()%2 == 1 && word.length()>=3));


    }
}
