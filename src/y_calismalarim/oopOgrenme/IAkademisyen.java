package y_calismalarim.oopOgrenme;

public class IAkademisyen implements ICalisan{
   private String adSoyad,bolum,gorevler;


public void giris(){
    System.out.println("giris yapıldı");
}
public void cikis(){
    System.out.println("cıkıs yapıldı");
}
public boolean yemek(int saat){
    System.out.println("yemek yendi");
   return false;
}
    public IAkademisyen(String adSoyad, String bolum, String gorevler) {
        this.adSoyad = adSoyad;
        this.bolum = bolum;
        this.gorevler = gorevler;
        System.out.println(this.okul);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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
}
