package y_calismalarim.oopOgrenme;

public class Calisan {
  protected String adSoyad,eposta, telefon;


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

       public String giris(String str){
            return this.adSoyad+"  giris yaptı";
       }

    public String giris(){
      return this.adSoyad + " giris yapti";
    }
    public static void listele(Calisan[] girisyapanlar){
        for (Calisan w:girisyapanlar){
            //w= "ASDA","@usyerwıa","454654","mat bolum","gorevler ","[geometri analitilik]
            System.out.println(w.giris());
        }

    }

}
