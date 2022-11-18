package javaSlaytSorular;

public class IfStatement {
    public static void main(String[] args) {


     /*   //SORU-1 : KULLANICIDAN BİR TAM SAYI İSTEYİN TEK CİFT OLD. YAZD.

       int a=44;
       if(a%2==0){
            System.out.println("sayı çift");
        }
       //SORU-2: Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gün isimimlerini yazd.

     /* Scanner scan = new Scanner(System.in);
        System.out.println("gün ismini giriniz :");//Pazartesi
        String tamGün= scan.nextLine();
        char ilkHarf= tamGün.charAt(0);
        System.out.println(ilkHarf);//P


      */
//SORU-3:Kullanıcıdan gün ismini alın ve haftaiçi veya haftasonu old yazınız
/*
        Scanner sc = new Scanner(System.in);

        System.out.print("gün isimlerini giriniz:");
        char günIsmi = sc.next().charAt(0);
        System.out.println("pazartesi için->1 seciniz\nsalı için ->2 seciniz\ncarsamba için->3\nperşembe için->4 seciniz \ncuma için-> 5 seciniz \ncumartesi için->6 \npazar için->7 seciniz");
        int secim= sc.nextInt();
        if((secim>=1)&&(secim<=5)){
            System.out.println("haftaiçi");

        }else System.out.println("haftasonu");

 *///SORU-4:Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörthenin kare olup olmadıgını yaz

          /*  Scanner input = new Scanner(System.in);
            System.out.println("dikdörtgen uzunu kenarı giriniz:");
            double dikdrtgnUzunKenar = input.nextDouble();
            System.out.println("dikdörtgen kısa kenarı giriniz:");
            double dikdrtgnKısaKenar = input.nextDouble();
            System.out.println("kare kenarı giriniz:");
            double kareKenar = input.nextDouble();

            if (kareKenar == dikdrtgnKısaKenar) {
                System.out.println("dikdörtgen =kare");
            } else if (kareKenar == dikdrtgnUzunKenar) {
                System.out.println("dikdörtgen =kare olabilir");

            } else {
                System.out.println("kare dikdörtgene esit deil");
            }

/*SORU-5:Kullanıcıdan bir gün alın eger gün Cuma günü ise " Müslümanlar için kutsal gün" yazdırın.
            Cumartesi ise ekrana "Yahudiler için kutsal gün" yazdırın.eğer Pazar ise
            "Hristiyanlar için kutsal gün" yazdırın
 */

         /*   Scanner scan = new Scanner(System.in);
            System.out.println("bir gün giriniz :");
            String gün = scan.next();
            if (gün.equals("Cuma")) {
                System.out.println("Müslümanlar için kutsal gün");
            } else if (gün.equals("Cumartesi")) {
                System.out.println("Yahudiler için kutsal gün");
            } else if (gün.equals("Pazar")) {
                System.out.println("Hristiyanlar için kutsal gün");
            } else {
                System.out.println("doğru gün giriniz");
            }

          */
/*
//SORU-6 :Kullanıcıdan bir karakter girmesini  isteyin ve girelen karakterin harf olup olmadıgını yazdırın
            Scanner input = new Scanner(System.in);
            System.out.println("bir karakter giriniz ");
            String craktr = input.next();
            if (craktr.equalsIgnoreCase("A") || craktr.equalsIgnoreCase("Z")) {
                System.out.println("karakter; harftir");
            } else {
                System.out.println("karakter bir harf değildir");
            }

 //SORU-7:Kullanıcıya yaşını sorun eğer yas 65' den küçük ise : "emekli olamazsın,calısmalısın" yazdırın.
         //65'e esit veya büyük ise "emekli olabilirsin" yazdırın.

 */
/*
Scanner input = new Scanner(System.in);
            System.out.println("yasınızı giriniz :");
int yas= input.nextInt();
if(yas<65){
    System.out.println("emekli olamazsınız, calısmalısınız");
}else if(yas>=65){
    System.out.println("emekli olabilirsiniz");
}else {
    System.out.println("hatalı giriş yaptınız...");
}

/*SORU-8:Kullanıcıdan bir üçgenin üç kenar uzunulugu alın eger eger uc kenar uzunlugu birbirine eşitse ise
ekrana "eskenar ucgen "yazdırın. Diğer durumlarda ekrana eşkenar değil yazdırın.

//Scanner input= new Scanner(System.in);
            System.out.println("ücgeninin kenar uzunluklarını giriniz:");
            System.out.println("1.kenar uzunuğu =");
int knr1=input.nextInt();
            System.out.println("2.kenar uzunuğu =");
int knr2=input.nextInt();
            System.out.println("3.kenar uzunuğu =");
int knr3=input.nextInt();
 *
if(knr1==knr2&&knr3==knr1&&knr3==knr2){
    System.out.println("eşkenar üçgen");
} else {
    System.out.println("eşkenar değil");

}
*/

/*SORU-9 : Kullanıcıdan gün ismini yazmasını isteyin.Girilen isim geçerli bir gün ise gün isminin 1.,2. ve 3.
harflerini ilk harf büyük diğer ikisi küçük olarak yazdırın
 */

/*
 Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunNo= input.nextLine();

        if (gunNo.equalsIgnoreCase( "pazar")) {
            System.out.println("PAZar");
        } else if (gunNo.equalsIgnoreCase("pazartesi")) {
            System.out.println("PAZartesi");
        } else if (gunNo.equalsIgnoreCase("sali")) {
            System.out.println("SALi");
        } else if (gunNo.equalsIgnoreCase("carsamba")) {
            System.out.println("CARsamba");
        } else if (gunNo.equalsIgnoreCase("persembe")) {
            System.out.println("PERsembe");
        } else if (gunNo.equalsIgnoreCase("Cuma")) {
            System.out.println("CUMa");
        } else if (gunNo.equalsIgnoreCase("cumartesi")) {
            System.out.println("CUMartesi");
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }
 */
/*
SORU-10:Kullanıcıdan iki sayı isteyin.sayıların ikiside pozitif ise toplamlarını yazdırın.
eger sayıların ikiside negative ise sayıların carpımını yazdırın
sayıların ikisi farklı işaretlere sahipse "farklı işaretlerle işlem yapamazsın" yazdırın
sayılardan biri sıfara eşitse "sıfır çarpmaya göre yutan elemandır" yazdırın
 */
         /*   Scanner scan = new Scanner(System.in);
            System.out.println("sayı1'i giriniz :");
            double sayı1 = scan.nextDouble();
            System.out.println("sayı2'yi giriniz :");
            double sayı2 = scan.nextDouble();
            if (sayı1 > 0 && sayı2 > 0) {
                System.out.println("toplam :" + (sayı1 + sayı2));
            } else if (sayı1 < 0 && sayı2 < 0) {
                System.out.println("carpım :" + (sayı1 * sayı2));
            } else if ((sayı1 < 0 && sayı2 > 0) || (sayı1 > 0 && sayı2 < 0)) {
                System.out.println("farklı işaretlerle işlem yapamazsın");

            } else if ((sayı1 < 0 && sayı2 == 0) || (sayı1 > 0 && sayı2 == 0) ||
                    (sayı1 == 0 && sayı2 < 0) || (sayı1 == 0 && sayı2 > 0)) {
                System.out.println("sıfır çarpmaya göre yutan elemandır");
            } else {
                System.out.println("lütfen doğru giriş yapınız...");
            }

/*SORU-11:Kullanıcıdan 100 üzerinde notuu isteyin.Notu harf sistemine cevirip yazdırın
                               50'den küçük ise "D"
                               50-60 arası      "C"
                               60-80 arası      "B"
                               80-100 arası     "A"
 */
            /*
Scanner scanner= new Scanner(System.in);
            System.out.println("100 üzerinden notunuzu giriniz :");
int not= scanner.nextInt();
if(not<50) {
    System.out.println("D");
} else if (not>=50&&not<=60) {
    System.out.println("C");

}else if (not>60&&not<80) {
    System.out.println("B");
}else if (not>=80&&not<=100) {
    System.out.println("A");
}else {
    System.out.println("doğru not girişi yapınız...");
}

/*SORU-12 :Kullanıcıdan maas için bir teklif isteyin.asagıdaki değerlere göre cevap yazdırın
            Teklif 80.000'in üzerinde ise "kabul ediyorum"
            60.000-80.0000 arasında ise "konusabiliriz"
            60.000'in altında ise "maalesef kabul edemem" yazdırın
 */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("maaş için teklifinizi giriniz :");
        double teklif = scan.nextDouble();

        if (teklif>80000) {
            System.out.println("kabul ediyorum.");
        }
        else if ((teklif>=60000)&&(teklif<80000)) {
            System.out.println("Konuşbiliriz.");
        }
        else if(teklif<60000&&teklif<0){
            System.out.println("maalesef kabul edemem");
        }else System.out.println("lütfen gecerli bir maas giriniz");

 */






        }
    }

