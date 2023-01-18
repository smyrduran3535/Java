package okulProje2;

public class Kisi {
   private String adSoyad;
   private String kimlikNo;
   private int yas;//herkesin ortak ozelligi

    //cons. olust.

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }
//private yaptık getter setter ile degistiricez
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;//kullanmıycaz
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {//yas kont yap
        this.yas = yas;
    }
    //toSting ekleyelim

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }

}
