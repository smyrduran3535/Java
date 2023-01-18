package y_calismalarim.oopOgrenme;

import tekrarlarim.AccessModifilerInherştence.Asistan;

public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan("Ahmat", "@wjaelklr", "21354543");
        //Akademisyen a = new Akademisyen("ASDA", "@usyerwıa", "454654", "mat bolum", "gorevler ", "[geometri analitilik]");

        //Ogretimuyesi w = new Ogretimuyesi("mehmet", "@gmail.com", "135435", "mat", "hoca", "b,lg", "dc,");
        Calisan d = new Calisan("mehmet", "@gmail.com", "135435");


        Asistan as = new Asistan("mehmet",  "@gmail.com", "135435", "kimya", "derse girmek", "analitik", "anorganik");
       //Calisan v = new Akademisyen("ASDA", "@usyerwıa", "454654", "mat bolum", "gorevler ", "[geometri analitilik]");
       //System.out.println(v.giris());
       //Calisan[] abc = {c, a, w, as};
       //Calisan.listele(abc);
    as.derseGir(5);


    }
}



