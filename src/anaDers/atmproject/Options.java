package anaDers.atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'^###,##0.00");
    boolean flag = true;
    HashMap<Integer, Integer> data = new HashMap<>();

    //login metodu
    public void login() {
        System.out.println("TechProed ATM'e hosgeldiniz...");
        do {//bamkadaki kullanıcılar
            data.put(12345, 1234);
            data.put(23456, 2345);
            data.put(234567, 3456);
            data.put(45678, 4567);

            try {
                //hesapbiligielrini yanlıs girsin
                System.out.println("hesap numaranızı giriniz");//account ve pin var
                setAccountNumber(input.nextInt());
                System.out.println("pin numaranizi giriniz");
                setPinNumber(input.nextInt());
            } catch (Exception e){
                System.out.println("yanlıs karakter girdiniz! Lutfen dogru karakter giriniz veya cıkmak icin Q ya basınız");
                input.nextLine();
                String exit=input.next();
                if (exit.equalsIgnoreCase("q")){
                    flag=false;
                }
            }
            int count=0;
            for (Map.Entry<Integer,Integer> w:data.entrySet()){
                if (w.getKey().equals(getAccountNumber())&&w.getValue().equals(getPinNumber())){
                    getAccountTypes();//hesa islemlerine gideriz

                }else{
                    count++;//kisiyi hesapta bulamayınca arttırıyoruz 4 e kadar...o yuzden tekrardan if alırız
                }
                if (count==data.size()){
                    System.out.println("Yanlıs hesap numarası veya pin numarası girdiniz...");
                }
            }
        } while (flag);//kisi islemi istal ederse flag false cevrilir cıkar sistemden..false olursa islem oldugu gibi kalır..
        //true olursa islem devam eder
        setAccountNumber(input.nextInt());

    }

    //kisi kendi hesabına girdiginde islemler yapabilmeli
    //kisi geldiginde hesapları secebilmeli;yonlerdirme yapmalıyız
    //sectigi hesaptan ne yapmak istegini sorup yonlendirmeliyiz

    //checking hesap islemleri:vadesiz hesap islemleri
    public void checkingOperations() {
        do {
            displayMessage();


            //islemi baslatmak icin:secim yaptırmamız lazım
            int option = input.nextInt();

            if (option == 4) {
                break;//kisi cıkar ...breakler karısmamalı diye ayrı yaptık bunu swich dısında
            }
            switch (option) {
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye" + moneyFormat.format(getCheckingBalance()));
                    //neden variablen kendisini kullanmıyorz;bakiyede ne kadar oldugu gormemiz lazim..getter kullanmısdık
                    break;
                case 2:
                    getCheckingWithdraw();//filtreler verdigimiz rakamı
                    break;
                case 3:
                    getCheckingDepozit();
                    break;
                default:
                    System.out.println("Yanlis ssecenek.. Lutfen 1,2,3 veya 4 'u kullaniniz");

            }


        } while (true);
        getAccountTypes();
    }

    //saving bizim vadeli hesap islemleridir
    public void savingOperations() {
        do {
            displayMessage();
            int option = input.nextInt();
            if (option == 4) {
                break;//kisi cıkar ...breakler karısmamalı diye ayrı yaptık bunu swich dısında
            }
            switch (option) {
                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye" + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();//once gşrdşgşmşz rakamı filtreler sonra islem yapar
                    break;
                case 3:
                    getSavingDepozit();
                    break;
                default:
                    System.out.println("Yanlis ssecenek.. Lutfen 1,2,3 veya 4 'u kullaniniz");
            }
        } while (true);
        getAccountTypes();
    }

    //ilgili hesabi seciniz
    public void getAccountTypes() {
        System.out.println("İslem yapmak istediginiz hesabi seciniz?");
        System.out.println("1.Checking Account ");//vadesiz
        System.out.println("2.Saving Account ");//vadeli hesap
        System.out.println("3. exit");
        int option = input.nextInt();
   /* int option;
   try{  harf girerse eger
        option=input.nextInt();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }*/

        switch (option) {
            case 1:
                System.out.println("Checking/vadesiz hesabınızdasınız");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/vadeli hesabınızdasınız");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur ederiz");
                flag = false;
            default:
                System.out.println("Yanlis ssecenek.. Lutfen 1,2,3 veya 4 'u kullaniniz");
        }
    }
//kisi icin secenekleri goruntule
    public void displayMessage() {
        System.out.println("Option seciniz");
        System.out.println("1.View Balance ");//bakiyenizi kontrol ediniz,goruntuleyiniz
        System.out.println("2.Witdraw");//para cekme
        System.out.println("3.Depozit");//para yatirma
        System.out.println("4.Exit");//islem sonl.
    }
}