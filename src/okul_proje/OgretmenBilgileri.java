package okul_proje;

public class OgretmenBilgileri {
    /*
    isim,soyisim,yas,brans,telf
    Consct. olusturcaz
    toString metodu olusturcaz kolayca yazsın
     */
    String isim;
    String soyIsim;
    int yas;
    String brans;
    String telf;

    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String telf) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyIsim='" + soyIsim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntelf='" + telf + '\'' +
                '}';
    }
}

