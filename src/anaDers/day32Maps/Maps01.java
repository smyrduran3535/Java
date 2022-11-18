package anaDers.day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //size verilen bir cumledeki her cumlenin kac kere kullanıldıgını gosteren kodu yazınız
        //"I like to move it, move it." ==> I=1,like=1,to=1,move=2,it=2
        //bu yapıyı gorunce aklımıza map gelicek;
        //eger kelimelerle calısacaksan noktalama isaretlrini sil
        String str = "I like to move it, move it.";

        //noktalama isaretlerini sil. benim gibi dudunsun
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);//I like to move it move it

        //keimelerini almak icin split metodunu kuyllan space ile; spacelerden kesicez ve array i alıcaz
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, it, move, it]

        //key value yapıcı lazım hashmap kullancaz hızlı calssın
        HashMap<String, Integer> gorunum = new HashMap<>();//suan bos ici for each kullanıp dolduralım

        //[I, like, to, move, it, move, it]
        for (String w : kelimeler) {//su kelımeyı aldıgında bak bakalım map de kullanılmıs mı diycez ,kelime kullanılmıssa value verir yoksa null verir

            Integer gorunumSayisi = gorunum.get(w);

            if(gorunumSayisi==null){
                gorunum.put(w, 1);
            }else{
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);// { I=1, like=1, to=1, move=2, it=2 }
        //degeri null degilse 1 arttılır

            }
        }



