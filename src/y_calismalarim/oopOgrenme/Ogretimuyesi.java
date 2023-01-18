package y_calismalarim.oopOgrenme;

public abstract class Ogretimuyesi extends Akademisyen {
    String unvan;
    public void derseGir(int dersSaati){
        System.out.println(getUnvan()+ " "+ getAdSoyad()+" "+getDersler()+ " dersine girdi");
    }

    public Ogretimuyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler, String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Ogretimuyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler, String unvan, String derseGir) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
        this.unvan = unvan;

    }

    public String giris(){
        return this.unvan+super.giris();
}
}
