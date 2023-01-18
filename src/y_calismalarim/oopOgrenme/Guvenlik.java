package y_calismalarim.oopOgrenme;

public class Guvenlik extends Memurlar {
    String belge;


    public Guvenlik(String adSoyad, String eposta, String telefon, String belge) {
        super(adSoyad, eposta, telefon);
        this.belge = belge;
    }
}
