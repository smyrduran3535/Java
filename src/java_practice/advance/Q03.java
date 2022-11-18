package java_practice.advance;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     *///1.yol:
       Scanner input=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        String str3=input.nextLine();
        for (int i = 0; i <str3.length() ; i++) {
            for (int j = 0; j <str1.length() ; j++) {
                if (str3.charAt(i)==str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }
            }
        }
        //2.yol:
        System.out.println("bir sitring giriniz");
        String str=input.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            int index='z'-str.charAt(i);//4 vericek
            System.out.print((char)('a'+index));
        }
            }

        }


