package ycalısmalarım.Array;

import java.util.Arrays;

public class StringiArrayeChange {
    // "heySiri" ======> "ByeSiri" cevir

    public static void main(String[] args) {
        String str="HeySiri";

        str=str.replaceAll("Hey","Bye");
        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));//[B, y, e, S, i, r, i] :karakter karakter boldu ama bizim amacımz suan bu deil

        String[] brr=new String[1];//iki arrayi esitliyoruz
        brr[0]=str;//arayin 0. elemanını str ye esit olsun
        System.out.println(Arrays.toString(brr));//  [ByeSiri]
    }
}
