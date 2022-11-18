package java_practiceStudent.forLoop;

public class C01ForLoop {
    public static void main(String[] args) {

        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
// Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.
        String str = "anna";
        String r = "";
        for (int i = str.length() - 1; i > -1; i--) {
            String c = str.substring(i, i + 1);//stringsin elemanlarını/karakterlerini almak icin

            r = r + c;
        }
        if (str.equals(r)) {
            System.out.println(str + "=polindromdur");
        } else {
            System.out.println(str + " =polindrom degildir");
        }
//while ile
        String str1 = "anna";
        String r1 = "";
        int i = str1.length() - 1;
        while (i > -1) {
            String c1 = str1.substring(i, i + 1);
            r1 = r1 + c1;

            i--;
        }
        if (str1.equals(r1)) {
            System.out.println(str1 + "=polindromdur");
        } else {
            System.out.println(str1 + " =polindrom degildir");
        }

        //
        String str2 = "anna";
        String r2 = "";
        int k = str1.length() - 1;
        do {
            String c2 = str2.substring(k, k+ 1);
            r2 = r2 + c2;
k--;
        } while (k > -1);

        if (str2.equals(r2)) {
            System.out.println(str2 + "=polindromdur");
        } else {
            System.out.println(str2 + " =polindrom degildir");
        }

    }

}