package y_calismalarim.oopOgrenme;

public abstract class Akademisyen extends Calisan {
    String bolum,gorevler;
    String dersler;

    public  void derseGir(int dersSaati){

    }

    @Override
    public String getAdSoyad() {
        return super.getAdSoyad();
    }

    public String giris(){
   return super.giris()+" A kapısından";

}

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }

    public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler = dersler;
    }
}
