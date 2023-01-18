package okulProje2;

public class Ogretmen extends Kisi {
    private String bolum;
    private String sicilNo;

    public Ogretmen(){//hemen olustur hata vermez

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);//parent a goturur
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();//super eklersek;kisi classından ad soyad yas da gelecek/psrenttaki bilgilerde gelecek
    }


}
