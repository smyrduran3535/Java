package ssg.Mr.CihanArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};
        System.out.println(arr1);//[Ljava.lang.String;@58ceff1
        System.out.println(Arrays.toString(arr1));
        int arr2[]= new int[4];
        arr2[1]=11;
        arr2[3]=12;
        System.out.println(Arrays.toString(arr2));//[0, 11, 0, 12]
        System.out.println(arr1[0]);//Ali
    }
}
