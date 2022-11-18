package anaDers.day08StringManupulation;

public class SitringManupulation02 {
    public static void main(String[] args) {
        //ex 1: bir string deki space hariç kaç tane karakter kullanıdıgı gösteren kodu yazınız
        // "Ali okula gitti"--> 14 tane karakter var boşluklar satılmıyor.

        String str = "Ali okula gitti."; //spesifik karakteri silmek istiyorsan replace kull
        int num = str.replace("", "").length();
        System.out.println(num);
        //"replace" metodu bir string deki herhangi bir kartakteri veya karakterleri değiştirmek için kull


        //ex 2:bir stringdeki tüm "a" harflerini büyük "A" ya ceviriniz
        // TOUPPERCASE OLMAZ O TÜM KELİMEYİ BÜYÜK YAPAR BİZE İSE KÜÇÜKLER BÜYÜK HARFE CEVRİLECEK
        String s = "Ankara'nin tasina gozlerimin yasina bak";
        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);//AnkArA'NIN tAsınA gozlerimin yAsinA bAk

        //EX 3: BİR STRİNG DEKİ TUM "KARA" KELİMELERİNİN YERİNE "*" KOYUNUZ
        // "Kara kara düşünme Ankara"
        String t = "Kara kara düşünme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);//Kara * düşünme An* ==>>>> "K" harfi büyük oldugu için tanımlamaya uymadıgından almadı.

        //ex 4: bir stringteki tum sayıları "*" a cevirin
        //AC202117004 :AC**********


        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);//AC*********
/*
    Bir grup data'yı ifade eden kodlara "Regex" denir.
    "Regex" Regular Expressions'in kısaltılmış halidir.

    1)Tüm rakamlar ==> [0-9]
    2)Tüm küçük harfler ==> [a-z]
    3)Tüm büyük harfler ==> [A-Z]
    4)Tüm harfler ==> [a-zA-Z]
    5)Sesli harfler ==> [aeiouAEIOU]
    6)Space ==> [ ]
    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
        1)rakamlar hariç tüm karakterler ==>[^0-9]
        2)küçük harfler hariç tüm karakterler ==>[^a-z]
        3)büyük harfler hariç tüm karakterler ==>[^A-Z]
        4)TÜM HARFLER HARİF TÜM KARAKTERLER ==>[^a -A-Z]
        5)SPACE HARİÇ ==> [^ ]
 */

        //ex://Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        ////           tum karakterlerin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.//Ali 13 yasinda, dersem inanma!...
                replaceAll("[0-9]", " "). //Ali  yasinda, dersem inanma!...
                replace(" ", "").//Aliyasinda,derseminanma!...
                replaceAll("\\p{Punct}", "").//Aliyasindaderseminanma
                length();//Aliyasindaderseminanma== sadece karakter sayar "22" yazar
        System.out.println(sonuc);

//EX 6:Bir passwordun gecerli olup olmadıggını asagıdaki kurallara göre test eden kodu yazınız
        //1-space hariç en az 8 karakter olmalı
        //2- en bir sembol içermeli
        //3-enaz bir rakam içermeli
        //4-en az bir büyük harf içermeli
        // 5- en az bir küçük harf içermali

        String psw = "B78c? k!m";
        //1-space hariç en az 8 karakter olmalı
        boolean first = psw.replace(" ", "").length() > 7;

        //2- en bir sembol içermeli
        boolean second = psw.replaceAll("[0-9a9zA-Z ]", "").length() > 0;// !ve ? kalır yani 2 karakt kalır 2>0 true dur

        //3-enaz bir rakam içermeli
        boolean third = psw.replaceAll("[^0-9]", " ").length() > 0;// rakam hariç herseyii siler 2>0 true

        //4-en az bir büyük harf içermeli
        boolean fourth=psw.replaceAll("[^A-Z]", "").length()>0;
        //5- en az bir küçük harf içermali
        boolean fifth=psw.replaceAll("[^a-z]", "").length()>0;
        boolean pwdgecerli= first&&second&&third&&fourth&&fifth;
        if(pwdgecerli) {
            System.out.println("pwdgecerli");
        }else System.out.println("pwdgecerli gecerli değil");
        // ex 7: bir string deki noktalama işaretlerinin sayısını gösteren kodu yaz.
        String cumle="Sen yapmazsan, ben ?...";
        int number=  cumle.replaceAll("[^\\p{Punct}]", "").length();//5>0 true
        System.out.println(number);

//EX 8:VERİLEN BİR STRİNG "Al" ile baslıuyor ve "x" ile bitiyorsa ekrana harika yazdırın aksi halde normal yazdırın
        String v="Alex";
        boolean baslangıc= v.startsWith("Al");// bir stringin neyle basladığını kontrol eder
        boolean bitis= v.endsWith("x");// bir stringin neyle bittiğinı kontrol eder
        String snc=baslangıc&&bitis?"harika":"normal";
        System.out.println(snc);//harika


    }
}


