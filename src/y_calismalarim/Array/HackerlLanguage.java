package y_calismalarim.Array;

import java.util.Scanner;

public class HackerlLanguage {
    /*
    kullanicinin yazdigi metni 'hacker'larin konusma diline ceviren bir method(method ismi : hackerDili) yaziniz.
    hackerlar bazi harfleri sayilara cevirerek yazisabiliyorlar. genellikle cevirdikleri harfler su sekildedir:
    s->5
    a->4
    e->3
    i->1
    o->0
    test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3rs3y guz3l
    ipucu : harfleri degistirin ve ekrana yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumleyi giriniz");
        String cumle = scan.nextLine().toLowerCase();

        hackerDili(cumle);
    }

    private static void hackerDili(String cumle) {
        String[] str = new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            str[i] = cumle.substring(i, i + 1);

            if (str[i].contains("s")) {
                str[i] = "5";
            }
            if (str[i].contains("a")) {
                str[i] = "4";
            }
            if (str[i].contains("i")) {
                str[i] = "3";
            }
            if (str[i].contains("e")) {
                str[i] = "2";
            }
            if (str[i].contains("o")) {
                str[i] = "1";
            }
            System.out.print(str[i]);
        }

    }
}
