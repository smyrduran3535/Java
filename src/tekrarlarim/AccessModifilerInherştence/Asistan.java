package tekrarlarim.AccessModifilerInherştence;

import y_calismalarim.oopOgrenme.Akademisyen;

public  class Asistan extends Akademisyen {
    private String yukseklisans;

    public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler, String yukseklisans) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
        this.yukseklisans = yukseklisans;
    }

    @Override
    public void derseGir(int dersSaati) {
        System.out.println(getAdSoyad()+" "+ getDersler()+" "+"dersine"+" "+dersSaati+ " saat "+ "asistan olarak  girdi");
    }

    public String giris(){
        return "Asistan"+super.giris();
}




}
