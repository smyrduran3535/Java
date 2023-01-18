package tekrarlarim;

import static tekrarlarim.Varargs.*;

public class Runner {
    //method icinde olusturulan variablelara : Local variable lar denir
    //static olmayan classın ana scope u icinde tanımladıgımız variable lara :instance variablelar denir.degsklklere obje ile ulasılır.
    //instance variable ları obje ile kullanırız fakat sadece obje icinde degisilik yapabiliriz.variable ın kendisinde herhangi bir degisiklige
    //sebep olamayız
    //static variablelar : degisiklikler kalıcıdır.ulasılabilir
    public static String isim_ps="ali";
    public String isim_p="veli";

    static String isim_ds="Osman";
    String isim_d="Ayse";

    protected static String isim_pros="Fatma";
    protected String isim_pro="Zehra";

    private  static String isim_pris="Gulsum";
    private String isim_pri="Lale";
    //objeyi olusturunca isme ulasısırız . yoksa static olmadı icin ulasamayız.FAKAT:statisc olan variablelarda
    //degisiklik yapınca degisiklik kalıcı hale geliyor. fakat static olmayanlarda degisiklik yapamayız kalıcı olmaz. cunku obje ıle cagırıyoruz

    public static void main(String[] args) {
        System.out.println("isim_pris = " + isim_pris);//Gulsum
        isim_pris=isim_pris+"naz";
        System.out.println("isim_pris = " + isim_pris);//isim_pris = Gulsumnaz
        System.out.println("isim_pris +\"naz\" = " + isim_pris + "naz");//isim_pris +"naz" = Gulsumnaznaz

        Runner obje= new Runner();
        System.out.println("obje.isim_pri = " + obje.isim_pri);//Lale
        obje.isim_pri=obje.isim_pri+"naz";
        System.out.println(obje.isim_pri);//Lalenaz

        Runner obje2=new Runner();
        System.out.println("obje2.isim_pri = " + obje2.isim_pri);//obje2.isim_pri = Lale
        System.out.println("obje2.isim_pris = " + obje2.isim_pris);//obje2.isim_pris = Gulsumnaz

        System.out.println("ortalama(5,6,7,8,45,6,7) = " + ortalama(5, 6, 7, 8, 45, 6, 7));
        System.out.println("cikar(500,50,60,23,14,50,78,54) = " + cikar(500, 50, 60, 23, 14, 50, 78, 54));

    }

}
