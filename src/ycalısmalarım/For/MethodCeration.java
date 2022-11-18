package ycalısmalarım.For;

import java.util.Scanner;

public class MethodCeration {
    //interview sorusu
    //reverse String:for kullan.method kullan
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();
        System.out.println("stirngin tersi "+reverseString(str));

        //StringBuılder ile
        StringBuilder yeni= new StringBuilder();
        yeni.append(str);
        String ters = yeni.reverse().toString();
        System.out.println(ters);
    }

    private static String reverseString(String str) {
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;

    }
}
