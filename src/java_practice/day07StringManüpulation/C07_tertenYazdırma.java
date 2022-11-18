package java_practice.day07StringManüpulation;

import java.util.Scanner;

public class C07_tertenYazdırma {
    public static void main(String[] args) {


        //kullanıcıdan 4 harfli kelime isteyin
        //ve girilen kelimeyi tersten yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen dört karakterli bir kelime giriniz");

        String kelime=input.next();
        System.out.println(kelime.length());

        if(kelime.length()==4){

            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char üc=kelime.charAt(2);
            char dört=kelime.charAt(3);
            System.out.println("tersten yazılmıs hali " + dört+üc+iki+bir);

        }else if (kelime.length()>4){
            System.out.println("girdiğiniz kelime 4 karakterden fazla");
        }else if (kelime.length()<4){
            System.out.println("girdiğiniz kelime 4 karakterden az");
        }


        //isimimi tersten yazdırma

        String isim="Sumeyra";
        System.out.println(isim.length());

        char one=isim.charAt(0);
        char two=isim.charAt(1);
        char three=isim.charAt(2);
        char four=isim.charAt(3);
        char five=isim.charAt(4);
        char six=isim.charAt(5);
        char seven=isim.charAt(6);
        System.out.println("ters :"+ seven+six+five+four+three+two+one);


        String name="BEN NEYDİM NE OLDUM";
        System.out.println(name.length());

        char a=name.charAt(0);
        char b=name.charAt(1);
        char c=name.charAt(2);
        char d=name.charAt(3);
        char e=name.charAt(4);
        char f=name.charAt(5);
        char g=name.charAt(6);
        char h=name.charAt(7);
        char ı=name.charAt(8);
        char j=name.charAt(9);
        char k=name.charAt(10);
        char l=name.charAt(11);
        char m=name.charAt(12);
        char n=name.charAt(13);
        char p=name.charAt(14);
        char r=name.charAt(15);
        char o=name.charAt(16);
        System.out.println("ters :" + o+r+p+n+m+l+k+j+ı+h+g+f+e+d+c+b+a);


        String manolya="mandalina";

        System.out.println(manolya.length());
        char x=manolya.charAt(0);
        char y=manolya.charAt(1);
        char z=manolya.charAt(2);
        char w=manolya.charAt(3);
        char q=manolya.charAt(4);
        char s=manolya.charAt(5);
        char u=manolya.charAt(6);
        char i=manolya.charAt(7);
        System.out.println("ters :" + i+u+s+q+w+z+y+x);


    }
}
