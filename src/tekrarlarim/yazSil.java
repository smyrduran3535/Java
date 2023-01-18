package tekrarlarim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class yazSil {
    public static void main(String[] args) {

        for (int i = 14; i > 5; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }


        }
        System.out.println();
        for (int i = 28; i <157 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //ex "Java" stringini "J*a*v*a" stringine ceviren kodu yaz
        String str="java";
        String str1="";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"*");
        }

        //ex: size verilen string de tekrarsız karaterleri ekrana yazdırınız
        //""=>HeAi
        String s="Hellooo Ali";
        for (int i = 0; i <s.length() ; i++) {
           char p= s.charAt(i);
            if (s.indexOf(p)==s.lastIndexOf(p)){
                System.out.println(p);
            }
        }




        }

    }

































