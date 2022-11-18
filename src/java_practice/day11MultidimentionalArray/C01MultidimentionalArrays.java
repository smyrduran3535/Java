package java_practice.day11MultidimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C01MultidimentionalArrays {
    public static void main(String[] args) {
        //kullanıcıdan alınan bir stringde gecen sesli harflri yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str=scan.nextLine();
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("a")||
                    arr[i].equalsIgnoreCase("e")||
                    arr[i].equalsIgnoreCase("u")||
                    arr[i].equalsIgnoreCase("o")||
                    arr[i].equalsIgnoreCase("i"))
            {
                System.out.println(arr[i]);
            }


        }

    }
}
