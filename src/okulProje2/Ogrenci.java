package okulProje2;

public class Ogrenci extends Kisi{//hata vermedi cunku parametrasiz const.olusturduk
    private String ogrenciNo;
    private String sinif;
    //cons secerken extend yaptıgımız ilk cıkan parametreli olanı secicez
    //tekrardan soracak bu classdakilerde yapmak istediklerimizi

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);//bizi Kisi classındaki const.goturur
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }
    public Ogrenci(){//ekle hep sıkıntı cıkarmasın
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
