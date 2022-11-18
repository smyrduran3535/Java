package java_practiceStudent.forLoop;

public class C03ForLoop {
    public static void main(String[] args) {

//String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 'Ali Can?' ==> l*i*a*n*
        //1.yol:
        String s = "Ali Can";
        String t = "";
        s = s.replaceAll("[^a-z]", "");//kucuk harfler dısında herseyıın yerine bosluk koy
        for (int i = 0; i < s.length(); i++) {
            String r = s.substring(i, i + 1);
            t = t + r + "*";
        }
        System.out.println(t);

        //2:yol:
        String s1 = "Ali Can";
        String d = "";
        s1 = s1.replaceAll("[^a-z]", "");
        int n = 0;
        while (n < s.length()) {
            String e = s1.substring(n, n + 1);
            d = d + e + "*";
            n++;
        }
        System.out.println(d);
//do whl
        String s3 = "Ali Can";
        String l = "";
        s3 = s3.replaceAll("[^a-z]", "");
        int m = 0;
        while (m < s.length()) {

            m++;
        }

    }
}