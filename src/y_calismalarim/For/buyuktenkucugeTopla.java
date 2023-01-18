package y_calismalarim.For;

public class buyuktenkucugeTopla {
    /*
    100 den 0 a kadar 13 e tam bolunebilen sayıları ekrana yazdırın.buyukten kucuge dogru
     */
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 100; i >= 0; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
                toplam+=i;
            }
        }
        System.out.println(toplam);//364

    }
}
