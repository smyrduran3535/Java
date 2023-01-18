package calısmalarım_kitap_youtobe.MethodOlusturma;
/*
1.isim girin
        sumeyra
        2.isim girin
        tugba
        3.isim girin
        sevgi
        isimler :
        sumeyra
        tugba
        sevgi

        Process finished with exit code 0

 */

public class C04dizi {
    public static void main(String[] args) {
        int dizi[] = new int[]{0, 0, 0};
        islemYap(dizi);
        for (int i : dizi) {
            System.out.println(i);
        }
    }

    static void islemYap(int dizi[]) {
        for (int i = 0; i < 3; i++) {
            dizi[i] = i * i;

        }
    }
}