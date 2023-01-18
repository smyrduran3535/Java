package tekrarlarim.AccessModifilerInherştence;

public class BookClass {
    String adi,yazari;
    int yayinYili;

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;
    }

    public BookClass() {
    }
    public void yazdir() {
        System.out.println("yazdir metodu calisti");
        System.out.println("kitap "+adi+" yazar "+ yazari+ "yayin yili "+yayinYili);
    }
        @Override
        public String toString () {
            return "BookClass{" +
                    "adi='" + adi + '\'' +
                    ", yazari='" + yazari + '\'' +
                    ", yayinYili=" + yayinYili +
                    '}';
        }

    public static void main(String[] args) {
        BookClass obje1=new BookClass("Mor Salkimli Ev","HalideEdip Adivar",1980);
        System.out.println(obje1.toString());
        BookClass obje2= new BookClass("1984","George Orwell");
        System.out.println(obje2.toString());
        obje1.yazdir();
        obje2.yazdir();
    }
}
